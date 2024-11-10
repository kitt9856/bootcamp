public class Test {

  //main... run on rem  在run時發生的野
  //as a program so have a run button
  public static void main(String[] args) {
    String s = "hello"; //create a String object
    String s2 = new String("hello");//create a String object

    Cat c = new Cat();//create a cat object

    //8 primitives -> they are not an object (i.e. int x = 3, x is not an object)
    //8 Wrapper Class -> They are object(i.e. Integer x =3, x is an object)
    Integer y = 3;
    y.doubleValue(); //3.0  Integer 不再只是值 有行為 
    //int y = 3  y only a value

    //String -> it is an object
    //so primitives is not object in java



  }//到這裡object會無晒


  
}
