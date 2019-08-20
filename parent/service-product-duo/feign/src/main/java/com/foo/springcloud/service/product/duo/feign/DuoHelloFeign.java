package com.foo.springcloud.service.product.duo.feign;

import com.foo.springcloud.service.product.duo.api.HelloApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-product-duo", fallbackFactory = DuoHelloFallbackFactory.class)
public interface DuoHelloFeign extends HelloApi {
}
