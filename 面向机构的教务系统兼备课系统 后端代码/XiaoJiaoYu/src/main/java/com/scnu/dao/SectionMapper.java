package com.scnu.dao;

import java.util.List;

import com.scnu.bean.Section;
import com.scnu.teach.pojo.Simplesectionlist;

public interface SectionMapper {
	

    List<Section> queryForList(Integer userId);

}
