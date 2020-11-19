package com.yangchun.yangdemo.comont;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @author yangchun
 * @create 2020-11-19 23:03
 */
@Data
public class R {

  @ApiModelProperty("返回的消息")
  private String message;

  @ApiModelProperty("返回的状态码")
  private Integer code;

  @ApiModelProperty("是否成功")
  private Boolean success;

  @ApiModelProperty("返回的数据")
  private Map<String, Object> data;

  private R() {}

  public static R ok() {
    R r = new R();

    r.setSuccess(true);

    r.setCode(200);
    r.setMessage("成功");
    return r;
  }

  public static R error() {

    R r = new R();

    r.setCode(40000);

    r.setMessage("失败");

    r.setSuccess(false);

    return r;
  }

  public R success(Boolean success) {
    this.setSuccess(success);
    return this;
  }

  public R code(Integer code) {
    this.setCode(code);
    return this;
  }

  public R messages(String message) {
    this.setMessage(message);

    return this;
  }

  public R data(String key, Object value) {

    this.data.put(key, value);

    return this;
  }

  public R data(Map<String, Object> map) {

    this.setData(map);

    return this;
  }
}
