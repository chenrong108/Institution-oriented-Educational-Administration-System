package com.scnu.question.mapper;

import com.scnu.question.pojo.YearProblemInfo;
import com.scnu.question.pojo.YearProblemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearProblemInfoMapper {
    int countByExample(YearProblemInfoExample example);

    int deleteByExample(YearProblemInfoExample example);

    int deleteByPrimaryKey(Integer yearId);

    int insert(YearProblemInfo record);

    int insertSelective(YearProblemInfo record);

    List<YearProblemInfo> selectByExample(YearProblemInfoExample example);

    YearProblemInfo selectByPrimaryKey(Integer yearId);

    int updateByExampleSelective(@Param("record") YearProblemInfo record, @Param("example") YearProblemInfoExample example);

    int updateByExample(@Param("record") YearProblemInfo record, @Param("example") YearProblemInfoExample example);

    int updateByPrimaryKeySelective(YearProblemInfo record);

    int updateByPrimaryKey(YearProblemInfo record);
}