package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Simplesubjectlist;
import com.scnu.teach.pojo.SimplesubjectlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimplesubjectlistMapper {
    int countByExample(SimplesubjectlistExample example);

    int deleteByExample(SimplesubjectlistExample example);

    int deleteByPrimaryKey(Integer subjectId);

    int insert(Simplesubjectlist record);

    int insertSelective(Simplesubjectlist record);

    List<Simplesubjectlist> selectByExample(SimplesubjectlistExample example);

    Simplesubjectlist selectByPrimaryKey(Integer subjectId);

    int updateByExampleSelective(@Param("record") Simplesubjectlist record, @Param("example") SimplesubjectlistExample example);

    int updateByExample(@Param("record") Simplesubjectlist record, @Param("example") SimplesubjectlistExample example);

    int updateByPrimaryKeySelective(Simplesubjectlist record);

    int updateByPrimaryKey(Simplesubjectlist record);
}