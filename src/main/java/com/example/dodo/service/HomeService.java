package com.example.dodo.service;

import com.example.dodo.Home;

import java.util.List;

public interface HomeService {

    List<Home> findAll();
    Home save(Home home);
    void deleteById(Integer id);
    Home getById(Integer id);
}




