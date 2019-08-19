package com.foo.feign;

import com.foo.api.TangPoetryApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "poetry",fallback = TangPoetryHystrix.class)//web spring.application.name
public interface TangPoetryFeign extends TangPoetryApi {
}
