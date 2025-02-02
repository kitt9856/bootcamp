package demorestapi.demo_restapi.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Animal {
  public  static Animal[] animals = new Animal[100];

  public static  boolean addAnimal(Animal animal){
    for (int i = 0; i < animals.length; i++){ //avoid void index after delete
      if (animals[i] == null){
        animals[i] = animal;
        return true;
      }
    }
    return false;
  }
  private long id;
  private String name;

 



  
}
