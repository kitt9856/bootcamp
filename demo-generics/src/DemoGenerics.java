import java.util.ArrayList;
import java.util.List;
import zoo.Tiger;

public class DemoGenerics {

  public static void main(String[] args) {
    

    //before Java 1.5
    List strings2 = new ArrayList();
    strings2.add("abc"); //cannot charat
    strings2.add(13);
    strings2.add(new Tiger());

    Object obj = strings2.get(0);
    String s=  (String) obj;
    System.out.println(s.charAt(2));//c

    //java 1.5 ->List<T> (Generics)
    List<String> strings = new ArrayList<>();
    //strings.add(13);
    //strings.add(new Tiger()); 只可放String

    List<Tiger> tigers= new ArrayList<>();

    //List<Parent> -> 混搭

  }
  
}
