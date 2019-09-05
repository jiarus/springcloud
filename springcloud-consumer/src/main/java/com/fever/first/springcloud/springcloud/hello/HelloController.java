package com.fever.first.springcloud.springcloud.hello;


import com.fever.first.springcloud.springcloud.api.HelloServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private HelloServiceApi helloServiceApi;

    @GetMapping("/say")
    public String hello(){
        //System.out.println(111);
        //System.out.println(111);
        return helloServiceApi.say();
    }
}
