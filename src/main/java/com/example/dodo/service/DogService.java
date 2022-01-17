package com.example.dodo.service;

import com.example.dodo.models.Dog;
import com.example.dodo.repository.DogRepository;
import java.util.List;


public interface DogService {

    static List<Dog> findByName(String name) {
        return DogRepository.f(name);
    }

    List<Dog> findAll();
    Dog save(Dog dog);
    void deleteById(Integer id);
    Dog getById(Integer id);

}
