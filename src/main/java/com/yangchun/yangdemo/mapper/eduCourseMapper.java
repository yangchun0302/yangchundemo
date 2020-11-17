package com.yangchun.yangdemo.mapper;

import com.yangchun.yangdemo.pojo.eduCourse;
import com.yangchun.yangdemo.pojo.eduCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface eduCourseMapper {
    long countByExample(eduCourseExample example);

    int deleteByExample(eduCourseExample example);

    int deleteByPrimaryKey(String id);

    int insert(eduCourse record);

    int insertSelective(eduCourse record);

    List<eduCourse> selectByExample(eduCourseExample example);

    eduCourse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") eduCourse record, @Param("example") eduCourseExample example);

    int updateByExample(@Param("record") eduCourse record, @Param("example") eduCourseExample example);

    int updateByPrimaryKeySelective(eduCourse record);

    int updateByPrimaryKey(eduCourse record);
}