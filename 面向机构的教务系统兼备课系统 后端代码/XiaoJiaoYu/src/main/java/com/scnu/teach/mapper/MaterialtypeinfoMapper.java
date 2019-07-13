package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Materialtypeinfo;
import com.scnu.teach.pojo.MaterialtypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialtypeinfoMapper {
    int countByExample(MaterialtypeinfoExample example);

    int deleteByExample(MaterialtypeinfoExample example);

    int deleteByPrimaryKey(Integer materialId);

    int insert(Materialtypeinfo record);

    int insertSelective(Materialtypeinfo record);

    List<Materialtypeinfo> selectByExample(MaterialtypeinfoExample example);

    Materialtypeinfo selectByPrimaryKey(Integer materialId);

    int updateByExampleSelective(@Param("record") Materialtypeinfo record, @Param("example") MaterialtypeinfoExample example);

    int updateByExample(@Param("record") Materialtypeinfo record, @Param("example") MaterialtypeinfoExample example);

    int updateByPrimaryKeySelective(Materialtypeinfo record);

    int updateByPrimaryKey(Materialtypeinfo record);
}