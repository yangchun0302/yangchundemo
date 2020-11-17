package com.yangchun.yangdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yangchun.yangdemo.pojo.eduCourse;
import com.yangchun.yangdemo.pojo.eduSubject;
import com.yangchun.yangdemo.service.eduCourseService;
import com.yangchun.yangdemo.service.eduSubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangchun
 * @create 2020-09-07 20:59
 */
@Slf4j
@RestController
@RequestMapping("/edu")
public class eduCourseController {

  @Autowired private eduCourseService eduCourseService;

  @Autowired private eduSubjectService eduSubjectService;

  @GetMapping("/yangchun")
  public String json() {
    eduSubject eduSubject = eduSubjectService.selectbyId("1271031333719699457");
    eduCourse eduCourse = eduCourseService.selectbyid("1271284233452666882");

    Map<String, Object> map = new HashMap<>();
    map.put("eduSubject", eduSubject);
    map.put("eduCourse", eduCourse);

    String string = JSONObject.toJSONString(map, SerializerFeature.WriteNullStringAsEmpty);


    ThreadLocal t =new ThreadLocal();
    return string;
  }
}
