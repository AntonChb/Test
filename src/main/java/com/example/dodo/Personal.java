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
@Table(name = "personal")
@Schema(description = "Пользователи")

public class Personal {

//    @OneToOne
//    @JoinColumn(name = "home_id")
//    private Home home;
//
////    @OneToOne
////    @JoinColumn(name = "home_id", referencedColumnName = "home_id")
////    public Home getHome() {
////        return this.home;
////    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    private Integer id;

    @Schema(description = "Имя пользователя")
    private String name;

    @Schema(description = "Возраст пользователя")
    private Integer age;

}