public class DemoTypeInference {
  //var cannot be used as attribute type //java unknow the type
  //private var x; //cannot

  public static void main(String[] args) {
    //Java is Strong Type (compile time)
    int x = 3;
    x = 10;

    //java 10  (like js no need to wirte what type)
    var y =3; //var is determined during compile time,by the first initialization
    //confirm y is in int type
    //y = 10.3; //error

    var person = new Person();
  }

  public static class Person{

  }

  //var cannot be used as parameter
  /* public static int sum(var x, var y){  //cannot sum(var x, var y)
    return x + y;
  } */

  //var cannot be used as parameter
  /* public static var sum(int x, int y){
    return x + y;
  } */

  //for each can use var  e.g. for(var name : names)
  
}
