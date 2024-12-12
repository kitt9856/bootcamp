
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DemoSet {


  public static void main(String[] args) {
    Collection<String> strings = new ArrayList<>(); //arraylist 係collection孫
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    strings.remove("abc");
    System.out.println(strings.size());//2

     Set<String> s1 = new HashSet<>();
     s1.add("abc"); //set implement 了hashset
     s1.add("abc");
     System.out.println(s1.size());//1  as hashset dedault remove displicute
     //set avoid diplicated

     if ( s1.add("abc")){
      System.out.println("add sucess");

     }else{
      System.out.println("add fail");
     }

     if ( s1.add("ijk")){
      System.out.println("add sucess");
     }else{
      System.out.println("add fail");
     }//add sucess as s1 without ijk so can add ijk


  }
  
}
