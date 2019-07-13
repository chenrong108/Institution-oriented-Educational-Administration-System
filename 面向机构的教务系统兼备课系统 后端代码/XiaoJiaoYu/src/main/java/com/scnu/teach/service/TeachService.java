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
	
	// �õ��꼶ѧ��
	public List<Section> getSectionList(Integer userId) {
		return sectionMapper.queryForList(userId);
	}
	
    // �õ����͹�˾
	public List<Business> getBusinessList(){
		return businessMapper.queryForList();
	}
	
	// ������
	public List<Yearinfo> getYearinfoList(){
		YearinfoExample example = new YearinfoExample();
		return yearinfoMapper.selectByExample(example);
	}
	
	// ��ó�����
	public List<Productlineinfo> getProductlineinfoList(){
		ProductlineinfoExample example = new ProductlineinfoExample();
		return productlineinfoMapper.selectByExample(example);
	}
	
	// ��ó��������Ϣ
	public  List<Publishversionlist> getPublishVersionList(Integer sectionId, Integer subjectId){
		return simpleassembleMapper.getPublishVersionList2(sectionId, subjectId);
	}
	
	// ��ü��ڵ���Ϣ
	public List<Seasoninfo> getSeasoninfoList(){
		SeasoninfoExample example = new SeasoninfoExample();
		return seasoninfoMapper.selectByExample(example);
	}
	
	// ���Сѧ�����꼶����Ϣ
	public List<Gradeinfo> getGradeinfoList(Integer type){
		GradeinfoExample example = new GradeinfoExample();
		com.scnu.teach.pojo.GradeinfoExample.Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(type);
		return gradeinfoMapper.selectByExample(example);
	}
	
	// ��ø��е���Ϣ
		public List<Gradeinfo> getGradeinfoList2(Integer type){
			GradeinfoExample example = new GradeinfoExample();
			com.scnu.teach.pojo.GradeinfoExample.Criteria criteria = example.createCriteria();
			criteria.andTypeLessThanOrEqualTo(17);
			return gradeinfoMapper.selectByExample(example);
		}
	
	// ��ý̲�����
	public List<Classtypeinfo> getClasstypeinfoList(){
		ClasstypeinfoExample example = new ClasstypeinfoExample();
		return classtypeinfoMapper.selectByExample(example);
	}
	
	// �����������
	public List<Materialtypeinfo> getMaterialtypeinfoList(){
			MaterialtypeinfoExample example = new MaterialtypeinfoExample();
			return materialtypeinfoMapper.selectByExample(example);
	}
	
	// ��ȡ��ѧ����
	public List<Textbooktypeinfo> getTextbooktypeinfoList(){
		TextbooktypeinfoExample example = new TextbooktypeinfoExample();
		return textbooktypeinfoMapper.selectByExample(example);
	}
	
	// ��ȡ���õ���
	public List<Adaptiveareainfo> getAdaptiveareainfoList(){
		AdaptiveareainfoExample example = new AdaptiveareainfoExample();
		return adaptiveareainfoMapper.selectByExample(example);
	}
	
	// ��ȡ��ϰ����
	public List<Reviewprogressinfo> getReviewprogressinfoList(){
		ReviewprogressinfoExample example = new ReviewprogressinfoExample();
		return reviewprogressinfoMapper.selectByExample(example);
	}
	
	// ����redis���������
	public void setRedis() {
		
		System.out.println("��ʼ��仺��");
		// ���ù�˾
		CorporationinfoExample example = new CorporationinfoExample();
		Criteria criteria = example.createCriteria();
		List<Corporationinfo> lists = corporationinfoMapper.selectByExample(example);
		
		for(Corporationinfo list : lists) {
			jedisClientSingle.hset("corporationId", list.getCorporationId()+"", list.getCorporationName());
		}
		
		// ���ý̲�
		PublishversionlistExample example2 = new PublishversionlistExample();
		com.scnu.teach.pojo.PublishversionlistExample.Criteria criteria2 = example2.createCriteria();
		List<Publishversionlist> list2 = publishversionlistMapper.selectByExample(example2);
		for(Publishversionlist list : list2) {
			jedisClientSingle.hset("publishVersionId", list.getId()+"", list.getName());
		}
		
		
	}
	
	// ��һ�γ�ʼ��ʱ������ص���Ϣ
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
		         
		         // ����� ���е���ʦ
		         if(sectionId.equals(17)) { 
		        	 teachMessage.setTextBookTypeList(getTextbooktypeinfoList());   // ���ó���
		        	 teachMessage.setSimpleBookVersionList(selectService.getBookVersionList(sectionId, subjectId,   // �̲�
		        			 simpleassembleMapper.getPublishVersionList2(sectionId, subjectId).get(0).getId()));
		         }
		         
		         teachMessage.setMaterialTypeList(getMaterialtypeinfoList());
		         teachMessage.setClassTypeList(getClasstypeinfoList());
		         return teachMessage;
	}
	
	//�õ��������²�����Ϣ   section = 17  1.�߿������   2.��һ�߶������       
	public TeachMessage getHighTeachMessage(Integer userId, Integer sectionId, Integer subjectId,
			                      Integer publishVersionId, Integer gradeId, Integer bookVersionId) {
		TeachMessage teachMessage = new TeachMessage();
		if(gradeId < 10 || gradeId > 12)
		teachMessage.setGradeList(getGradeinfoList2(sectionId));
		if(gradeId.equals(12)) {  // �߿����
			teachMessage.setAdaptiveAreaList(getAdaptiveareainfoList());
			teachMessage.setReviewProgressList(getReviewprogressinfoList());
		}else {   // ��һ���߶����
			teachMessage.setSimplePublishVersionList(getPublishVersionList(sectionId, subjectId));
			teachMessage.setSeasonList(getSeasoninfoList());
			
			// �ж�ѡ��İ汾�Ƿ�ԭ���Ѿ�����
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
	
	// �õ��������²�����Ϣ  sectionId = 18   ֻ�п��ܸı� �꼶
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
	
	// ��ʼ����ȡ����
	public TeachMessage getInitTeachMessage(Integer userId){  // ��Ҫ����� sectionId�� subjectId
		Section section = getSectionList(userId).get(0);
		Integer sectionId = section.getSectionId();
		Integer subjectId = section.getChildren().get(0).getSubjectId();
		
		TeachMessage teachMessage = null;
		
		teachMessage = getTeachMessage(userId, sectionId, subjectId);
		
		return teachMessage;
	}
	
	
	// �ύ���ݻ�ȡ������
	public TeachMessage  getRealTeachMessage(Integer userId, Integer sectionId, Integer subjectId,
			                 Integer publishVersionId, Integer gradeId, Integer bookVersionId) {
		
		TeachMessage teachMessage = null;
		
		if(sectionId.equals(18)) {  // ���е����
			teachMessage = getMidTeachMessage(sectionId, subjectId, gradeId, publishVersionId);
		}
		
		if(sectionId.equals(17)) {  // �������
			teachMessage = getHighTeachMessage(userId, sectionId, subjectId, publishVersionId, gradeId, bookVersionId);
		}
		
		// Сѧ�����...
		
		return teachMessage;
	}
	
	
	// ͨ�������ȡ�ı��������
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
		
		if(note.getSectionId().equals(18)) { // ���е����
		teachMessage.setSimplePublishVersionList(getPublishVersionList(note.getSectionId(), note.getSubjectId()));
		teachMessage.setSeasonList(getSeasoninfoList());
		}else if(note.getSectionId().equals(17)) {
			if(note.getGradeId().equals(12)) {  // �߿�����
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
	
	// �����ݷ�װ��
	public Cache progressNote(Note note) {
		
		Cache cache = new Cache();
		cache.setGradeId(note.getGradeId());
		cache.setTextBookId(note.getTextBookId());
		cache.setMaterialTypeId(note.getMaterialTypeId());
		cache.setClassTypeId(note.getClassTypeId());
		cache.setAdaptiveAreaId(note.getAdaptiveAreaId());
		cache.setReviewProgressId(note.getReviewProgressId());
		cache.setBookVersionId(note.getBookVersionId());
		System.out.println("��ʼ���ʻ���");
		System.out.println("A");
		
		// ��������
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
		
		System.out.println("���ʻ������");
		return cache;
		
	}
	
}
