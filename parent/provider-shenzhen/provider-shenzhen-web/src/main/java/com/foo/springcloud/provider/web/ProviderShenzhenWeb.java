package com.foo.springcloud.provider.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderShenzhenWeb {
    public static void main(String[] args) {
        SpringApplication.run(ProviderShenzhenWeb.class, args);
    }
}
