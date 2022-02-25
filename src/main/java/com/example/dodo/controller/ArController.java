package com.example.dodo.controller;

import com.example.dodo.models.Ar;
import com.example.dodo.service.ArService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class ArController {

    @Autowired
    private ArService arService;

    @Operation(
            summary = "Добавить числа из массива",
            description = "Позволяет добавить числа из массива"
    )
    @PostMapping(path = "/ar")
    public List<Ar> addNewAr() {
        return arService.save();
    }
}