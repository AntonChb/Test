package com.example.dodo.service;

import com.example.dodo.models.Home;
import com.example.dodo.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImp implements HomeService {

    @Autowired
    HomeRepository homeRepository;

    @Override
    public List<Home> findAll() {
        return homeRepository.findAll();
    }

    @Override
    public Home save(Home home) {
        System.out.println("Мы сохранили новый дом");
        return homeRepository.save(home);
    }

    @Override
    public void deleteById(Integer id) {
        homeRepository.deleteById(id);
    }

    @Override
    public Home getById(Integer id) {
        return homeRepository.getById(id);
    }
}