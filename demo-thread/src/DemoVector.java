
import java.util.ArrayList;
import java.util.List;

public class DemoVector {
  private List<Integer> integers;

  public DemoVector(){
    //Soluation
    //this.integers = new Vector<>();  //vector是不可被入侵 so 不用synchrnized (source code已有synch)
    this.integers = new ArrayList<>();
  }

  public synchronized  void addInteger(Integer x){
    //999line
    this.integers.add(x); //lock 1 line  //read write problem everyone buy 100 but only 120total if no sync , everyone can get

  }

  //bank save in user ac. so is ok, but market everyone go public to read write so must consider

  public List<Integer>  getInteger(){
    return this.integers;
  }

  public static void main(String[] args) {
    DemoVector demoList = new DemoVector();
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++){
        demoList.addInteger(1);
      }
    };
    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
    try {
        thread1.join();
        thread2.join();

    } catch (InterruptedException e) {
    }
    System.out.println(demoList.getInteger().size()); //arrayoutofBound //放入arraylist最後一格時出事
    //LinkedList only throw reference so 不會出事



  }
  

}
