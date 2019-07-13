package com.scnu.question.mapper;

import com.scnu.ppt.bean.QuestionAssemble;
import com.scnu.ppt.bean.QuestionAssembleExample;
import com.scnu.ppt.bean.QuestionAssembleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionAssembleMapper {
    int countByExample(QuestionAssembleExample example);

    int deleteByExample(QuestionAssembleExample example);

    int deleteByPrimaryKey(Integer questionId);

    int insert(QuestionAssembleWithBLOBs record);

    int insertSelective(QuestionAssembleWithBLOBs record);

    List<QuestionAssembleWithBLOBs> selectByExampleWithBLOBs(QuestionAssembleExample example);

    List<QuestionAssemble> selectByExample(QuestionAssembleExample example);

    QuestionAssembleWithBLOBs selectByPrimaryKey(Integer questionId);

    int updateByExampleSelective(@Param("record") QuestionAssembleWithBLOBs record, @Param("example") QuestionAssembleExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionAssembleWithBLOBs record, @Param("example") QuestionAssembleExample example);

    int updateByExample(@Param("record") QuestionAssemble record, @Param("example") QuestionAssembleExample example);

    int updateByPrimaryKeySelective(QuestionAssembleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionAssembleWithBLOBs record);

    int updateByPrimaryKey(QuestionAssemble record);
    
    List<Integer> getQuestionId(@Param("knowledgeIdLike") String knowledgeIdLike, @Param("difficultyInfo") Integer difficultyInfo, @Param("questionTypeId") Integer questionTypeId);
    
    List<String>  getQuestionDetailList(List<Integer> FinalQuestionIdList);
    
    List<String>  getAllQuestionDetailList(@Param("difficultyInfo") Integer difficultyInfo, @Param("questionTypeId") Integer questionTypeId);
}