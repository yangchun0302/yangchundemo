package com.yangchun.yangdemo.service.impl;

import com.yangchun.yangdemo.mapper.eduCourseMapper;
import com.yangchun.yangdemo.pojo.eduCourse;
import com.yangchun.yangdemo.service.eduCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangchun
 * @create 2020-09-07 20:39
 */
@Service
public class eduCourseServiceImpl implements eduCourseService {

@Autowired
private eduCourseMapper eduCourseMapper;
    @Override
    public eduCourse selectbyid(String id) {



        eduCourse eduCourse = eduCourseMapper.selectByPrimaryKey(id);
        return eduCourse;
    }
}
