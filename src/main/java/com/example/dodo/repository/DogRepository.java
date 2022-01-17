package com.example.dodo.repository;

import com.example.dodo.models.Dog;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {

//    @Modifying
//    @Query("UPDATE Dog SET name = :newName || name")
//    void addNewName(@Param("newName")String newName);
//    newName = "asdasd"

//    @Modifying
//    @Query(value = "SELECT * FROM a_user where name = :name", nativeQuery = true)
//    List<Dog> findByName(@Param("name") String name);

    @Modifying
    //@Transactional(readOnly = true)
    @Query("select p from Dog p where p.personal.id=:id and p.name like :name")
    static List<Dog> f(String name) {
        return null;
    }


}