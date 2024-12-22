
import java.util.Comparator;

public class OrderBySizeDesc implements Comparator<Ball> {
  
  @Override
  public int compare(Ball b1,Ball b2){
    return b1.getSize() > b2.getSize() ? -1 : 1;
  }
  
}
