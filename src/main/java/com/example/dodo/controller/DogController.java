package com.example.dodo.controller;

import com.example.dodo.Dog;
import com.example.dodo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller

public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping(path = "/dog")
    public Iterable<Dog> getAllDogs(@RequestParam Integer id) {
        return dogService.find(id);
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
    public String deleteDog(@PathVariable Integer id) {//ты когда чтото удаляешь тебе нужен идентификатор его сюда нужно прислать с фронта
        dogService.deleteById(id);
        return "ok";
    }
}