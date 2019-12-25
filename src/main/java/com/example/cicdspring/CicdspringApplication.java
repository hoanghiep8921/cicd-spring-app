package com.example.cicdspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdspringApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Lô con cù kỳ";
    }

}
