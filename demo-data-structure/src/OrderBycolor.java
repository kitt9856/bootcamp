
import java.util.Comparator;

public class OrderBycolor implements Comparator<Ball> {

    @Override
    public int compare(Ball b1, Ball b2) {
        //b1(-1) vs b2(1)    
        //如2個一樣色/是紅b1行先
        if (b1.getColor() == Color.RED) { 
            return -1;
        }
        if (b2.getColor() == Color.RED) {
            return 1;
        }
        if (b1.getColor() == Color.WHITE && b2.getColor() == Color.BLUE) {
            return -1;
        }
        if (b1.getColor() == Color.BLUE && b2.getColor() == Color.WHITE) {
            return 1;
        }

        return -1; //b1 is red b2 not red =>difference should be -2 

    }

}
