
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {



  public static void main(String[] args) {
    List<String> strings = new LinkedList<>(); // List without removeFirst, 
    //During compile-time, "strings" object can only call List.class method
    strings.add("abc");
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    //strings.removeFirst  //not from linkedlist
    //Same as ArrayList, Ordering is in place for LinkedList
    for(String s: strings){
      System.out.println(s);

    }
    System.out.println(strings.size()); //4
    strings.remove("abc");
    System.out.println(strings); //[abc, def, abc] 作者已override tostring

    LinkedList<String> strings2 = new LinkedList<>(); //可否call是List決定
    strings2.add("abc");
    strings2.add("def");
    strings2.add("ijk");
    strings2.removeFirst(); //linkedlist method not List
    System.out.println(strings2);
    strings2.removeLast();
    System.out.println(strings2);
    System.out.println(strings.contains("def"));

    //linkedlist for已知會不斷add or 波動
    //removefirst or last is 超快




  }
  
}
