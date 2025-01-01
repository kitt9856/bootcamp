
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {

  public static void main(String[] args) {
    //Method Reference (java 8)

    //Example 1: static method
    List<Integer> numbers =new ArrayList<>(List.of(1,3,4,5,9));
    numbers.forEach(e -> System.out.println(e)); //lambda
    numbers.forEach(System.out::println ); //method refernce  lambda直接放入

    //example 2: instance method
    String name = "Peter";
    Supplier<Integer> nameLength = () -> name.length(); //lambda
    System.out.println(nameLength.get()); 

    nameLength = name:: length; // () is empty ,another also empty so 抽走
    System.out.println(nameLength.get());

    //Exmaple 4: instance method(with params)
    String word = "hello";
    BiFunction<String,String,Integer> compareToString = (s1,s2) -> s1.compareTo(s2);
   System.out.println( compareToString.apply(word, "hello"));

   BiFunction<String,String,Integer> compareToString2 = String ::compareTo;
   System.out.println(compareToString2.apply(word, "hello"));

   //Example 5: Constructor
   Function<String,Integer> convertToInteger = s -> new Integer(s);
   System.out.println(convertToInteger.apply("123"));
   Function<String,Integer> convertToInteger2 = Integer::new;
   System.out.println(convertToInteger2.apply("123"));
   Function<String,Integer> convertToInteger3 = Integer::valueOf;
   System.out.println(convertToInteger3.apply("123"));
   






  }
  
}
