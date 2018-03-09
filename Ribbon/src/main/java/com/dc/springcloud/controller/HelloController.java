package com.dc.springcloud.controller;

import com.dc.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaojunc on 2018/3/9 18:03.
 * Created Reason:
 */
@RestController
public class HelloController {

    private HelloService helloService;

    @RequestMapping(value = "hi")
    public String hello(@RequestParam String name){
        return helloService.hiService(name);
    }

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
