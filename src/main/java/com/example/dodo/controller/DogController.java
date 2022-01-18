package com.example.dodo.controller;

import com.example.dodo.models.Dog;
import com.example.dodo.service.DogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import com.example.dodo.service.DogSerImp2;

@RestController
@Controller
public class DogController {

    @Autowired
    private DogService dogService;

    //    @Autowired
//    private DogSerImp2 dogSerImp2;

    @Operation(
            summary = "Вывод всех собак",
            description = "Позволяет оплучить весь список собак"
    )
    @GetMapping(path = "/dog")
    public List<Dog> getAllDogs() {
        return dogService.findAll();
    }

    @Operation(
            summary = "Вывод собаки по id",
            description = "Позволяет оплучить собаку по id"
    )
    @GetMapping(path = "/dogid")
    public Dog dog(@RequestParam Integer id) {
        return dogService.getById(id);
    }

    @Operation(
            summary = "Добавить новую собаку",
            description = "Позволяет добавить новую собаку"
    )
    @PostMapping(path = "/dog")
    public Dog addNewDog(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

    @Operation(
            summary = "Изменить данные о собаке",
            description = "Позволяет внести изменения о собаке"
    )
    @PutMapping("/dog")
    public Dog puttDog(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

    @Operation(
            summary = "Удалить собаку",
            description = "Позволяет удалить собаку"
    )
    @DeleteMapping("/dog")
    public void deleteDog(@Parameter(description = "Удалить собаку по id") @RequestParam Integer id) {
        dogService.deleteById(id);
    }

    @Operation(
            summary = "Вывод собак с новыми именами",
            description = "Собаки с измененными именами"
    )
    @GetMapping(path = "/dognn")
    public List<String> findByName(@RequestParam(name = "name", required = false) String name) {
        return dogService.findByName(name);
    }
}