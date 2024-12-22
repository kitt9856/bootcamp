
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>();
    pq.add(100);
    pq.add(1);
    pq.add(89);
    pq.add(10);
    //System.out.println(pq);
    for(Integer integer:pq){
      System.out.println(integer);
    }
    //即未poll()已sort了

    System.out.println(pq.poll());//1
    System.out.println(pq.poll());//10
    System.out.println(pq.poll());//89
    System.out.println(pq.poll());


    //RED
    Queue<Ball> bq = new PriorityQueue<>(new OrderBycolor());
    bq.add(new Ball(Color.BLUE, 3.2));
    bq.add(new Ball(Color.RED, 7.6));
    bq.add(new Ball(Color.WHITE, 3.9));
    bq.add(new Ball(Color.RED, 1.2));
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());

    


  }
  
}
