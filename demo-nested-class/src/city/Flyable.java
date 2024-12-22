package city;

import javax.swing.text.PlainView;

public interface  Flyable {
  void fly();

  //Annoymous Inner Class
  //produces a one-off object with method implemntation
  public static void main(String[] args) {
    Flyable superman = new Flyable() { //不會share給他人 且不用寫class
      //public static final String xyz = "ABC";
     // private String name;

      //cannot write consturer

     /*  public String  getName() {
        return "Vincet";
      } */


      @Override
      public void fly(){
        System.out.println("superman is flying..");

      }
    };
    superman.fly(); 
    //System.out.println(superman.getName());
    //System.out.println(superman.getName()); //interface

     
    Flyable superwomen = new Flyable() {
      @Override
      public void fly(){
        System.out.println("superwomen is flying..");

      }
    };
    };


  }
  
}
