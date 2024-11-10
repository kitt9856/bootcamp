package DemoStatocMethod;

public class Calculator {
  public static int add(int x, int y){
    return x + y;

  }

  public int add1(int x, int y){
    return x + y;
  }

  public int add2(int x, int y){
    return x + y;
  }

  public static void main(String[] args) {
    
    //Wrong 
    //System.out.println(Calculator.add2(2, 3));
    
    Calculator cal = new Calculator();
    System.out.println(cal.add2(10,10));
  
  }

  
}
