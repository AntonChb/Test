package com.example.dodo;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "dog")  //** измени большую букву, на маленькую(Называется регистор) в бд. должно заработать и в доге не забуть поправить //

public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private Integer num;
}