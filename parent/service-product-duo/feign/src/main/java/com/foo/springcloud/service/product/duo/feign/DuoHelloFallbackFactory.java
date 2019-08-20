package com.foo.springcloud.service.product.duo.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DuoHelloFallbackFactory implements FallbackFactory<DuoHelloFeign> {

    @Override
    public DuoHelloFeign create(Throwable throwable) {
        return () -> "";
    }
}
