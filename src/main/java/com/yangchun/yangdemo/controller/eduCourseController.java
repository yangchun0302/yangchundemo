package com.yangchun.yangdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yangchun.yangdemo.comont.R;
import com.yangchun.yangdemo.pojo.eduCourse;
import com.yangchun.yangdemo.pojo.eduSubject;
import com.yangchun.yangdemo.service.eduCourseService;
import com.yangchun.yangdemo.service.eduSubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/yangchun/{id}/{id2}")
  public String json(@PathVariable String id, @PathVariable String id2) {
    eduSubject eduSubject = eduSubjectService.selectbyId(id);
    eduCourse eduCourse = eduCourseService.selectbyid(id2);

    Map<String, Object> map = new HashMap<>();
    map.put("eduSubject", eduSubject);
    map.put("eduCourse", eduCourse);

    String string = JSONObject.toJSONString(map, SerializerFeature.WriteNullStringAsEmpty);

    return string;
  }

  @PostMapping("/edu")
  public R test(@RequestBody eduCourse eduCourse) {
    int i = eduCourseService.save(eduCourse);
    if (i != 0) {
      System.out.println("你好");
      return R.ok();
    }
    return R.error();
  }

  public static void main(String[] args) {
    System.out.println("努力学习");
  }
}
