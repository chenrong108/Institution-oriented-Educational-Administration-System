package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Bussinessinfo;
import com.scnu.teach.pojo.BussinessinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussinessinfoMapper {
    int countByExample(BussinessinfoExample example);

    int deleteByExample(BussinessinfoExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(Bussinessinfo record);

    int insertSelective(Bussinessinfo record);

    List<Bussinessinfo> selectByExample(BussinessinfoExample example);

    Bussinessinfo selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("record") Bussinessinfo record, @Param("example") BussinessinfoExample example);

    int updateByExample(@Param("record") Bussinessinfo record, @Param("example") BussinessinfoExample example);

    int updateByPrimaryKeySelective(Bussinessinfo record);

    int updateByPrimaryKey(Bussinessinfo record);
}