package com.example.dodo.repository;

import com.example.dodo.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository <Personal, Integer> {


}