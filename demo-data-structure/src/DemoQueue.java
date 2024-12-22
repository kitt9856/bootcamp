
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DemoQueue {


  public static void main(String[] args) {
    //FIFO first in first out
    Queue<String> q1 = new LinkedList<>();
    q1.add("Vincent");
    q1.add("Oscar");
    q1.add("lucas");
    String head = q1.poll(); //similar to removeFirst
    System.out.println("head =" +head);
    System.out.println(q1.size());//2

    q1.add("Steve");

    //while
    while(!q1.isEmpty()){
      head = q1.poll();
      System.out.println(head); //you can do anything for the head...
    }
    System.out.println(q1.poll()); //null

    q1.add("abc");
    q1.add("def");
    q1.add("ijk");
    while(q1.size() !=0){
      head = q1.poll();
      q1.add("hello");
      if (q1.size()==3){
        break;
      }
      System.out.println("after size:" + head);
    }
    System.out.println(q1.size());//1

    //foreach loop: we cannot modify the elements inside the list/queue/set...
    //for(String str:q1){
    //  System.out.println(str);
    //  //q1.add("abc"); //java.util..... as foreach cannot...
    //  //q1.remove("def"); //same error as add
    //}

    System.out.println(q1.peek());//def

    List<String> ss = new LinkedList<>();
    ss.add("abc");
    ss.add("ijk");
    System.out.println(ss.get(1)); //ijk //arraylist and linkedlist also can output .get() but Linklist is so hard to get



   // for (String s:ss){
   // //  ss.set(1, "vincent");
   //   ss.add("oscar");
   //   System.out.println(s);
   // }

    //Queue - LinkedList
    //Deque - LinkedList
    Deque<String> dq1 = new LinkedList<>();
    dq1.add("abc");                                       //dq java mean水管
    dq1.add("def");
    dq1.add("ijk");
    System.out.println(dq1.pollFirst());
    System.out.println(dq1.pollLast());
    dq1.addLast("xxx");
    dq1.addFirst("yyy");
    System.out.println(dq1);
    System.out.println(dq1.peekFirst()); //peek mean only see xx
    System.out.println(dq1.peekLast());

    //queu 可只用arraylist的method 不會用埋deque的method

    System.out.println(dq1.pop()); //yyy //pop() 如做完成條array無野會殺array
    System.out.println(dq1); 
    dq1.push("mmm");
    System.out.println(dq1);

    //push and pop (stack:FILO)
    Stack<String> strings = new Stack<>();
    strings.push("aaa");
    strings.push("bbb");
    System.out.println(strings.pop()); //bbb

    //ArrayDeque
    Deque<Double> doubles = new ArrayDeque<>();
    doubles.add(10.3);
    doubles.add(10.7);
    System.out.println(doubles.pollLast()); //10.7  會殺array 且get不到中間野
    
    Queue<Integer> integers = new ArrayDeque<>();
    integers.add(10);
    integers.add(11);
    System.out.println(integers.poll()); //10



    //如果想排隊又想底係array 在Queu new arraydque


  }
  
}
