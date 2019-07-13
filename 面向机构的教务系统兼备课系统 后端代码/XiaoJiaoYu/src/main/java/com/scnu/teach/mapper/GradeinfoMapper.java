package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Gradeinfo;
import com.scnu.teach.pojo.GradeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeinfoMapper {
    int countByExample(GradeinfoExample example);

    int deleteByExample(GradeinfoExample example);

    int deleteByPrimaryKey(Integer gardeId);

    int insert(Gradeinfo record);

    int insertSelective(Gradeinfo record);

    List<Gradeinfo> selectByExample(GradeinfoExample example);

    Gradeinfo selectByPrimaryKey(Integer gardeId);

    int updateByExampleSelective(@Param("record") Gradeinfo record, @Param("example") GradeinfoExample example);

    int updateByExample(@Param("record") Gradeinfo record, @Param("example") GradeinfoExample example);

    int updateByPrimaryKeySelective(Gradeinfo record);

    int updateByPrimaryKey(Gradeinfo record);
}