package com.example.dodo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@NoArgsConstructor
@Getter
@Setter
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

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "home_id", referencedColumnName = "id")
//    private Home home;

    @OneToMany (mappedBy = "personal")
    private Set<Dog> dog;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "personal_lakes",
//            joinColumns = @JoinColumn(name = "pers_id"),
//            inverseJoinColumns = @JoinColumn(name = "lake_id")
//    )
//    private Set<Lakes> lakes;

}