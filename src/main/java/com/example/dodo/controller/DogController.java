package com.example.dodo.controller;

import com.example.dodo.Dog;
import com.example.dodo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping(path = "/dog")
    public List<Dog> getAllDogs(/*@RequestParam Integer id*/) {
        return dogService.findAll();
    }

    @GetMapping(path = "/dogid")
    public Dog dog (@RequestParam Integer id) {
        return dogService.getById(id);
    }

    @PostMapping(path = "/dog")
    public Dog addNewDog(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

    @PutMapping("/dog")
    public Dog puttDog(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

    @DeleteMapping("/dog")
    public void deleteDog(@RequestParam Integer id) {
        dogService.deleteById(id);

    }
}