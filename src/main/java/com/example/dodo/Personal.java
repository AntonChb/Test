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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Идентификатор")
    @Column(name="id")
    private Integer id;

    @Schema(description = "Имя пользователя")
    private String name;

    @Schema(description = "Возраст пользователя")
    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_id", referencedColumnName = "id")
    private Home home;

}