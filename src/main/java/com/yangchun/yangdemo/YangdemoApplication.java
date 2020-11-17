package com.yangchun.yangdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yangchun.yangdemo.mapper")
public class YangdemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(YangdemoApplication.class, args);
  }
}
