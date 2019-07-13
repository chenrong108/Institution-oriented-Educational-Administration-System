package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Adaptiveareainfo;
import com.scnu.teach.pojo.AdaptiveareainfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdaptiveareainfoMapper {
    int countByExample(AdaptiveareainfoExample example);

    int deleteByExample(AdaptiveareainfoExample example);

    int deleteByPrimaryKey(Integer adaptiveAreaId);

    int insert(Adaptiveareainfo record);

    int insertSelective(Adaptiveareainfo record);

    List<Adaptiveareainfo> selectByExample(AdaptiveareainfoExample example);

    Adaptiveareainfo selectByPrimaryKey(Integer adaptiveAreaId);

    int updateByExampleSelective(@Param("record") Adaptiveareainfo record, @Param("example") AdaptiveareainfoExample example);

    int updateByExample(@Param("record") Adaptiveareainfo record, @Param("example") AdaptiveareainfoExample example);

    int updateByPrimaryKeySelective(Adaptiveareainfo record);

    int updateByPrimaryKey(Adaptiveareainfo record);
}