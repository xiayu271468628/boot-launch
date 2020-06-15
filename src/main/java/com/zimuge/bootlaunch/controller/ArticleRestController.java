package com.zimuge.bootlaunch.controller;

import com.zimuge.bootlaunch.model.AjaxResponse;
import com.zimuge.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author ：xy
 * @date ：Created in 2020/6/4 16:32
 * @description：
 * @modified By：
 * @version: $
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //获取一篇Article，使用GET方法
    @GetMapping(value = "/articles/{id}",produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {
        //使用lombok提供的builder构建对象
        Article article = new Article();
        article.setId(1);
        article.setAuthor("zimug");
        article.setContent("spring boot 2.深入浅出");
        article.setCreateTime(new Date());
        article.setTitle("t1");
        return AjaxResponse.success(article);
    }
    //增加一篇Article ，使用POST方法
    @PostMapping(value = "/articles", produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        log.info("saveArticle：{}",article);
        return AjaxResponse.success(article);
    }

    //删除一篇Article，使用DELETE方法，参数是id
    @DeleteMapping(value = "/articles/{id}", produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        log.info("deleteArticle：{}",id);
        return AjaxResponse.success(id);
    }

    //更新一篇Article，使用PUT方法，以id为主键进行更新
    @PutMapping(value = "/articles", produces = "application/json")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        //article.id是必传参数，因为通常根据id去修改数据
        log.info("updateArticle：{}",article);
        return AjaxResponse.success(article);
    }
}
