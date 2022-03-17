//package com.example.dodo.controller;
//
//import com.example.dodo.models.Dog;
//import com.example.dodo.service.DogService;
//import com.example.dodo.service.serviceImp.DogServiceImp;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(MockitoJUnitRunner.class)
//class DogControllerTest {
//
//    @Autowired
//    DogServiceImp dogServiceImp;
//
//    @Autowired
//    DogService dogService;
//
//    @Mock
//    private List<Dog> dog;
//
////    @Before
////    public void setUp() {
////        Mockito.when(dogServiceImp.findAll()).thenReturn(dog);
////        ReflectionTestUtils.setField(dogDtoServiceImp,
////                "url", "http://localhost:8080/dog");
////}
//
//    @Test
//    public void getAllDogsTest() {
//        List<Dog> dog = new ArrayList<>();
//        dog.add(new Dog());
//
//        Mockito.when(dogServiceImp.findAll()).thenReturn(dog);
//
//        List<Dog> result = dogServiceImp.findAll();
//        Assert.assertEquals(result, dog);
//    }
//}