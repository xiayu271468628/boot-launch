package com.zimuge.bootlaunch.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author ：xy
 * @date ：Created in 2020/6/9 16:11
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
@PropertySource (value = "classpath:employee.properties")
public class EmployeeConfig {

    //使用SpEL读取employee.properties配置文件
    @Value("#{'${employee.names}'.split(',')}")//使用SpEL表达式读取了employee.names属性，并将其从字符串属性，以逗号为分隔符转换为List类型。
    //假如我们需要获取第一位（数组下标从0开始）雇员的姓名，可以使用如下的SpEL表达式：@Value ("#{'${employee.names}'.split(',')[0]}")
    private List<String> employeeNames;

    @Value ("#{${employee.age}}")//使用@Value注解将键值对、类对象的数据结构转换为java的Map数据类型
    //我们需要根据Map的Key获取Value属性，可以使用如下的SpEL表达式：@Value ("#{${employee.age}.two}")
    //我们不确定，Map中的某个key是否存在，可以使用如下的SpEL表达式。如果key存在就获取对应的value，如果不存在就获得默认值31:@Value ("#{${employee.age}['five'] ?: 31}")
    private Map<String, Integer> employeeAge;

    //可以使用SpEL表达式读取系统环境变量，示例如下，获取JAVA_HOME目录：
    @Value ("#{systemProperties['java.home']}")
    private String javaHome;

    //可以获取系统用户工作目录
    @Value ("#{systemProperties['user.dir']}")
    private String userDir;
}
