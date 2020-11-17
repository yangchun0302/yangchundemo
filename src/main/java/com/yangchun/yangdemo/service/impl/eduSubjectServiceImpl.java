package com.yangchun.yangdemo.service.impl;

import com.yangchun.yangdemo.mapper.eduSubjectMapper;
import com.yangchun.yangdemo.pojo.eduSubject;
import com.yangchun.yangdemo.service.eduSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangchun
 * @create 2020-09-07 22:34
 */
@Service
public class eduSubjectServiceImpl implements eduSubjectService {
 @Autowired
 private eduSubjectMapper eduSubjectMapper;

    @Override
    public eduSubject selectbyId(String id) {


        eduSubject eduSubject = eduSubjectMapper.selectByPrimaryKey(id);
        return eduSubject;
    }
}
