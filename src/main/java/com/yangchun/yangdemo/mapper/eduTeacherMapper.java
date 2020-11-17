package com.yangchun.yangdemo.mapper;

import com.yangchun.yangdemo.pojo.eduTeacher;
import com.yangchun.yangdemo.pojo.eduTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface eduTeacherMapper {
    long countByExample(eduTeacherExample example);

    int deleteByExample(eduTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(eduTeacher record);

    int insertSelective(eduTeacher record);

    List<eduTeacher> selectByExample(eduTeacherExample example);

    eduTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") eduTeacher record, @Param("example") eduTeacherExample example);

    int updateByExample(@Param("record") eduTeacher record, @Param("example") eduTeacherExample example);

    int updateByPrimaryKeySelective(eduTeacher record);

    int updateByPrimaryKey(eduTeacher record);
}