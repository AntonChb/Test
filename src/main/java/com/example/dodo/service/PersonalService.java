package com.example.dodo.service;

import com.example.dodo.models.Personal;

import java.util.List;

public interface PersonalService {

    List<Personal> findAll();

    Personal save(Personal personal);

    void deleteById(Integer id);

    Personal getById(Integer id);


}