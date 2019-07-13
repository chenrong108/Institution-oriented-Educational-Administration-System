package com.scnu.question.mapper;

import com.scnu.question.pojo.QuestionTypeInfo;
import com.scnu.question.pojo.QuestionTypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeInfoMapper {
    int countByExample(QuestionTypeInfoExample example);

    int deleteByExample(QuestionTypeInfoExample example);

    int insert(QuestionTypeInfo record);

    int insertSelective(QuestionTypeInfo record);

    List<QuestionTypeInfo> selectByExample(QuestionTypeInfoExample example);

    int updateByExampleSelective(@Param("record") QuestionTypeInfo record, @Param("example") QuestionTypeInfoExample example);

    int updateByExample(@Param("record") QuestionTypeInfo record, @Param("example") QuestionTypeInfoExample example);
}