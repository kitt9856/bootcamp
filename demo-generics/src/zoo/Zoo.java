package zoo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zoo<T extends Animal> { //extends ->收窄範圍 
  private List<T>  animals;//Polymorhism// but cannot call tiger method, only call 

  public Zoo(){
    this.animals = new ArrayList<>();
  }

  public void add(T animal){ //complie time add
    this.animals.add(animal);  //add from List?
  }

  public List<T> getAnimals(){
    return this.animals;
  }
  
  // <K extends Animal> is to descibe the range of "Zoo<K>"
  public static <K extends Animal> int animalCount(Zoo<K> zoo){
    zoo.getAnimals().get(0).eat();
    //zoo.getAnimals().get(0).sleep();  comple time error as animal without sleep()
    //zoo.getAnimals().get(0).run(); same as sleep()
    return 1;
  }

  public static int animalCount2(Zoo<? extends Animal> zoo){ //only same method in static 
    zoo.getAnimals().get(0).eat();
    //zoo.getAnimals().get(0).sleep();  comple time error as animal without sleep()
    //zoo.getAnimals().get(0).run(); same as sleep()
    return zoo.getAnimals().size();
  }


  public static void main(String[] args) {
    List<List<String>> stringLists = new LinkedList<>();

    //animalCount2() -scenario 1 (Tiger or Panda)
    Zoo<Animal> animalZoo = new Zoo<>();
    animalCount2(animalZoo);
    //animalCount2() -scenario 2 (All Tiggers)
    Zoo<Tiger> tigerZoo = new Zoo<>();
    animalCount2(tigerZoo);
    //animalCount2() -scenario 3 (All Pandas)
    Zoo<Panda> pandaZoo = new Zoo<>();
    animalCount2(pandaZoo);

    Queue strings = new LinkedList();
    strings.add("abc"); //add() from Object if get will return Object, hard to use
    strings.add(new Tiger());
    //strings.poll().charAt(0); //complie time error, Object cannot charAt

  }
}

//? super X =cannot call brother

//List<T> =List<Object>in class file

//write class about one to many
