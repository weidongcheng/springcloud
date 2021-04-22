package com.wdc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;

/**
 * Created by wdc on 2021/4/21 17:24
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        logger.info("request one name is "+name);
        return "hello "+name+", this is first message";
    }
}
