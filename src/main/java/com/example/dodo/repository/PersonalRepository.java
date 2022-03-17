package com.example.dodo.repository;

import com.example.dodo.models.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.Collection;
import java.util.List;

@Repository
public interface PersonalRepository extends JpaRepository <Personal, Integer> {


    @Query(value = "SELECT NAME from Personal WHERE id=1",nativeQuery = true)
    String s();

}