
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;
  //no need set area because it is a presentation or result

  public double getRadius(){
    return this.radius;
  }

  //public double area(){
  //  return this.BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(3.14)).doubleValue();
  //}

  public double area() {
  return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))
  .multiply(BigDecimal.valueOf(Math.PI))
  .setScale(3,RoundingMode.UP).doubleValue();

  }
  
}
