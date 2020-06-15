package com.zimuge.bootlaunch.model.yml;

import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author ：xy
 * @date ：Created in 2020/6/9 14:53
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class Father {
    private String name;
    @Min(18)//数据必须大于或者等于18
    private Integer age;
}
