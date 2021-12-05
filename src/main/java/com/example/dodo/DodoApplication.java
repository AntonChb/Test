package com.example.dodo;

import com.sun.deploy.security.JarSignature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DodoApplication {

    private JarSignature jdbcOperations;
    int result;

    public static void main(String[] args) {
        SpringApplication.run(DodoApplication.class, args);
    }

    Dog dog = null;

    @GetMapping("/dog")
    public Dog dog1(Long id) {
        //serviceDog.getById(id);
        return this.dog;
    }


    @PostMapping("/dog")
    public Dog postDog(@RequestBody Dog dog) throws Exception {
        dog.setId(3);
        this.dog = dog;
//        try {
//            if (dog.getAge() > 20)
//
//        throw new Exception();
//        }catch (Exception e)
//        {
//            ///logger
//        }
//        //serviceDog.save(dog);
        return dog;
    }

    @PutMapping("/dog")
    public Dog puttDog(@RequestBody Dog dog) {
        dog.setId(3);
        this.dog = dog;
        return dog;
    }

    @DeleteMapping("/dog")
    public String deleteDog() {
        this.dog = null;
        return "Файл удален";
        //@PathVariable Long id
        //serviceDog.delteById(id);

    }
}