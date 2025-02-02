package com.bootcamp.web.demo_springweb.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.web.demo_springweb.controller.DatabaseOperation;
import com.bootcamp.web.demo_springweb.model.ApiResp;
import com.bootcamp.web.demo_springweb.model.Dog;

@Controller
@ResponseBody
@RequestMapping(value="/v1")
public class DatabaseController implements DatabaseOperation {
  private static List<Dog> dogs = new ArrayList<>(); //static -server不死就可以用到value

  @Override //postmap
  public Dog createDog( String name,  int age){
    Dog newdog = new Dog(name, age);
    DatabaseController.dogs.add(newdog);
    return newdog;
  }

  @Override //getmap /dogs
  public List<Dog> getAlldog(){
    //Dog dog = this.
    return DatabaseController.dogs;
  }

  @Override //getmap /dog/name/{name}
  public List<Dog> getDogs( String name){
    return dogs.stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList());
  }

  @Override //getmap /dog/age/{age}
  public List<Dog> getAge( int age){
    return dogs.stream().filter(e -> e.getAge() == age).collect(Collectors.toList());
  }

  @Override //putmap /dog/{index}
  public ApiResp<Dog> updaDog(int index, Dog dog){  ////要對方是dog才put
   // System.out.println("1"); //for debug
    if (dogs.size() <= index || index < 0){
    //  System.out.println("2");
    throw new IllegalArgumentException("Dog ID is invalid");
    //  return null;
    }
    dogs.set(index, dog);
    return new ApiResp<>(0, "success", dog);
  }

  @Override //postmap /dog
  public Dog updaDog( Dog dog){
   // System.out.println("1");
    dogs.add( dog);
    return dog;
  }

  @Override //deletemap /dog/{id}
  public boolean deleteDog( int dogId){
    if (dogs.size() <= dogId){
      return false;
    }
    dogs.remove(dogId);
    return true;
  }

  //post -> create new resource
  //put vs patch
  //1.Put -> find the resource by id -> replace the whole resource by id
  //2.Patch -> find the resource by id -> update one resource attribute.
  @Override
  public boolean updateDogName( int id,  String name){
    if (dogs.size() <= id || id < 0){
      throw new IllegalArgumentException("Dog ID is invalid.");
      //return false;
    }
    dogs.get(id).setName(name); //get到id 就改obj中的name
   
    return true;
  }

 


  
}
