package com.example.dodo.controller;

import com.example.dodo.models.Lakes;
import com.example.dodo.service.LakesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class LakesController {

    @Autowired
    private LakesService lakesService;


    @Operation(
            summary = "Вывод всех озер",
            description = "Позволяет получить весь список озер"
    )

    @GetMapping(path = "/lakes")
    public List<Lakes> getAllLakes() {
        return lakesService.findAll();
    }

    @Operation(
            summary = "Вывод озер по id",
            description = "Позволяет оплучить озеро по id"
    )
    @GetMapping(path = "/lakesid")
    public Lakes lakes(@RequestParam Integer id) {
        return lakesService.getById(id);
    }

    @Operation(
            summary = "Добавить новое озеро",
            description = "Позволяет добавить новое озеро"
    )
    @PostMapping(path = "/lakes")
    public Lakes addNewLakes(@RequestBody Lakes personal) {
        return lakesService.save(personal);
    }

    @Operation(
            summary = "Изменить данные о озере",
            description = "Позволяет внести изменения об озере"
    )
    @PutMapping("/lakes")
    public Lakes puttLakes(@RequestBody Lakes personal) {
        return lakesService.save(personal);
    }

    @Operation(
            summary = "Удалить озеро",
            description = "Позволяет удалить озеро"
    )
    @DeleteMapping("/lakes")
    public void deleteLakes(@Parameter(description = "Удалить озеро по id") @RequestParam Integer id) {
        lakesService.deleteById(id);
    }
}
