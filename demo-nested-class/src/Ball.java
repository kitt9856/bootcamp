
public class Ball{ //outer class
  private Color1 color;
  private static final String BARND = "tesla";

  public Ball(Color1 color){
    this.color =color;
  }

  public Color1 getColor1(){
    return this.color;
  }



  public static enum Color1{//inner class //沒有放出去,可以自已用,不會給別人extend/share
    RED, YELLOW, BLUE,ORANGE;

    public static String printBrand(){  //belongs to Color1
      return  Ball.BARND; //able to access outer class static var.
    }

  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Color1.BLUE);

    //Static Nested Class
    //Approach 1
    System.out.println(Ball.Color1.printBrand());

    //Approach 2
    System.out.println( b1.getColor1().printBrand()); //for fun only

    
  }
}