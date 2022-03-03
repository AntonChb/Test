package com.example.dodo.repository;

import com.example.dodo.models.Ar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArRepository extends JpaRepository<Ar, Integer> {

}
