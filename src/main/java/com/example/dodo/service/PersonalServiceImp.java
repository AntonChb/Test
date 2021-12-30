package com.example.dodo.service;

import com.example.dodo.Personal;
import com.example.dodo.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImp implements PersonalService {

    @Autowired
    PersonalRepository personalRepository;

    @Override
    public List<Personal> findAll() {
        return personalRepository.findAll();
    }

    @Override
    public Personal save(Personal dog) {
        System.out.println("Мы сохранили нового дога");
        return personalRepository.save(dog);
    }

    @Override
    public void deleteById(Integer id) {
        personalRepository.deleteById(id);
    }

    @Override
    public Personal getById(Integer id) {
        return personalRepository.getById(id);
    }
}