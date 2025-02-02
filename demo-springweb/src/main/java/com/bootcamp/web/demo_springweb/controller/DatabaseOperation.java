package com.bootcamp.web.demo_springweb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.web.demo_springweb.model.ApiResp;
import com.bootcamp.web.demo_springweb.model.Dog;

public interface  DatabaseOperation  {
  
  @PostMapping(value="/dog/{name}/{age}")
  public Dog createDog(@PathVariable String name, @PathVariable int age);

  @GetMapping(value="/dogs")
  public List<Dog> getAlldog();

  @GetMapping(value="/dog/name/{name}")
  public List<Dog> getDogs(@PathVariable String name);

  @GetMapping(value="/dog/age/{age}")
  public List<Dog> getAge(@PathVariable int age);

  @PutMapping(value="/dog/{index}") //index 用array's index次序
  public ApiResp<Dog> updaDog(@PathVariable int index,@RequestBody Dog dog);

  @PostMapping(value="/dog")
  public Dog updaDog(@RequestBody Dog dog);

  @DeleteMapping(value="/dog/{id}")
  public boolean deleteDog(@PathVariable(value="id") int dogId);

  
  @PatchMapping(value="/dog/id/{id}/name/{name}")
  public boolean updateDogName(@PathVariable int id, @PathVariable String name);

  
}
