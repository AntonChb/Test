package com.example.dodo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "ar")
@Schema(description = "Массив")

public class Ar {

    Ar save(Ar ar) {
        return null;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Идентификатор")
    private Integer id;

    @Schema(description = "Имя")
    private String name;

    }