package com.scnu.teach.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.scnu.teach.pojo.Publishversionlist;
import com.scnu.teach.pojo.Simpleassemble;
import com.scnu.teach.pojo.SimpleassembleExample;
import com.scnu.teach.pojo.Simplebookversionlist;
import com.scnu.teach.pojo.Simplepublishversionlist;
import com.scnu.teach.pojo.Simplesectionlist;
import com.scnu.teach.pojo.Simplesubjectlist;

public interface SimpleassembleMapper {
    int countByExample(SimpleassembleExample example);

    int deleteByExample(SimpleassembleExample example);

    int deleteByPrimaryKey(Integer assembleId);

    int insert(Simpleassemble record);

    int insertSelective(Simpleassemble record);

    List<Simpleassemble> selectByExample(SimpleassembleExample example);

    Simpleassemble selectByPrimaryKey(Integer assembleId);

    int updateByExampleSelective(@Param("record") Simpleassemble record, @Param("example") SimpleassembleExample example);

    int updateByExample(@Param("record") Simpleassemble record, @Param("example") SimpleassembleExample example);

    int updateByPrimaryKeySelective(Simpleassemble record);

    int updateByPrimaryKey(Simpleassemble record);
    
  // 获取选择信息
    
    List<Simplesectionlist> getSectionList();
    
    List<Simplesubjectlist> getSubjectList(@Param("sectionId") Integer sectionId);
    
    List<Simplepublishversionlist> getPublishVersionList(@Param("sectionId") Integer sectionId, @Param("subjectId") Integer subjectId);
    
    List<Publishversionlist> getPublishVersionList2(@Param("sectionId") Integer sectionId, @Param("subjectId") Integer subjectId);
    
    List<Publishversionlist> getPublishVersionList3();
    
    List<Simplebookversionlist> getBookVersionList(@Param("sectionId") Integer sectionId, @Param("subjectId") Integer subjectId,
    		@Param("publishVersionId") Integer publishVersionId);
}