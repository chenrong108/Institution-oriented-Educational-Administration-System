package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Reviewprogressinfo;
import com.scnu.teach.pojo.ReviewprogressinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewprogressinfoMapper {
    int countByExample(ReviewprogressinfoExample example);

    int deleteByExample(ReviewprogressinfoExample example);

    int deleteByPrimaryKey(Integer reviewProgressId);

    int insert(Reviewprogressinfo record);

    int insertSelective(Reviewprogressinfo record);

    List<Reviewprogressinfo> selectByExample(ReviewprogressinfoExample example);

    Reviewprogressinfo selectByPrimaryKey(Integer reviewProgressId);

    int updateByExampleSelective(@Param("record") Reviewprogressinfo record, @Param("example") ReviewprogressinfoExample example);

    int updateByExample(@Param("record") Reviewprogressinfo record, @Param("example") ReviewprogressinfoExample example);

    int updateByPrimaryKeySelective(Reviewprogressinfo record);

    int updateByPrimaryKey(Reviewprogressinfo record);
}