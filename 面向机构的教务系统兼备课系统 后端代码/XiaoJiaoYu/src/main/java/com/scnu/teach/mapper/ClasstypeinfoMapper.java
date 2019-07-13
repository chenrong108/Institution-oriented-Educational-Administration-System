package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Classtypeinfo;
import com.scnu.teach.pojo.ClasstypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClasstypeinfoMapper {
    int countByExample(ClasstypeinfoExample example);

    int deleteByExample(ClasstypeinfoExample example);

    int deleteByPrimaryKey(Integer classTypeId);

    int insert(Classtypeinfo record);

    int insertSelective(Classtypeinfo record);

    List<Classtypeinfo> selectByExample(ClasstypeinfoExample example);

    Classtypeinfo selectByPrimaryKey(Integer classTypeId);

    int updateByExampleSelective(@Param("record") Classtypeinfo record, @Param("example") ClasstypeinfoExample example);

    int updateByExample(@Param("record") Classtypeinfo record, @Param("example") ClasstypeinfoExample example);

    int updateByPrimaryKeySelective(Classtypeinfo record);

    int updateByPrimaryKey(Classtypeinfo record);
}