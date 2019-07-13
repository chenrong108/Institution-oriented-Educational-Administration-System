package com.scnu.question.mapper;

import com.scnu.ppt.bean.Highmathrja1info;
import com.scnu.ppt.bean.Highmathrja1infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Highmathrja1infoMapper {
    int countByExample(Highmathrja1infoExample example);

    int deleteByExample(Highmathrja1infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Highmathrja1info record);

    int insertSelective(Highmathrja1info record);

    List<Highmathrja1info> selectByExample(Highmathrja1infoExample example);

    Highmathrja1info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Highmathrja1info record, @Param("example") Highmathrja1infoExample example);

    int updateByExample(@Param("record") Highmathrja1info record, @Param("example") Highmathrja1infoExample example);

    int updateByPrimaryKeySelective(Highmathrja1info record);

    int updateByPrimaryKey(Highmathrja1info record);
}