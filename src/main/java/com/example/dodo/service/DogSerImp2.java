//package com.example.dodo.service;
//
//import com.example.dodo.models.Dog;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class DogSerImp2 {
//
//    Dog dog1 = new Dog(1, "Таня", 33, 877);
//    Dog dog2 = new Dog(2, "Ваня", 44, 121);
//    Dog dog3 = new Dog(3, "Саня", 55, 456);
//
////    public List<Dog> dogList() {
////
////        List<Dog> dog = new ArrayList<>();
////        dog.add(dog1);
////        dog.add(dog2);
////        dog.add(dog3);
////
////        return dog;
////    }
//
//    public Set<Map.Entry<String, Dog>> getHashMap() {
//        //кладем в лист
//        List<Dog> dog = new ArrayList<>();
//        dog.add(dog1);
//        dog.add(dog2);
//        dog.add(dog3);
//
//        //кладем в мапу
//        Map<String, Dog> dogMap = new HashMap<>();
//        dog.forEach(s -> {
//            dogMap.put(s.getName(), s);
//        });
//
//        //кладем в дерево
//        TreeSet<Dog> dogTreeSet = new TreeSet<>();
//        for (Map.Entry<String, Dog> entry : dogMap.entrySet()) {
//            dogTreeSet.add(entry.getValue());
//        }
//        //Чистим лист и перекладываем из дерево в лист
//         dog.clear();
//        dogTreeSet.forEach(s -> {
//            dog.add(s);
//        });
//        for (Object o : dogTreeSet) {
//            //все
//            System.out.println(o);
//        }
//        return null;
//    }
//}