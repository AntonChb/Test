package com.example.dodo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "home")
@Schema(description = "Дом")

public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    @Column(name="id")
    private Integer id;

    @Schema(description = "Название улицы")
    private String street;

    @Schema(description = "Номер дома")
    private Integer home;

    @Schema(description = "ID Пользователя")
    private Integer user_id;
//    @JsonIgnore
//    @OneToOne(mappedBy = "home")
//    private Personal personal;

}