package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Seasoninfo;
import com.scnu.teach.pojo.SeasoninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeasoninfoMapper {
    int countByExample(SeasoninfoExample example);

    int deleteByExample(SeasoninfoExample example);

    int deleteByPrimaryKey(Integer seasonId);

    int insert(Seasoninfo record);

    int insertSelective(Seasoninfo record);

    List<Seasoninfo> selectByExample(SeasoninfoExample example);

    Seasoninfo selectByPrimaryKey(Integer seasonId);

    int updateByExampleSelective(@Param("record") Seasoninfo record, @Param("example") SeasoninfoExample example);

    int updateByExample(@Param("record") Seasoninfo record, @Param("example") SeasoninfoExample example);

    int updateByPrimaryKeySelective(Seasoninfo record);

    int updateByPrimaryKey(Seasoninfo record);
}