package com.example.dodo.service.serviceImp;

import com.example.dodo.models.Dog;
import com.example.dodo.repository.DogRepository;
import com.example.dodo.service.DogService;
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