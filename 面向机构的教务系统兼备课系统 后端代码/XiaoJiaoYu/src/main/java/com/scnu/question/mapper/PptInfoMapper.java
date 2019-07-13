package com.scnu.question.mapper;

import com.scnu.ppt.bean.PptInfo;
import com.scnu.ppt.bean.PptInfoExample;
import com.scnu.ppt.bean.PptInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PptInfoMapper {
    int countByExample(PptInfoExample example);

    int deleteByExample(PptInfoExample example);

    int deleteByPrimaryKey(PptInfoKey key);

    int insert(PptInfo record);

    int insertSelective(PptInfo record);

    List<PptInfo> selectByExampleWithBLOBs(PptInfoExample example);

    List<PptInfo> selectByExample(PptInfoExample example);
    
    // 自己写的
    PptInfo selectBypptIdAnduserId(@Param("pptId") Integer pptId, @Param("userId") Integer userId);

    PptInfo selectByPrimaryKey(PptInfoKey key);

    int updateByExampleSelective(@Param("record") PptInfo record, @Param("example") PptInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PptInfo record, @Param("example") PptInfoExample example);

    int updateByExample(@Param("record") PptInfo record, @Param("example") PptInfoExample example);

    
    // 这个是自己写的
    int updateByPrimaryKeySelective(PptInfo record);

    int updateByPrimaryKeyWithBLOBs(PptInfo record);

    int updateByPrimaryKey(PptInfo record);
}