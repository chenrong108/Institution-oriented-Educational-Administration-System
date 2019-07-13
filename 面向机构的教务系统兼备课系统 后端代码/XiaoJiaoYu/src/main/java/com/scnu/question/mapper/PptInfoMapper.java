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
    
    // �Լ�д��
    PptInfo selectBypptIdAnduserId(@Param("pptId") Integer pptId, @Param("userId") Integer userId);

    PptInfo selectByPrimaryKey(PptInfoKey key);

    int updateByExampleSelective(@Param("record") PptInfo record, @Param("example") PptInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PptInfo record, @Param("example") PptInfoExample example);

    int updateByExample(@Param("record") PptInfo record, @Param("example") PptInfoExample example);

    
    // ������Լ�д��
    int updateByPrimaryKeySelective(PptInfo record);

    int updateByPrimaryKeyWithBLOBs(PptInfo record);

    int updateByPrimaryKey(PptInfo record);
}