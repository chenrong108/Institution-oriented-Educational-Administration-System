package com.scnu.question.mapper;

import com.scnu.question.pojo.DifiicultyInfo;
import com.scnu.question.pojo.DifiicultyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DifiicultyInfoMapper {
    int countByExample(DifiicultyInfoExample example);

    int deleteByExample(DifiicultyInfoExample example);

    int deleteByPrimaryKey(Integer difficultyInfo);

    int insert(DifiicultyInfo record);

    int insertSelective(DifiicultyInfo record);

    List<DifiicultyInfo> selectByExample(DifiicultyInfoExample example);

    DifiicultyInfo selectByPrimaryKey(Integer difficultyInfo);

    int updateByExampleSelective(@Param("record") DifiicultyInfo record, @Param("example") DifiicultyInfoExample example);

    int updateByExample(@Param("record") DifiicultyInfo record, @Param("example") DifiicultyInfoExample example);

    int updateByPrimaryKeySelective(DifiicultyInfo record);

    int updateByPrimaryKey(DifiicultyInfo record);
}