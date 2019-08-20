package com.foo.springcloud.service.comsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrix
@EnableFeignClients(basePackages = "com.foo.springcloud")
@SpringBootApplication(scanBasePackages = {"com.foo.springcloud"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
