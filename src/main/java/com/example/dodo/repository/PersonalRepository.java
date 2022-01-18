package com.example.dodo.repository;

import com.example.dodo.models.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonalRepository extends JpaRepository <Personal, Integer> {

}