package com.yangchun.yangdemo.service;

import com.yangchun.yangdemo.pojo.eduCourse;
import org.springframework.stereotype.Component;

/**
 * @author yangchun
 * @create 2020-09-07 20:36
 */
@Component
public interface eduCourseService {

    eduCourse selectbyid(String id);
}
