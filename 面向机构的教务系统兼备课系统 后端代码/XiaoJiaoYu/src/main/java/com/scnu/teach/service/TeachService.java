package com.scnu.teach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.bean.Business;
import com.scnu.bean.Cache;
import com.scnu.bean.Corporation;
import com.scnu.bean.Note;
import com.scnu.bean.Section;
import com.scnu.bean.TeachMessage;
import com.scnu.dao.BusinessMapper;
import com.scnu.dao.SectionMapper;
import com.scnu.service.JedisClientSingle;
import com.scnu.teach.mapper.AdaptiveareainfoMapper;
import com.scnu.teach.mapper.ClasstypeinfoMapper;
import com.scnu.teach.mapper.CorporationinfoMapper;
import com.scnu.teach.mapper.GradeinfoMapper;
import com.scnu.teach.mapper.MaterialtypeinfoMapper;
import com.scnu.teach.mapper.ProductlineinfoMapper;
import com.scnu.teach.mapper.PublishversionlistMapper;
import com.scnu.teach.mapper.ReviewprogressinfoMapper;
import com.scnu.teach.mapper.SeasoninfoMapper;
import com.scnu.teach.mapper.SimpleassembleMapper;
import com.scnu.teach.mapper.TextbooktypeinfoMapper;
import com.scnu.teach.mapper.YearinfoMapper;
import com.scnu.teach.pojo.Adaptiveareainfo;
import com.scnu.teach.pojo.AdaptiveareainfoExample;
import com.scnu.teach.pojo.Classtypeinfo;
import com.scnu.teach.pojo.ClasstypeinfoExample;
import com.scnu.teach.pojo.Corporationinfo;
import com.scnu.teach.pojo.CorporationinfoExample;
import com.scnu.teach.pojo.CorporationinfoExample.Criteria;
import com.scnu.teach.pojo.Gradeinfo;
import com.scnu.teach.pojo.GradeinfoExample;
import com.scnu.teach.pojo.Materialtypeinfo;
import com.scnu.teach.pojo.MaterialtypeinfoExample;
import com.scnu.teach.pojo.Productlineinfo;
import com.scnu.teach.pojo.ProductlineinfoExample;
import com.scnu.teach.pojo.Publishversionlist;
import com.scnu.teach.pojo.PublishversionlistExample;
import com.scnu.teach.pojo.Reviewprogressinfo;
import com.scnu.teach.pojo.ReviewprogressinfoExample;
import com.scnu.teach.pojo.Seasoninfo;
import com.scnu.teach.pojo.SeasoninfoExample;
import com.scnu.teach.pojo.Simplebookversionlist;
import com.scnu.teach.pojo.Simplesectionlist;
import com.scnu.teach.pojo.Simplesubjectlist;
import com.scnu.teach.pojo.Textbooktypeinfo;
import com.scnu.teach.pojo.TextbooktypeinfoExample;
import com.scnu.teach.pojo.Yearinfo;
import com.scnu.teach.pojo.YearinfoExample;

@Service
public class TeachService {
	
	@Autowired
	private CorporationinfoMapper corporationinfoMapper;
	
	@Autowired
	private JedisClientSingle jedisClientSingle;
	
	@Autowired
	private SectionMapper sectionMapper;
	
	@Autowired
	private BusinessMapper businessMapper;
	
	@Autowired
	private YearinfoMapper yearinfoMapper;
	
	@Autowired
	private ProductlineinfoMapper productlineinfoMapper;
	
	@Autowired
	private SelectService selectService;
	
	@Autowired
	private SeasoninfoMapper seasoninfoMapper;
	
	@Autowired
	private GradeinfoMapper gradeinfoMapper;
	
	@Autowired
	private ClasstypeinfoMapper classtypeinfoMapper;
	
	@Autowired
	private MaterialtypeinfoMapper materialtypeinfoMapper;
	
	@Autowired
	private TextbooktypeinfoMapper textbooktypeinfoMapper;
	
	@Autowired
	private AdaptiveareainfoMapper adaptiveareainfoMapper;
	
	@Autowired
	private ReviewprogressinfoMapper reviewprogressinfoMapper;
	
	@Autowired
	private SimpleassembleMapper simpleassembleMapper;
	
	@Autowired
	private PublishversionlistMapper publishversionlistMapper;
	
	// 得到年级学科
	public List<Section> getSectionList(Integer userId) {
		return sectionMapper.queryForList(userId);
	}
	
    // 得到类型公司
	public List<Business> getBusinessList(){
		return businessMapper.queryForList();
	}
	
	// 获得年份
	public List<Yearinfo> getYearinfoList(){
		YearinfoExample example = new YearinfoExample();
		return yearinfoMapper.selectByExample(example);
	}
	
	// 获得长短期
	public List<Productlineinfo> getProductlineinfoList(){
		ProductlineinfoExample example = new ProductlineinfoExample();
		return productlineinfoMapper.selectByExample(example);
	}
	
	// 获得出版社的信息
	public  List<Publishversionlist> getPublishVersionList(Integer sectionId, Integer subjectId){
		return simpleassembleMapper.getPublishVersionList2(sectionId, subjectId);
	}
	
	// 获得假期的信息
	public List<Seasoninfo> getSeasoninfoList(){
		SeasoninfoExample example = new SeasoninfoExample();
		return seasoninfoMapper.selectByExample(example);
	}
	
	// 获得小学初中年级的信息
	public List<Gradeinfo> getGradeinfoList(Integer type){
		GradeinfoExample example = new GradeinfoExample();
		com.scnu.teach.pojo.GradeinfoExample.Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(type);
		return gradeinfoMapper.selectByExample(example);
	}
	
	// 获得高中的信息
		public List<Gradeinfo> getGradeinfoList2(Integer type){
			GradeinfoExample example = new GradeinfoExample();
			com.scnu.teach.pojo.GradeinfoExample.Criteria criteria = example.createCriteria();
			criteria.andTypeLessThanOrEqualTo(17);
			return gradeinfoMapper.selectByExample(example);
		}
	
	// 获得教材类型
	public List<Classtypeinfo> getClasstypeinfoList(){
		ClasstypeinfoExample example = new ClasstypeinfoExample();
		return classtypeinfoMapper.selectByExample(example);
	}
	
	// 获得适用类型
	public List<Materialtypeinfo> getMaterialtypeinfoList(){
			MaterialtypeinfoExample example = new MaterialtypeinfoExample();
			return materialtypeinfoMapper.selectByExample(example);
	}
	
	// 获取教学场景
	public List<Textbooktypeinfo> getTextbooktypeinfoList(){
		TextbooktypeinfoExample example = new TextbooktypeinfoExample();
		return textbooktypeinfoMapper.selectByExample(example);
	}
	
	// 获取适用地区
	public List<Adaptiveareainfo> getAdaptiveareainfoList(){
		AdaptiveareainfoExample example = new AdaptiveareainfoExample();
		return adaptiveareainfoMapper.selectByExample(example);
	}
	
	// 获取复习进度
	public List<Reviewprogressinfo> getReviewprogressinfoList(){
		ReviewprogressinfoExample example = new ReviewprogressinfoExample();
		return reviewprogressinfoMapper.selectByExample(example);
	}
	
	// 设置redis里面的内容
	public void setRedis() {
		
		System.out.println("开始填充缓存");
		// 设置公司
		CorporationinfoExample example = new CorporationinfoExample();
		Criteria criteria = example.createCriteria();
		List<Corporationinfo> lists = corporationinfoMapper.selectByExample(example);
		
		for(Corporationinfo list : lists) {
			jedisClientSingle.hset("corporationId", list.getCorporationId()+"", list.getCorporationName());
		}
		
		// 设置教材
		PublishversionlistExample example2 = new PublishversionlistExample();
		com.scnu.teach.pojo.PublishversionlistExample.Criteria criteria2 = example2.createCriteria();
		List<Publishversionlist> list2 = publishversionlistMapper.selectByExample(example2);
		for(Publishversionlist list : list2) {
			jedisClientSingle.hset("publishVersionId", list.getId()+"", list.getName());
		}
		
		
	}
	
	// 第一次初始化时必须给回的信息
	public TeachMessage getTeachMessage(Integer userId, Integer sectionId, Integer subjectId) {
		
		        // setRedis();
		
		         TeachMessage teachMessage = new TeachMessage();
		         teachMessage.setSectionList(getSectionList(userId));
		         teachMessage.setBusinessList(getBusinessList());
		         teachMessage.setYearList(getYearinfoList());
		         teachMessage.setProductLineList(getProductlineinfoList());
		         if(sectionId <= 17)
		         teachMessage.setGradeList(getGradeinfoList2(sectionId));
		         else
		         teachMessage.setGradeList(getGradeinfoList(sectionId));
		         
		         teachMessage.setSimplePublishVersionList(getPublishVersionList(sectionId, subjectId));
		         teachMessage.setSeasonList(getSeasoninfoList());
		         
		         // 如果是 高中的老师
		         if(sectionId.equals(17)) { 
		        	 teachMessage.setTextBookTypeList(getTextbooktypeinfoList());   // 适用场景
		        	 teachMessage.setSimpleBookVersionList(selectService.getBookVersionList(sectionId, subjectId,   // 教材
		        			 simpleassembleMapper.getPublishVersionList2(sectionId, subjectId).get(0).getId()));
		         }
		         
		         teachMessage.setMaterialTypeList(getMaterialtypeinfoList());
		         teachMessage.setClassTypeList(getClasstypeinfoList());
		         return teachMessage;
	}
	
	//得到高中栏下部的信息   section = 17  1.高考的情况   2.高一高二的情况       
	public TeachMessage getHighTeachMessage(Integer userId, Integer sectionId, Integer subjectId,
			                      Integer publishVersionId, Integer gradeId, Integer bookVersionId) {
		TeachMessage teachMessage = new TeachMessage();
		if(gradeId < 10 || gradeId > 12)
		teachMessage.setGradeList(getGradeinfoList2(sectionId));
		if(gradeId.equals(12)) {  // 高考情况
			teachMessage.setAdaptiveAreaList(getAdaptiveareainfoList());
			teachMessage.setReviewProgressList(getReviewprogressinfoList());
		}else {   // 高一、高二情况
			teachMessage.setSimplePublishVersionList(getPublishVersionList(sectionId, subjectId));
			teachMessage.setSeasonList(getSeasoninfoList());
			
			// 判断选择的版本是否原来已经存在
			boolean taf = true;
			Integer temp = 0;
			for(Publishversionlist publishVersion : getPublishVersionList(sectionId, subjectId)) {
				  if(temp == 0) {
					  temp = publishVersion.getId();
				  }
				  
				  if(publishVersion.getId().equals(publishVersionId)) {
					  teachMessage.simpleJudgement.set(0, true);
					  taf = false;
					  break;
				  }
			}
			if(taf)
			publishVersionId = temp;
			
			teachMessage.setSimpleBookVersionList(selectService.getBookVersionList(sectionId, subjectId, publishVersionId));
			for(Simplebookversionlist bookVersion : selectService.getBookVersionList(sectionId, subjectId, publishVersionId)) {
				if(bookVersion.getBookVersionId().equals(bookVersionId)) {
					teachMessage.simpleJudgement.set(1, true);
					break;
				}
			}
			teachMessage.setTextBookTypeList(getTextbooktypeinfoList());
		}
		return teachMessage;
	}
	
	// 得到初中栏下部的信息  sectionId = 18   只有可能改变 年级
	public TeachMessage getMidTeachMessage(Integer sectionId, Integer subjectId, Integer gradeId, Integer publishVersionId){
		TeachMessage teachMessage = new TeachMessage();
		if(gradeId < 7 || gradeId > 9){
		teachMessage.setGradeList(getGradeinfoList(sectionId));
		}
		teachMessage.setSimplePublishVersionList(getPublishVersionList(sectionId, subjectId));
		for(Publishversionlist publishVersion : getPublishVersionList(sectionId, subjectId)) {
			if(publishVersion.getId().equals(publishVersionId)) {
				  teachMessage.simpleJudgement.set(0, true);
				  break;
			  }
		}
		teachMessage.setSeasonList(getSeasoninfoList());
		return teachMessage;
	}
	
	// 初始化获取数据
	public TeachMessage getInitTeachMessage(Integer userId){  // 需要计算好 sectionId， subjectId
		Section section = getSectionList(userId).get(0);
		Integer sectionId = section.getSectionId();
		Integer subjectId = section.getChildren().get(0).getSubjectId();
		
		TeachMessage teachMessage = null;
		
		teachMessage = getTeachMessage(userId, sectionId, subjectId);
		
		return teachMessage;
	}
	
	
	// 提交数据获取的数据
	public TeachMessage  getRealTeachMessage(Integer userId, Integer sectionId, Integer subjectId,
			                 Integer publishVersionId, Integer gradeId, Integer bookVersionId) {
		
		TeachMessage teachMessage = null;
		
		if(sectionId.equals(18)) {  // 初中的情况
			teachMessage = getMidTeachMessage(sectionId, subjectId, gradeId, publishVersionId);
		}
		
		if(sectionId.equals(17)) {  // 高中情况
			teachMessage = getHighTeachMessage(userId, sectionId, subjectId, publishVersionId, gradeId, bookVersionId);
		}
		
		// 小学的情况...
		
		return teachMessage;
	}
	
	
	// 通过缓存获取的保存的数据
	public TeachMessage  getCacheTeachMessage(Note note, Integer userId) {
		
		TeachMessage teachMessage = new TeachMessage();
		
		teachMessage.setSectionList(getSectionList(userId));
		
		teachMessage.setBusinessList(getBusinessList());
		
		teachMessage.setYearList(getYearinfoList());
		
		teachMessage.setProductLineList(getProductlineinfoList());
		
		if(note.getSectionId() <= 17)
	    teachMessage.setGradeList(getGradeinfoList2(note.getSectionId()));
	    else
	    teachMessage.setGradeList(getGradeinfoList(note.getSectionId()));
		
		teachMessage.setClassTypeList(getClasstypeinfoList());
		
		teachMessage.setMaterialTypeList(getMaterialtypeinfoList());
		
		if(note.getSectionId().equals(18)) { // 初中的情况
		teachMessage.setSimplePublishVersionList(getPublishVersionList(note.getSectionId(), note.getSubjectId()));
		teachMessage.setSeasonList(getSeasoninfoList());
		}else if(note.getSectionId().equals(17)) {
			if(note.getGradeId().equals(12)) {  // 高考地区
				teachMessage.setAdaptiveAreaList(getAdaptiveareainfoList());
				teachMessage.setReviewProgressList(getReviewprogressinfoList());
			}else {
				teachMessage.setSimplePublishVersionList(getPublishVersionList(note.getSectionId(), note.getSubjectId()));
				teachMessage.setSeasonList(getSeasoninfoList());
				teachMessage.setSimpleBookVersionList(
				selectService.getBookVersionList(note.getSectionId(), note.getSubjectId(), note.getPublishVersionId()));
				teachMessage.setTextBookTypeList(getTextbooktypeinfoList());
			}	
		}
		
		return teachMessage;
	}
	
	// 把数据封装好
	public Cache progressNote(Note note) {
		
		Cache cache = new Cache();
		cache.setGradeId(note.getGradeId());
		cache.setTextBookId(note.getTextBookId());
		cache.setMaterialTypeId(note.getMaterialTypeId());
		cache.setClassTypeId(note.getClassTypeId());
		cache.setAdaptiveAreaId(note.getAdaptiveAreaId());
		cache.setReviewProgressId(note.getReviewProgressId());
		cache.setBookVersionId(note.getBookVersionId());
		System.out.println("开始访问缓存");
		System.out.println("A");
		
		// 创建对象
		if(note.getYearId() != null) {
			System.out.println("B");
		Yearinfo year = new Yearinfo();
		year.setId(note.getYearId());
		year.setName(jedisClientSingle.hget("yearId", note.getYearId()+""));
		cache.setYear(year);
		}
		
		if(note.getSectionId() != null) {
			System.out.println("C");
		Simplesectionlist section = new Simplesectionlist();
		section.setSectionId(note.getSectionId());
		section.setSectionName(jedisClientSingle.hget("sectionId", note.getSectionId()+""));
		cache.setSection(section);
		}
		
		if(note.getSubjectId() != null) {
			System.out.println("D");
		Simplesubjectlist subject = new Simplesubjectlist();
		subject.setSubjectId(note.getSubjectId());
		subject.setSubjectName(jedisClientSingle.hget("subjectId", note.getSubjectId()+""));
		cache.setSubject(subject);
		}
		
		if(note.getBusinessId() != null) {
			System.out.println("E");
		Business business = new Business();
		business.setId(note.getBusinessId());
		business.setName(jedisClientSingle.hget("businessId", note.getBusinessId()+""));
		cache.setBusiness(business);
		}
		
		if(note.getCorporationId() != null) {
		System.out.println("F");
		Corporation corporation = new Corporation();
		corporation.setId(note.getCorporationId());
		corporation.setName(jedisClientSingle.hget("corporationId", note.getCorporationId()+""));
		cache.setCorporation(corporation);
		}
		
		
		if(note.getProductLineId() != null) {
			System.out.println("G");
		Productlineinfo productLine = new Productlineinfo();
		productLine.setId(note.getProductLineId());
		productLine.setName(jedisClientSingle.hget("productLineId", note.getProductLineId()+""));
		cache.setProductLine(productLine);
		}
		
		if(note.getPublishVersionId() != null) {
			System.out.println("H");
		Publishversionlist publishVersion = new Publishversionlist();
		publishVersion.setId(note.getPublishVersionId());
		publishVersion.setName(jedisClientSingle.hget("publishVersionId", note.getPublishVersionId()+""));
		cache.setPublishVersion(publishVersion);
		}
		
		
		if(note.getSeasonId() != null) {
			System.out.println("I");
		Seasoninfo season = new Seasoninfo();
		season.setId(note.getSeasonId());
		season.setName(jedisClientSingle.hget("seasonId", note.getSeasonId()+""));
		cache.setSeason(season);
		}	
		
		System.out.println("访问缓存结束");
		return cache;
		
	}
	
}
