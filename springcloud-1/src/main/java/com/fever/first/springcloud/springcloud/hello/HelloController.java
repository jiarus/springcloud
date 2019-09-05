package com.fever.first.springcloud.springcloud.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        System.out.println("------------------------------");
       // Thread.sleep(5000L);
        return "produce1:hello world";
    }
}
