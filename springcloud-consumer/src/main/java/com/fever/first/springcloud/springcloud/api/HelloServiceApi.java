package com.fever.first.springcloud.springcloud.api;

import com.fever.first.springcloud.springcloud.fallback.HelloServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "producer", fallback = HelloServiceFallBack.class)
@Component
public interface HelloServiceApi {

    @GetMapping("/hello")
    String say();
}
