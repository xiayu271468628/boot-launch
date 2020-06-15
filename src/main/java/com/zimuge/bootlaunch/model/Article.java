package com.zimuge.bootlaunch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author ：xy
 * @date ：Created in 2020/6/4 15:40
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonPropertyOrder(value={"pname1","pname2"}) 改变子属性在JSON序列化中的默认定义的顺序。如：param1在先，param2在后。
public class Article {

    @JsonIgnore //排除某个属性不做序列化与反序列化
    private int  id;
    //@JsonProperty(auther) 为属性起一个别名，体现在JSON数据里面
    private String author;
    private String title;
    private String content;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") //指定日期类型的属性格式(已经在yml文件中进行全局配置)
    @JsonInclude(JsonInclude.Include.NON_NULL) //排除为空的元素不做序列化反序列化
    private Date createTime;
}
