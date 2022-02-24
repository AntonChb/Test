package com.example.dodo.service;

import com.example.dodo.DodoApplication;
import com.example.dodo.controller.DogController;
import com.example.dodo.models.Dog;
import com.example.dodo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImp implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dog> findAll() {
        return dogRepository.findAll();
    }

    @Override
    public Dog save(Dog dog) {
        System.out.println("Мы сохранили нового дога");
        return dogRepository.save(dog);
    }

    @Override
    public void deleteById(Integer id) {
        dogRepository.deleteById(id);
    }

    @Override
    public Dog getById(Integer id) {
        return dogRepository.getById(id);
    }

    @Override
    public List<String> findByName(String name) {
        return dogRepository.f(name);
    }


}