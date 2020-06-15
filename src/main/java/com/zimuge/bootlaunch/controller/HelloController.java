package com.zimuge.bootlaunch.controller;


import com.zimuge.bootlaunch.model.Article;
import com.zimuge.bootlaunch.model.yml.Family;
import com.zimuge.bootlaunch.spel.EmployeeConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    Family family;
    @Resource
    EmployeeConfig employeeConfig;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        //Article article = new Article(1,"小明");
        Article article1 = new Article();
        article1.setId(2);
        article1.setAuthor("小红");
        log.info(article1.getAuthor());
        System.out.println(employeeConfig);
        return "hello world： " +article1.getAuthor();
    }
}
