package com.example.dodo.controller;

import com.example.dodo.models.Personal;
import com.example.dodo.service.PersonalService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Controller
public class PersonalController {

    @Autowired
    private PersonalService personalService;


    @Operation(
            summary = "Вывод всех пользователей",
            description = "Позволяет получить весь список пользователей"
    )

    @GetMapping(path = "/personal")
    public List<Personal> getAllPers() {
        return personalService.findAll();
    }

    @Operation(
            summary = "Вывод пользователей по id",
            description = "Позволяет оплучить пользователея по id"
    )
    @GetMapping(path = "/personalid")
    public Personal personal(@RequestParam Integer id) {
        return personalService.getById(id);
    }

    @Operation(
            summary = "Добавить нового пользователя",
            description = "Позволяет добавить нового пользователя"
    )
    @PostMapping(path = "/personal")
    public Personal addNewUser(@RequestBody Personal personal) {
        return personalService.save(personal);
    }

    @Operation(
            summary = "Изменить данные о пользователе",
            description = "Позволяет внести изменения о пользователе"
    )
    @PutMapping("/personal")
    public Personal puttUser(@RequestBody Personal personal) {
        return personalService.save(personal);
    }

    @Operation(
            summary = "Удалить пользователя",
            description = "Позволяет удалить пользователя"
    )
    @DeleteMapping("/personal")
    public void deleteUser(@Parameter(description = "Удалить пользователя по id") @RequestParam Integer id) {
        personalService.deleteById(id);
    }
    @PostMapping(path = "/personal2")
    public Personal doTransaction (@RequestBody Personal personal) {
        return personalService.save(personal);
    }


}