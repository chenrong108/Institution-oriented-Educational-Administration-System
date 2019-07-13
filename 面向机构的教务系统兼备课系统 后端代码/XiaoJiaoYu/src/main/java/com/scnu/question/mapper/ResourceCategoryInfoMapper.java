package com.scnu.question.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.scnu.question.pojo.ResourceCategoryInfo;
import com.scnu.question.pojo.ResoureCatagoryInfoExample;

public interface ResourceCategoryInfoMapper {
    int countByExample(ResoureCatagoryInfoExample example);

    int deleteByExample(ResoureCatagoryInfoExample example);

    int deleteByPrimaryKey(Integer resoureCatagoryId);

    int insert(ResourceCategoryInfo record);

    int insertSelective(ResourceCategoryInfo record);

    List<ResourceCategoryInfo> selectByExample(ResoureCatagoryInfoExample example);

    List<ResourceCategoryInfo> selectByPrimaryKey(Integer resoureCatagoryId);

    int updateByExampleSelective(@Param("record") ResourceCategoryInfo record, @Param("example") ResoureCatagoryInfoExample example);

    int updateByExample(@Param("record") ResourceCategoryInfo record, @Param("example") ResoureCatagoryInfoExample example);

    int updateByPrimaryKeySelective(ResourceCategoryInfo record);

    int updateByPrimaryKey(ResourceCategoryInfo record);
}