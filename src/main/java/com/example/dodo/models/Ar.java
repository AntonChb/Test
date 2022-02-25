package com.example.dodo.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ar")
@Schema(description = "Массив")

public class Ar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    private Integer id;

    @Schema(description = "Имя")
    private Integer arraysInt;

    public Ar(Integer s) {
        arraysInt = s;
    }
}