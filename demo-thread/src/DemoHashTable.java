
import java.util.HashMap;
import java.util.Map;

public class DemoHashTable {
  private Map<Integer, Integer> stringMap;

  public DemoHashTable(){
   this.stringMap = new HashMap<>(); //hashmap array + arraylist
   //Solution
   //this.stringMap = new Hashtable<>();
  }

  public void put(Integer key){
    this.stringMap.put(key, 999);
  }

  public Map<Integer, Integer> getStringMap(){
    return this.stringMap;
  }

  public static void main(String[] args) {
    DemoHashTable hashTable = new DemoHashTable();
    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++){
        hashTable.put(i);
      }
    };

    Runnable task2 = () -> {
      for (int i =  100_000; i < 200_000; i++){
        hashTable.put(i);
      }
    };
    Thread thread1 = new  Thread(task1);
    Thread thread2 = new  Thread(task2);
    thread1.start();
    thread2.start();
    try {
        thread1.join(); //由3支thread變1支thread
        thread2.join();

    } catch (InterruptedException e) {
    }
    System.out.println(hashTable.getStringMap().size());
  }
  
}
