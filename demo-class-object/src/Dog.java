public class Dog {
  private final  int age;

  //this consttructor has no value assignment for final var. age
  //so compile error 
  /* public Dog(){
  } */

  public Dog(int age ){
    this.age =age;
  }
  
}
