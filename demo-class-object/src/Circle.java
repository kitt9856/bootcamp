
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;
  //no need set area because it is a presentation or result

  //input -> output
  //there code is from Person.java but can work as 只要輸入到就用到
  public static String getFullName(Person person){ //is 公用的
    //person object -> output
    return person.getFullName();
  }

  public double getRadius(){
    return this.radius;
  }

  //public double area(){
  //  return this.BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(3.14)).doubleValue();
  //}

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double area() {
  return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))
  .multiply(BigDecimal.valueOf(Math.PI))
  .setScale(2,RoundingMode.UP).doubleValue();

  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setRadius(3.5);
    System.out.println(c1.getRadius());//3.5 check now saved radius
    System.out.println(c1.area());//38.49
  }
  
}
