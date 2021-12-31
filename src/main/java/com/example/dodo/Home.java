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
@Table(name = "home")
@Schema(description = "Дом")

public class Home {

    @OneToOne
    @MapsId
    @JoinColumn(name = "home")
    private Personal personal;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    @Column(name="id")
    private Integer id;

    @Schema(description = "Название улицы")
    private String street;

    @Schema(description = "Номер дома")
    private Integer homenum;

    @Schema(description = "ID Пользователя")
    private Integer user_id;

}