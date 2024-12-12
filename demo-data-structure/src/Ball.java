
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ball implements Comparable<Ball> {

    private Color color;
    private double size;

    public Ball(Color color, double size) {
        this.color = color;
        this.size = size;
    }

    public Color getColor() {
        return this.color;
    }

    public double getSize(){
      return this.size;
    }

    //Assignment: Blue -> Red -> white, if color is same, bigger size go first.

    @Override
    public int compareTo(Ball ball) { //must Ball Object to call this method
        //-1  or 1 
        //this(-1) vs ball (1)  想this上前 return this -1 
        if (this.color == ball.getColor()) //emen must use ==
        {
            return 1;
        }
        if (this.color == Color.BLUE) {
            return -1;
        }
        if (ball.getColor() == Color.BLUE) {
            return 1;
        }
        if (this.color == Color.RED && ball.getColor() == Color.WHITE) {
            return -1;
        }
        if (this.color == Color.RED && this.color == Color.WHITE) {
            return 1;
        }
        return -1;
    }

    public String toString(){
      return "Ball[" 
      + "color=" + this.color.name() + "]";
    }

    public static void main(String[] args) {
      List<Ball> balls = new ArrayList<>();
      balls.add(new Ball(Color.WHITE,10.3));
      balls.add(new Ball(Color.RED,2));
      balls.add(new Ball(Color.BLUE));
      balls.add(new Ball(Color.RED));
      Collections.sort(balls); //當中有行compareTo
      //要有特定條件 implement Comparable<>
      System.out.println(balls); //[Ball[color=BLUE], Ball[color=RED], Ball[color=RED], Ball[color=WHITE]]


    }

}
