
import DemoSwitchExpression.Color;

public class DemoSwitchExpression {


  public static void main(String[] args) {
    //java 14
    Color color = Color.YELLOW;
    int x = 0;
    switch (color){
      case  RED:
      x = 3;
       break;
      case  BLUE:
      x = 4;
       break;
      case  YELLOW:
      x = 5;
      break;
      default:
      break;

    }
    //java 14
    //Switch Expression
    //1.compile time ensures you have no missing enum value in switch expression 少了一個都有紅線(good for coder)
    int x2 = switch (color){
      case RED -> 3;
      case BLUE -> 4;
      case YELLOW -> 5;
    };

    char c = 'a';
    int ascii = switch (c) {
        case 'a' ->{
        System.out.println("case a");
            yield 97;  //在main中用yield
        }
        default->{
        System.out.println("default");
            yield -1;
          }
    };
    System.out.println(ascii); //97


  }
  


  public static enum Color{
    RED,YELLOW,BLUE;
  }
}
