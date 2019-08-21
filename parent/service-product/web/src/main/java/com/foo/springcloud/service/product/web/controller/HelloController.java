package com.foo.springcloud.service.product.web.controller;

import com.foo.springcloud.service.product.api.HelloApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @Value("${server.port}")
    private String port;

    @Override
    public String hello() {
        //do buz time
        long time = (long) (Math.random() * 3000);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = "foo : " + port;
        LOGGER.info("result:{},use-time:{}", result, time);
        return result;
    }
}
