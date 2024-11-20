
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle { //first file class cannot add final , but can add static

    private double radius; //every radius is 3.0 //non-static &  non-final -> instance var.
    //no need set area because it is a presentation or result
    //private final double radius = 3.0; //every radius is 3.0

    private String label;

    //static variable belongs to class
    //final var. once being assigned , the value cannot be changed.
    //constant 常數 (不會被改寫 e.g.分鐘) ->should Block Letters
    //private static final double PI = 3.14159; // add static to belongs to class
    public static final double PI = 3.141592653589793;//if need use always set publice
    //aviod write final static
    //private static final double PI = Math.PI; //一般不會改寫PI

    //belongs to class, but can be modified
    private static String color = "RED"; //as no final so can rewite
    //if want different cicle hava different color -> no static

    private static int count = 0;

    private final int number = 10; 
    //every circle object has a attribute number 10,never being change

    //empty constructor -> no parameters (no mean do nothing)
    public Circle() {
        this.radius = 10.0;
        this.label = color + "_" + ++count; //RED1, RED2.. as ++X is 先加1先再用
    }

    public Circle(double radius) {
        this.radius = radius;
        this.label = color + "_" + ++count;
    }

    public static void setColor(String newColor) {
        //this.color = color; //紅線
        color = newColor;
    }

    //input -> output
    //there code is from Person.java but can work as 只要輸入到就用到
    public static String getFullName(Person person) { //is 公用的
        //person object -> output
        return person.getFullName();
    }

    public double getRadius() {
        return this.radius;
    }

    public String getLabel() { //can add final
        return this.label;
    }

    //public double area(){
    //  return this.BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(3.14)).doubleValue();
    //}
    public void setRadius(double radius) {
        //int x = 1; //local var.
        this.radius = radius;
    }

    public double area() {
        return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))
                .multiply(BigDecimal.valueOf(Math.PI))
                .setScale(2, RoundingMode.UP).doubleValue();

    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.5);
        System.out.println(c1.getRadius());//3.5 check now saved radius
        System.out.println(c1.area());//38.49
        System.out.println(c1.getLabel()); //RED1

        Circle c2 = new Circle();
        System.out.println(c2.getLabel());
        
        Circle c3 = new Circle(3.17);
        System.out.println(c3.getLabel());
        System.out.println(c3.area());

        Circle.setColor("BlUE");
        Circle c4 = new  Circle();
        System.out.println(c4.getLabel());

        System.out.println(c3.getLabel());
        
        //compile-time error 寫時已紅線
       // Circle.PI =3.19; //final field Cir....


       //static var can be modified by object, but should not do it
       c3.setColor("BLACK"); //technically works
      Circle c5 =new  Circle();
      System.out.println(c5.getLabel());

      int x = 1; //local var.
      //lacal var. caonnot be accessed in other 
      System.out.println(x);

      //intsance var. = attritude

    }

}
