
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Car {
  private String model;
  private int year;

  public Car(String model, int year){
    this.model=model;
    this.year=year;
  }

  public String getModel(){
    return this.model;
  }

  public int getYear(){
    return this.year;
  }

  @Override
  public String toString(){
    return "Car["
    + "model=" + this.model
    + ",year=" + this.year
    + "]";
  }


  public static void main(String[] args) {
    Car c1= new Car("tesla", 2020);
    Car c2= new Car("tesla", 2022);
    Car c3= new Car("toyota", 2018);

    List<Car> cars = new ArrayList<>();
    cars.add(c1);
    cars.add(c2);
    cars.add(c3);

    //count()
    long teslaCount= cars.stream()
    .filter(c -> "tesla".equals(c.getModel())).count(); //count how many car
    System.out.println(teslaCount);

    //distinct()  no repeat
    //Find all models in cars
    List<String> carMod= cars.stream().map(c -> c.getModel())
    .distinct() //Stream<String>
    .collect(Collectors.toList());
    System.out.println(carMod); //[tesla, toyota]

    Set<String> carMod2= cars.stream().map(c -> c.getModel())
    .distinct() //Stream<String>
    .collect(Collectors.toSet());
    System.out.println(carMod2); 

    //sorted(): descending year
    List<Car> sotedCars = cars.stream() //stream<Car> 
    .sorted((c10,c20) -> c10.getYear() > c20.getYear() ? -1 : 1)   //Stream<Car> //用maP會無左model!
    .collect(Collectors.toList());
    System.out.println(sotedCars);

    


  }
  
}
