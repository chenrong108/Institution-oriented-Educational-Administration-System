package com.scnu.question.mapper;

import com.scnu.ppt.bean.KonwledgeLevel;
import com.scnu.ppt.bean.KonwledgeLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KonwledgeLevelMapper {
    int countByExample(KonwledgeLevelExample example);

    int deleteByExample(KonwledgeLevelExample example);

    int deleteByPrimaryKey(Integer kownledgeId);

    int insert(KonwledgeLevel record);

    int insertSelective(KonwledgeLevel record);

    List<KonwledgeLevel> selectByExample(KonwledgeLevelExample example);

    KonwledgeLevel selectByPrimaryKey(Integer kownledgeId);

    int updateByExampleSelective(@Param("record") KonwledgeLevel record, @Param("example") KonwledgeLevelExample example);

    int updateByExample(@Param("record") KonwledgeLevel record, @Param("example") KonwledgeLevelExample example);

    int updateByPrimaryKeySelective(KonwledgeLevel record);

    int updateByPrimaryKey(KonwledgeLevel record);
    
    List<Integer> selectLevel4(@Param("level") Integer level, @Param("knowledgeId") Integer knowledgeId);
    
    List<Integer> getInitKownlegeIds();
    
    List<Integer> getNextLevelKownlegeIds(@Param("level") Integer level, @Param("knowledgeId") Integer knowledgeId, @Param("nextLevel") Integer nextLevel);
    
}