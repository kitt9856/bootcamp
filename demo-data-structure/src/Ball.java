
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

    public double getSize() {
        return this.size;
    }

    //Assignment: Blue -> Red -> white, if color is same, bigger size go first.
    @Override
    public int compareTo(Ball ball) {
        if (this.color == ball.getColor() && this.size >= ball.getSize()) {
            return -1;
        } else if ((this.color == ball.getColor() && this.size < ball.getSize())) {
            return 1;
        }
        //if (this.color == ball.getColor()){
        /* if (this.size > ball.getSize()){
            return -1;
        } else{
            return 1;
        }
    } */

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

    public String toString() {
        return "Ball["
                + "color= " + this.color.name()
                + "size= " + this.size + "]";
    }

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(Color.WHITE, 10.3));
        balls.add(new Ball(Color.RED, 2));
        balls.add(new Ball(Color.BLUE, 11));
        balls.add(new Ball(Color.RED, 2));
        balls.add(new Ball(Color.BLUE, 12));

        Collections.sort(balls); //當中有行compareTo
        //要有特定條件 implement Comparable<>
        //
        //before have ballsize
        //System.out.println(balls); //[Ball[color=BLUE], Ball[color=RED], Ball[color=RED], Ball[color=WHITE]]

        //after set ball size
        System.out.println("there is: " + balls);
        //there is: [Ball[color= BLUEsize= 12.0], Ball[color= BLUEsize= 11.0], 
        //Ball[color= REDsize= 2.0], Ball[color= REDsize= 2.0], Ball[color= WHITEsize= 10.3]]


        //Comparator
        Collections.sort(balls,new OrderBycolor());
        System.out.println(balls);

        Collections.sort(balls,new OrderBySizeDesc());
        System.out.println(balls);
    }

}
