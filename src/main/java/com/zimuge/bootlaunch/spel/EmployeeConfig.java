package com.zimuge.bootlaunch.model.yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * @author ：xy
 * @date ：Created in 2020/6/9 16:11
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
@PropertySource (value = "classpath:employee.properties")
@ConfigurationProperties
public class EmployeeConfig {

    //使用SpEL读取employee.properties配置文件
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;
}
