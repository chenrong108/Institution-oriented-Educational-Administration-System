package com.scnu.question.mapper;

import com.scnu.ppt.bean.Lecture;
import com.scnu.ppt.bean.LectureExample;
import com.scnu.ppt.bean.LectureKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LectureMapper {
    int countByExample(LectureExample example);

    int deleteByExample(LectureExample example);

    int deleteByPrimaryKey(LectureKey key);

    int insert(Lecture record);

    int insertSelective(Lecture record);

    List<Lecture> selectByExample(LectureExample example);

    Lecture selectByPrimaryKey(LectureKey key);
    
    List<Integer> selectByLectureSelective(@Param("record") Lecture record);

    int updateByExampleSelective(@Param("record") Lecture record, @Param("example") LectureExample example);

    int updateByExample(@Param("record") Lecture record, @Param("example") LectureExample example);

    int updateByPrimaryKeySelective(Lecture record);

    int updateByPrimaryKey(Lecture record);
}