//clss, object
public interface Swimable {//contract合約 //不可call自己
  //implicitly public static final
  //1.All methods are without implementation(abstract method)
  //2.no instance var
  //3.no constructor
  //4.can do 

  int x = 10;


  void swim();

  //after java 8(2014)
  //1.default and static method
  static int sum(int x, int y){
    return x + y;
  }

  //2. default method (with implement)
  default void eat(){
    System.out.println("eat() method inside the interface");
  }

  //Assignment
  //2 classes and at least 2 interfaces
  //getter,setter, constructor


  //ios 1.18.3 ->1.18.4(bug fix)
  //Major.Moinor.Fix

  //default--最後手段
}
