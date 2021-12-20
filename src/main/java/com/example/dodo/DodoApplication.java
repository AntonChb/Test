package com.example.dodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DodoApplication.class, args);
    }

}