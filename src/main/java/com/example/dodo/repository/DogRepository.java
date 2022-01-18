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
    @Query(value = "UPDATE dog SET name = 'sad' WHERE name = 'Шарик'", nativeQuery = true)
    List <String> f(String name);

//    @Modifying
//    @Query("UPDATE Note n SET n.title = ?1 WHERE n.id = ?2")
//    int updateTitleById(String title, Long id);

//    UPDATE FamilyMembers
//    SET member_name='Andie Anthony'
//    WHERE member_name='Andie Quincey';

}