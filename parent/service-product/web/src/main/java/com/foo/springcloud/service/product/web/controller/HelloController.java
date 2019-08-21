package com.foo.springcloud.service.product.web.controller;

import com.foo.springcloud.service.product.api.HelloApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController implements HelloApi {
    @Value("${server.port}")
    private String port;
    @Override
    public String hello() {
        long time=(long) (Math.random()*3000);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(time);
        return "foo : "+port;
    }
}
