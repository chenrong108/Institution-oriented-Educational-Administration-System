package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Textbooktypeinfo;
import com.scnu.teach.pojo.TextbooktypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextbooktypeinfoMapper {
    int countByExample(TextbooktypeinfoExample example);

    int deleteByExample(TextbooktypeinfoExample example);

    int deleteByPrimaryKey(Integer textBookId);

    int insert(Textbooktypeinfo record);

    int insertSelective(Textbooktypeinfo record);

    List<Textbooktypeinfo> selectByExample(TextbooktypeinfoExample example);

    Textbooktypeinfo selectByPrimaryKey(Integer textBookId);

    int updateByExampleSelective(@Param("record") Textbooktypeinfo record, @Param("example") TextbooktypeinfoExample example);

    int updateByExample(@Param("record") Textbooktypeinfo record, @Param("example") TextbooktypeinfoExample example);

    int updateByPrimaryKeySelective(Textbooktypeinfo record);

    int updateByPrimaryKey(Textbooktypeinfo record);
}