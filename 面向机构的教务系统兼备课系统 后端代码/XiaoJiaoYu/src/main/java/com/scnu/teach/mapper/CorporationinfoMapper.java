package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Corporationinfo;
import com.scnu.teach.pojo.CorporationinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CorporationinfoMapper {
    int countByExample(CorporationinfoExample example);

    int deleteByExample(CorporationinfoExample example);

    int deleteByPrimaryKey(Integer corporationId);

    int insert(Corporationinfo record);

    int insertSelective(Corporationinfo record);

    List<Corporationinfo> selectByExample(CorporationinfoExample example);

    Corporationinfo selectByPrimaryKey(Integer corporationId);

    int updateByExampleSelective(@Param("record") Corporationinfo record, @Param("example") CorporationinfoExample example);

    int updateByExample(@Param("record") Corporationinfo record, @Param("example") CorporationinfoExample example);

    int updateByPrimaryKeySelective(Corporationinfo record);

    int updateByPrimaryKey(Corporationinfo record);
}