package com.example.dodo.service;

import com.example.dodo.Dog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface DogService {

    List<Dog> find(Integer id);
    Dog save(Dog dog);
    void deleteById(Integer id);
}