package com.scnu.teach.mapper;

import com.scnu.teach.pojo.Productlineinfo;
import com.scnu.teach.pojo.ProductlineinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductlineinfoMapper {
    int countByExample(ProductlineinfoExample example);

    int deleteByExample(ProductlineinfoExample example);

    int deleteByPrimaryKey(Integer productLineId);

    int insert(Productlineinfo record);

    int insertSelective(Productlineinfo record);

    List<Productlineinfo> selectByExample(ProductlineinfoExample example);

    Productlineinfo selectByPrimaryKey(Integer productLineId);

    int updateByExampleSelective(@Param("record") Productlineinfo record, @Param("example") ProductlineinfoExample example);

    int updateByExample(@Param("record") Productlineinfo record, @Param("example") ProductlineinfoExample example);

    int updateByPrimaryKeySelective(Productlineinfo record);

    int updateByPrimaryKey(Productlineinfo record);
}