package demorestapi.demo_restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import demorestapi.demo_restapi.entity.UserEntity;

public interface  UserOperation {
  @PostMapping(value="/user")
  UserEntity createUser(@RequestBody UserEntity userEntity);

 
  
}
