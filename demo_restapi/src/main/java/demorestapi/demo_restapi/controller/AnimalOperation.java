package demorestapi.demo_restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demorestapi.demo_restapi.model.Animal;

public interface AnimalOperation {
  @PostMapping(value="/animal")
  public Animal creatAnimal(Animal animal);

  @GetMapping(value= "/animals")
  public List<Animal> getAnimals();

  @GetMapping(value="/animal/")
  public Animal getAnimalByid(@RequestParam Long id);

  @DeleteMapping
  public boolean removeAnimalByid(@RequestParam Long animalId);

  @PutMapping
  public Animal updateAnimal(@RequestParam Long animalId, @RequestParam Animal newAnimal);

  @PatchMapping
  public Animal patchAnimalName(@RequestParam Long animalId, @PathVariable String name); //X 要= {X}
}
//if will 重複 可用ParaVar
