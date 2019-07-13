package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Yearinfo;
import com.scnu.teach.pojo.YearinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearinfoMapper {
    int countByExample(YearinfoExample example);

    int deleteByExample(YearinfoExample example);

    int deleteByPrimaryKey(Integer yearId);

    int insert(Yearinfo record);

    int insertSelective(Yearinfo record);

    List<Yearinfo> selectByExample(YearinfoExample example);

    Yearinfo selectByPrimaryKey(Integer yearId);

    int updateByExampleSelective(@Param("record") Yearinfo record, @Param("example") YearinfoExample example);

    int updateByExample(@Param("record") Yearinfo record, @Param("example") YearinfoExample example);

    int updateByPrimaryKeySelective(Yearinfo record);

    int updateByPrimaryKey(Yearinfo record);
}