package com.madjikha.exp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @GetMapping("/")
    public String getHello(){
        return "hello word";
    }


    @PostMapping("/hello")
    public String postHello(@RequestBody HelloPOJO hello){
        return hello.getText();
    }
}
