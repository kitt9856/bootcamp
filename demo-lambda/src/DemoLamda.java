public class DemoLamda{

  public static void main(String[] args) {
    //Lambda expression: create one-off object for Flyable Interface
    //"()", because fly() has NO parameters
    //"->", implementation
    Flyable superman = () -> System.out.println("Superman is flying");
    superman.fly();
    
    Math1 add = (a,b) -> a + b;  //不用開add class file 就可以用
    Math1 subtract = (a,b) -> a - b;
    Math1 multiply = (a,b) -> a * b;
    Math1 divide = (a,b) -> a / b;
    System.out.println(add.operate(2, 1));
    System.out.println(subtract.operate(2, 1));
    System.out.println(multiply.operate(2, 1));
    System.out.println(divide.operate(2, 1));

    //Multiple Lines implemntation , you have uew bracket{}
    Math1 multiply2 = (a,b) -> {
      int value = a * b;
      return value;
    };
    



    //動作即人物
    //要做的task/難做的事 抽出來做專家 (method)






  }
}