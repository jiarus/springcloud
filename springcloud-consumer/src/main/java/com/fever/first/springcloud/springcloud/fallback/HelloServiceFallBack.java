package com.fever.first.springcloud.springcloud.fallback;

import com.fever.first.springcloud.springcloud.api.HelloServiceApi;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceFallBack implements HelloServiceApi {
    @Override
    public String say() {
        //System.out.println("error");
        return "fallback1";
    }
}
