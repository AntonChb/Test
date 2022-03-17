package com.example.dodo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Min;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Идентификатор")
    private Integer id;

    // @Min(value = 1)
    @Schema(description = "Возраст собаки")
    private Integer age;

    @Schema(description = "Номер клетки собаки")
    private Integer num;

    @Override
    public int compareTo(Dog d){

        return this.id - d.id;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "personal_id", nullable = false)
    private Personal personal;

}