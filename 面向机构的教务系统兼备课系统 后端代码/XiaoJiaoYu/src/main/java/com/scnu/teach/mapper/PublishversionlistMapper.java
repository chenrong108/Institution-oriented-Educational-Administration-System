package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Publishversionlist;
import com.scnu.teach.pojo.PublishversionlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishversionlistMapper {
    int countByExample(PublishversionlistExample example);

    int deleteByExample(PublishversionlistExample example);

    int deleteByPrimaryKey(Integer publishVersionId);

    int insert(Publishversionlist record);

    int insertSelective(Publishversionlist record);

    List<Publishversionlist> selectByExample(PublishversionlistExample example);

    Publishversionlist selectByPrimaryKey(Integer publishVersionId);

    int updateByExampleSelective(@Param("record") Publishversionlist record, @Param("example") PublishversionlistExample example);

    int updateByExample(@Param("record") Publishversionlist record, @Param("example") PublishversionlistExample example);

    int updateByPrimaryKeySelective(Publishversionlist record);

    int updateByPrimaryKey(Publishversionlist record);
}