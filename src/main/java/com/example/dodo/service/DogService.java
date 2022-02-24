package com.example.dodo.service;

import com.example.dodo.models.Dog;

import java.util.List;

public interface DogService {

    List<Dog> findAll();
    Dog save(Dog dog);
    void deleteById(Integer id);
    Dog getById(Integer id);
    List<String> findByName(String name);
}
