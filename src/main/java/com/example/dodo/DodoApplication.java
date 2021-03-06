package com.example.dodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.dodo.repository")
@ComponentScan("com.example.dodo")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableAutoConfiguration

public class DodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DodoApplication.class, args);

//        for(int i = 1; i <= 100; i++){
//            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz"
//                    : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz":i);
//        }
//        }
    }
}
