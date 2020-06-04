package com.zimuge.bootlaunch.controller;


import com.zimuge.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        //Article article = new Article(1,"小明");
        Article article1 = new Article();
        article1.setId(2);
        article1.setAuthor("小红");
        log.info(article1.getAuthor());
        return "hello world： " +article1.getAuthor();
    }
}
