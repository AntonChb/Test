package com.example.dodo.repository;

import com.example.dodo.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository <Dog, Integer> {

    @Query("SELECT DISTINCT name FROM Dog WHERE age > 10")
    List <String> f (String name);

//    @Modifying



}