package demorestapi.demo_restapi.controller.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demorestapi.demo_restapi.controller.AnimalOperation;
import demorestapi.demo_restapi.model.Animal;

//寫完API 可把這class all return null -> check mvn clean intall work?

@RestController //=@controller + @responseBody
@RequestMapping(value="v/1")
public class AnimalController implements AnimalOperation  {
  //private static List<Animal> animals = new ArrayList<>();

  @Override
  public Animal creatAnimal(Animal animal){
    if (Animal.addAnimal(animal)){
      return animal;
    }
    throw new RuntimeException();
  }

  @GetMapping(value= "/animals")
  public List<Animal> getAnimals(){
    return Arrays.stream(Animal.animals).filter(e -> e != null)
    .collect(Collectors.toList()); 
  }

  @GetMapping(value="/theAnimal")
  public Animal getAnimalByid(Long animalId){
    //String strId = "" + id;
    return Arrays.stream(Animal.animals)
    .filter(e -> e != null && e.getId() == animalId)
    .findFirst().orElseThrow(() -> new RuntimeException());
  }

  public List<Animal> getAnimalByName(String name){
    if (name == null)
      throw new RuntimeException();
    return Arrays.stream(Animal.animals)
      .filter(e -> e != null && name.equals(e.getName()))
      .collect(Collectors.toList());
  }

  @Override
  public boolean  removeAnimalByid(Long animalId){
    for (int i = 0; i < Animal.animals.length; i++){
      if (Animal.animals[i] != null && Animal.animals[i].getId() == animalId){
        Animal.animals[i] = null;
        return true;
      }
    }
    return false;
  }

  @Override
  public Animal updateAnimal(Long animalId, Animal newAnimal){
    for (int i =0; i < Animal.animals.length; i++){
      if (Animal.animals[i] != null && Animal.animals[i].getId() ==animalId){
        Animal.animals[i] = newAnimal;
        return  newAnimal;
      }
    }
    throw new RuntimeException();

  }

  @Override
  public Animal patchAnimalName(Long animalId, String name){
    for (int i = 0; i < Animal.animals.length; i++){
      if (Animal.animals[i] != null && Animal.animals[i].getId() == animalId ){
        Animal.animals[i].setName(name);
        return Animal.animals[i];
      }
    }
    throw new RuntimeException();
  }



  
}
