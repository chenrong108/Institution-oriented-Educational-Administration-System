package com.scnu.teach.service;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.joda.time.DateTime;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.scnu.ppt.bean.Constant;
import com.scnu.ppt.bean.Lecture;
import com.scnu.ppt.bean.LectureExample;
import com.scnu.ppt.bean.MyThread;
import com.scnu.ppt.bean.PPTMessage;
import com.scnu.ppt.bean.PptInfo;
import com.scnu.ppt.bean.PptInfoExample;
import com.scnu.ppt.bean.PptInfoExample.Criteria;
import com.scnu.question.mapper.LectureMapper;
import com.scnu.question.mapper.PptInfoMapper;
import com.scnu.service.JedisClientSingle;
import com.scnu.util.IDUtils;

@Service
public class PPTService {
	
	@Autowired
	private LectureMapper lectureMapper;
	
	@Autowired
	private PptInfoMapper pptInfoMapper;
	
	@Autowired
	private JedisClientSingle jedisClientSingle;
	
	// 使用线程池
	private ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
	
	// 获得上传PPT文件的路径   下载路径、删除路径都是这个
	public String uploadPPTFile(MultipartFile uploadFile, String orginalFileName, Integer pptId, Integer userId) {
		
		
		if(!uploadFile.isEmpty()){
        String Base_URL = Constant.ROOT_PATH + File.separator + Constant.UPLOAD_ROOT_PATH +  File.separator + Constant.UPLOAD_PPT_PATH;
        Base_URL = Base_URL + new DateTime().toString("/yyyy/MM/dd");
        String oldName = uploadFile.getOriginalFilename();
        String newName = IDUtils.genImageName();
        newName = newName + oldName.substring(oldName.lastIndexOf("."));
        
        File serverFile = UploadFileService.createServerFile(Base_URL, newName);
        
        try {
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
			int length=0;
			byte[] buffer = new byte[1024];
			System.out.println("文件的长度 : " + uploadFile.getSize());
			System.out.println("123");
			InputStream inputStream = uploadFile.getInputStream();
			System.out.println("456");
			while ((length = inputStream.read(buffer)) != -1) {
				stream.write(buffer, 0, length);
			}
			stream.flush();
			stream.close();
			
			System.out.println("文件上传完成，路径为:" + serverFile.getAbsolutePath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        // 文件的真实路径，不需要给回前端
        String url = Base_URL + File.separator + newName;
       
		return url;
		}
		
		// 不是文件的处理
		return null;
	}
	
	// 删除上传的文件 参数为文件的路径
	public boolean deletePPTFile(String url) {
		
		File file = new File(url);
		
		if (!file.exists()) {
	            System.out.println("删除文件失败:" + url + "不存在！");
	            return false;
	        } else {
	            if (file.delete()) {
	            	System.out.println("删除文件成功");
	                return true;
	            }
	            else {
	                
	            	System.out.println("删除文件失败");
	            	return false;
	            }
	        }
		
	   }
	
	
	// POI PPT转JPEG服务
	public static boolean createPPTImage(FileInputStream in, String ImageUrl, Integer pptId, Integer userId){
		
//      ppt大小自适应		
//	    Integer imgWidth=960;  // 960
//	    Integer imgHeight=540;  // 540
        
        try {
      	  
      	  XMLSlideShow xmlSlideShow=new XMLSlideShow(in);
      	 // 获取ppt的高度，宽度
    	  Dimension pgsize = xmlSlideShow.getPageSize();
    	  
      	  List<XSLFSlide> slides=xmlSlideShow.getSlides();
            XSLFSlide slide=slides.get(0);
            CTSlide rawSlide=slide.getXmlObject();
            CTGroupShape gs = rawSlide.getCSld().getSpTree();
            CTShape[] shapes = gs.getSpArray();
            for(CTShape shape : shapes) {
          	  CTTextBody tb = shape.getTxBody();
          	  if(null == tb)
          		continue;
          	  
          	  CTTextParagraph[] paras = tb.getPArray();
          	  
          	  String xmlFontFormat1="<xml-fragment xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\" xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\" xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\">";
          	  String xmlFontFormat2="<a:rPr lang=\"zh-CN\" altLang=\"en-US\" dirty=\"0\" smtClean=\"0\"> ";
          	  String xmlFontFormat3="<a:latin typeface=\"+mj-ea\"/> ";
          	  String xmlFontFormat4="</a:rPr>";
          	  String xmlFontFormat5="</xml-fragment>";
          	  StringBuffer xmlFontFormatStringBuffer=new StringBuffer();
          	  xmlFontFormatStringBuffer.append(xmlFontFormat1);
          	  xmlFontFormatStringBuffer.append(xmlFontFormat2);
          	  xmlFontFormatStringBuffer.append(xmlFontFormat3);
          	  xmlFontFormatStringBuffer.append(xmlFontFormat4);
          	  xmlFontFormatStringBuffer.append(xmlFontFormat5);
          	  
          	  CTTextFont font=CTTextFont.Factory.parse(xmlFontFormatStringBuffer.toString());
                
          	  for(CTTextParagraph textParagraph : paras) {
          		  CTRegularTextRun[] textRuns = textParagraph.getRArray();
          		  for (CTRegularTextRun textRun : textRuns){
          			  CTTextCharacterProperties properties=textRun.getRPr();
          			  properties.setLatin(font);
          		  }
          	  }    
            }
                 
            
            BufferedImage img=new BufferedImage(pgsize.width,pgsize.height, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics=img.createGraphics();
            graphics.setPaint(Color.WHITE);
            graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));
            slide.draw(graphics);
            FileOutputStream out = new FileOutputStream(ImageUrl);
            javax.imageio.ImageIO.write(img, "jpeg", out);
            out.close();
            // 记得关闭流， 否则删除失败
            in.close();
            
      	  
      	  System.out.println("缩略图成功!");
      	  return true;
        }catch(Exception e) {
      	  e.printStackTrace();
      	  return false;
        }

     }
		

	// 上传并且缩略图片 异步线程执行
	public PptInfo processPPT(MultipartFile uploadFile, Integer pptId, Integer userId) {
		
		String pptUrl = uploadPPTFile(uploadFile, uploadFile.getOriginalFilename(), pptId, userId);
		
		// 生成唯一的图片路径
		String ImageUrl = Constant.ROOT_PATH + File.separator + Constant.UPLOAD_ROOT_PATH + File.separator + Constant.UPLOAD_IMAGE_PATH;
		ImageUrl = ImageUrl + new DateTime().toString("/yyyy/MM/dd");
	    String fileName = IDUtils.genImageName() + ".jpeg";
	    
	    // 真实访问的路径
	    String RealUrl = Constant.BASE_URL + "/" + Constant.UPLOAD_IMAGE_PATH + new DateTime().toString("/yyyy/MM/dd");
	    RealUrl = RealUrl + "/" + fileName;
	    
	    // 创建目录
	    UploadFileService.mkDir(ImageUrl);
	    ImageUrl = ImageUrl + File.separator + fileName;
		
		try {
			FileInputStream in = new FileInputStream(pptUrl);
			createPPTImage(in, ImageUrl, pptId, userId);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		PptInfo pptInfo = new PptInfo();
		pptInfo.setPptId(pptId);
		pptInfo.setUserId(userId);
		pptInfo.setPptImg(RealUrl);
		pptInfo.setPptHref(pptUrl);
		pptInfo.setPptLocalImg(ImageUrl);
		
		System.out.println("图片缩略完成 : " + ImageUrl);
		
		// 来到这一步意味着 压缩已经成功   更新数据库的内容
		System.out.println("pptId = " + pptInfo.getPptId());
		System.out.println("userId = " + pptInfo.getUserId());
		
		// 返回一个 PptInfo
		return pptInfo;
	}
	
	// 得到H5Url
	
	// 创建一个PptInfo信息并且响应
	public PptInfo createPPTMessage(Integer userId, MultipartFile file, Lecture lecture) {
		
		PptInfo pptInfo = new PptInfo();
		
		// 随机数生成pptId
		Integer pptId = new Random().nextInt(500000);
		
		System.out.println("生成的pptId = " + pptId);
		
		// 创建时间
		Date createDate = new Date();
		
		String pptName = file.getOriginalFilename();
		
		lecture.setPptId(pptId);
		lecture.setUserId(userId);
		lecture.setCreateTime(createDate);
		
		pptInfo.setPptId(pptId);
		pptInfo.setUserId(userId);
		pptInfo.setPptName(pptName);
		pptInfo.setPptPreviewPic(Constant.CONTENT_MAKING);
		
		if(lecture.getBusinessId().equals(1)) {
			pptInfo.setPptImg(Constant.TEN);
		}else if(lecture.getBusinessId().equals(2)) {
			pptInfo.setPptImg(Constant.XIAO_PEI_YOU);
		}else if(lecture.getBusinessId().equals(3)) {
			pptInfo.setPptImg(Constant.TWO_TEACHER);
		}else {
			pptInfo.setPptImg(Constant.TEN);
		}	
		
		// 插入lecture的表
		lectureMapper.insert(lecture);
		
		
		// 插入ppt_info的表
		pptInfoMapper.insert(pptInfo);
		
		// 异步调用文件上传功能以及图片缩略服务
		MyThread thread = new MyThread(file, pptId, userId);
		newCachedThreadPool.execute(thread);
		
		// 把userId的字段置空
		pptInfo.setUserId(null);
		
		return pptInfo;
		
	}
	
	
	// 获取用户的ppt列表信息，需要已经知道userId的值
	public PPTMessage getPPTMessageList(Lecture record) {
		
		PPTMessage pptMessage = new PPTMessage();
		
		Integer userId = record.getUserId();
		
		// 查询 pptIdList
		List<Integer> preparedIds = lectureMapper.selectByLectureSelective(record);	
	
		
		// 查询 pptInfoList  根据 pptId、userId
		List<PptInfo> prepareList = new ArrayList<PptInfo>();
		
		for(Integer pptId : preparedIds) {
			PptInfo pptInfo = pptInfoMapper.selectBypptIdAnduserId(pptId, userId);
			prepareList.add(pptInfo);
		}
		if(prepareList.size() == 0) {
			prepareList = null;
		}
		
		pptMessage.setPrepareIds(preparedIds);
		pptMessage.setPrepareList(prepareList);
		
		return pptMessage;
		
	}
	
	public boolean deletePPT(Integer pptId, Integer userId) {
		
		PptInfoExample example = new PptInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andPptIdEqualTo(pptId);
		criteria.andUserIdEqualTo(userId);
		List<PptInfo> list = pptInfoMapper.selectByExample(example);
		PptInfo pptInfo = list.get(0);
		
		String pptUrl = pptInfo.getPptHref();
		String imageUrl = pptInfo.getPptLocalImg();
		
		// 删除两个文件
		if(pptUrl != null) {
			System.out.println("我被删除了");
			deletePPTFile(pptUrl);
			deletePPTFile(imageUrl);
		}else {
			return false;
		}
		// 删除记录两个记录
		pptInfoMapper.deleteByExample(example);
		
		LectureExample example2 = new LectureExample();
		com.scnu.ppt.bean.LectureExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andPptIdEqualTo(pptId);
		criteria2.andUserIdEqualTo(userId);
		lectureMapper.deleteByExample(example2);
		
		
		return true;
	}
	
	// 根据pptId List获取内容
	public List<PptInfo> getPptInfoList(List<Integer> list, Integer userId){
		
		List<PptInfo> pptInfoList = new ArrayList<PptInfo>();
		
		for(Integer pptId : list) {
			PptInfo pptInfo = pptInfoMapper.selectBypptIdAnduserId(pptId, userId);
			pptInfoList.add(pptInfo);
		}
			
		return pptInfoList;
	}
	
	// 获取ppt标题内容
		public String getPptInfoDetail(Integer pptId, Integer userId){
			
			LectureExample example = new LectureExample();
			com.scnu.ppt.bean.LectureExample.Criteria criteria = example.createCriteria();
			criteria.andPptIdEqualTo(pptId);
			criteria.andUserIdEqualTo(userId);
			List<Lecture> list = lectureMapper.selectByExample(example);
			
			// 如果查询不到数据结果
			if(list == null)
			return null;
			
			Lecture lecture = list.get(0);
			
			String year = jedisClientSingle.hget("yearId", lecture.getYearId()+"");
			String section = jedisClientSingle.hget("sectionId", lecture.getSectionId()+"");
			String subject = jedisClientSingle.hget("subjectId", lecture.getSubjectId()+"");
			String productLine = jedisClientSingle.hget("productLineId", lecture.getProductLineId()+"");
			String grade = jedisClientSingle.hget("gradeId", lecture.getGradeId()+"");
			
			String detail = year + "_" + section + "_" + subject + "_" + productLine + "_" + grade;
			
			// 高考的情况
			if(lecture.getGradeId().equals(12))
			return detail;
			
			// 非高考的情况
			String publishVersion = jedisClientSingle.hget("publishVersionId", lecture.getPublishVersionId()+"");
			String season = jedisClientSingle.hget("seasonId", lecture.getSeasonId()+"");
			detail = detail  + "_" + publishVersion + "_" + season;
			
			return detail;
		}
		
	// 获取下载路径
	public PptInfo getDownLoadUrl(Integer pptId, Integer userId) {
		
		PptInfoExample example = new PptInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andPptIdEqualTo(pptId);
		criteria.andUserIdEqualTo(userId);
		
		List<PptInfo> list = pptInfoMapper.selectByExample(example);
		
		if(list == null) {
			return null;
		}
		
		return list.get(0);
	}
	
}
