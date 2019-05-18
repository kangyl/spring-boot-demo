/**
 * Copyright
 */
package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *@author : kangyl(460720197@qq.com)
 *@date: 2019/5/18
 */
@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String index() {
        return "hello,this is a springboot app";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
