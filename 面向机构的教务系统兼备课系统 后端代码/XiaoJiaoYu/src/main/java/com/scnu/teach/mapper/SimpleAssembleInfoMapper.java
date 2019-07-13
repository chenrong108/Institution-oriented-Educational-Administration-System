package com.scnu.teach.mapper;

import com.scnu.teach.pojo.SimpleAssembleInfo;
import com.scnu.teach.pojo.SimpleAssembleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimpleAssembleInfoMapper {
    int countByExample(SimpleAssembleInfoExample example);

    int deleteByExample(SimpleAssembleInfoExample example);

    int deleteByPrimaryKey(Integer assembleId);

    int insert(SimpleAssembleInfo record);

    int insertSelective(SimpleAssembleInfo record);

    String selectByExampleWithBLOBs(SimpleAssembleInfoExample example);

    List<SimpleAssembleInfo> selectByExample(SimpleAssembleInfoExample example);

    SimpleAssembleInfo selectByPrimaryKey(Integer assembleId);

    int updateByExampleSelective(@Param("record") SimpleAssembleInfo record, @Param("example") SimpleAssembleInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SimpleAssembleInfo record, @Param("example") SimpleAssembleInfoExample example);

    int updateByExample(@Param("record") SimpleAssembleInfo record, @Param("example") SimpleAssembleInfoExample example);

    int updateByPrimaryKeySelective(SimpleAssembleInfo record);

    int updateByPrimaryKeyWithBLOBs(SimpleAssembleInfo record);

    int updateByPrimaryKey(SimpleAssembleInfo record);
}