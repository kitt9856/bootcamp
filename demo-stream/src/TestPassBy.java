
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestPassBy {


  public static String xxx(String s){
    //primitive + String + wrapper class (17 types) always "pass by value " or "pass" by copy of value 
    //some other types in java bult-in java library, e.g. bigDecimal, localdate -> pass by value

    //Pass by value
    return s.concat("!");
  }

  public static void updateBugDecimal(BigDecimal bd){
    bd = BigDecimal.valueOf(999);
  }

  public static void updateTo10(int[] integers){
    for(int i =0; i < integers.length;i++){}
  }

  public static void updateLocalDate(LocalDate ld){
    ld =LocalDate.of(2024, 12, 31);
  }
  

  public static void main(String[] args) {
    

    //BigDecimal
    BigDecimal bigD = BigDecimal.valueOf(100);
    updateBugDecimal(bigD);
    System.out.println(bigD); //100

    //LocalDate
    LocalDate ld1 = LocalDate.of(2024, 10, 1);
    updateLocalDate(ld1);
    System.out.println(ld1);


    //for other types, pass by refence
    int[] arr = new int[] {2,3,1};
    List<Integer> integers = Arrays.stream(arr).boxed().collect(Collectors.toList());

    //Not ok , arrays.aslist() is for Integer[] to List<Integer>
    //List<Integer>

    //pass by reference
    Collections.sort(integers,(i1,i2) ->  i2<i1 ?1 :-1);
  }
  
}
