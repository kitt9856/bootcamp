package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    abstract double area();

    public static double totalArea(List<Shape> shapes) {
      //use BigDecimal to sum all shape.area
        BigDecimal totalArea = BigDecimal.valueOf(0.0);
        for (Shape shape : shapes) {
          totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));   //immutable bigdecimal不會修改自身所以要接住
        }
        return totalArea.doubleValue();
    }

    public static void main(String[] args) {
      List<Shape> shapes =  new ArrayList<>();
      shapes.add(new Circle(3.2));
      shapes.add(new Square(4.2));
      shapes.add(new Circle(3.3));
      System.out.println(totalArea(shapes));

    }

}
