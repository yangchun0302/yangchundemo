package com.yangchun.yangdemo.mapper;

import com.yangchun.yangdemo.pojo.eduSubject;
import com.yangchun.yangdemo.pojo.eduSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface eduSubjectMapper {
    long countByExample(eduSubjectExample example);

    int deleteByExample(eduSubjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(eduSubject record);

    int insertSelective(eduSubject record);

    List<eduSubject> selectByExample(eduSubjectExample example);

    eduSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") eduSubject record, @Param("example") eduSubjectExample example);

    int updateByExample(@Param("record") eduSubject record, @Param("example") eduSubjectExample example);

    int updateByPrimaryKeySelective(eduSubject record);

    int updateByPrimaryKey(eduSubject record);
}