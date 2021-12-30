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

//    @OneToOne
//    @JoinColumn(name = "id")
//    private Personal user;
//
////    @OneToOne(cascade = CascadeType.ALL, mappedBy = "id")
////    public Personal getUser() {
////        return user;
////    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    private Integer id;

    @Schema(description = "Название улицы")
    private String street;

    @Schema(description = "Номер дома")
    private Integer homenum;

}