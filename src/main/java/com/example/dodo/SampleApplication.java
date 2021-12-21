//package com.example.dodo;
//
//import io.swagger.jaxrs.config.BeanConfig;
//import javax.ws.rs.ApplicationPath;
//
//@ApplicationPath( "api" )
//
//    public class SampleApplication {
//
//        public SampleApplication() {
//
//            BeanConfig beanConfig = new BeanConfig();
//            beanConfig.setVersion("1.0.0");
//            beanConfig.setSchemes(new String[]{"http"});
//            beanConfig.setHost("localhost:8080");
//            beanConfig.setBasePath("my-rest-1.0.0/api");
//            beanConfig.setResourcePackage(EchoRest.class.getPackage().getName());
//            beanConfig.setTitle("JAX-RS + Swagger and Swagger UI Example");
//            beanConfig.setDescription("Sample RESTful API built using JAX-RS, Swagger and Swagger UI");
//            beanConfig.setScan(true);
//        }
//    }