package com.example.dodo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "dog")
@Schema(description = "Сущность пользователя")

public class Dog implements Comparable<Dog> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    private Integer id;

    @Schema(description = "Имя собаки")
    private String name;

    @Schema(description = "Возраст собаки")
    private Integer age;

    @Schema(description = "Номер клетки собаки")
    private Integer num;

    @Override
    public int compareTo(Dog d){

        return this.id - d.id;
    }

}