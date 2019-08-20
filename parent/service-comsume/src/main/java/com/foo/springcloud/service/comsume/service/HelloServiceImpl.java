package com.foo.springcloud.service.comsume.service;

import com.foo.springcloud.service.product.feign.FooHelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private FooHelloFeign fooHelloFeign;

    @Override
    public String hello() {
        return build("service-comsume call ",fooHelloFeign.hello());
    }

    private String build(String arg1, String args2) {
        return arg1 + args2;
    }
}
