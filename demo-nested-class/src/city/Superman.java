package city;

public class Superman implements Flyable {
  @Override
  public void fly(){
    System.out.println();  //implementation

  }

  public static void main(String[] args) {
    Superman s1 = new Superman();
    s1.fly(); //implement了 flyable
  }
  
  
}
