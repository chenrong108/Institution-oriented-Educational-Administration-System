package com.scnu.question.mapper;

import com.scnu.question.pojo.TikuInfo;
import com.scnu.question.pojo.TikuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TikuInfoMapper {
    int countByExample(TikuInfoExample example);

    int deleteByExample(TikuInfoExample example);

    int deleteByPrimaryKey(Integer tikuId);

    int insert(TikuInfo record);

    int insertSelective(TikuInfo record);

    List<TikuInfo> selectByExample(TikuInfoExample example);

    TikuInfo selectByPrimaryKey(Integer tikuId);

    int updateByExampleSelective(@Param("record") TikuInfo record, @Param("example") TikuInfoExample example);

    int updateByExample(@Param("record") TikuInfo record, @Param("example") TikuInfoExample example);

    int updateByPrimaryKeySelective(TikuInfo record);

    int updateByPrimaryKey(TikuInfo record);
}