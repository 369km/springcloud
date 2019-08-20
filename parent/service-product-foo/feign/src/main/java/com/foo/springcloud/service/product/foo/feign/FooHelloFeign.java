package com.foo.springcloud.service.product.foo.feign;

import com.foo.springcloud.service.product.foo.api.HelloApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-product-foo", fallbackFactory = FooHelloFallbackFactory.class)

public interface FooHelloFeign extends HelloApi {
}
