
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  private AtomicInteger x;

  public DemoAtomic(){
    this.x = new AtomicInteger();
  }

  public AtomicInteger getX(){
    return this.x;
  }

  public static void main(String[] args) {
    DemoAtomic demoAtomic = new DemoAtomic();
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++){
        demoAtomic.getX().getAndIncrement();//=x++; //object cannot ++ but atomic do it
      }
    };
    Thread thread1 = new  Thread(task);
    Thread thread2 = new  Thread(task);
    thread1.start();
    thread2.start();
    try {
        thread1.join(); 
        thread2.join();

    } catch (InterruptedException e) {
    }
    System.out.println(demoAtomic.getX()); //20000   correct


    //use deque can replace stack and not blocking
    Stack<String> stack = new Stack<>(); //有synci so blocked

  }

  //other lang default lock door , but java 天生要你管理lock door
  //syncie 最後手段

  //java 多線程as has thread
  //deadlock
  

  //set DB pw: admin1234
}
