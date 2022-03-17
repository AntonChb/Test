package com.example.dodo.repository;

import com.example.dodo.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {

    @Modifying
    @Query(value = "UPDATE dog SET name = 'СТАРЫЙ' WHERE age>5", nativeQuery = true)
    List <String> f(String name);

    @Query(value = "SELECT age FROM DOG WHERE id=1", nativeQuery = true)
    Integer a();




}