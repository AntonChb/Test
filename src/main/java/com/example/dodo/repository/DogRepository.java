package com.example.dodo.repository;

import com.example.dodo.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository <Dog, Integer> {
}

