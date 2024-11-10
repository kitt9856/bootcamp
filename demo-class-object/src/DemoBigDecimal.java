
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    //0.2 + 0.1
    System.out.println(0.1 + 0.1);//0.2
    System.out.println(0.2 + 0.1);//0.30000000000000004

      //Java solution: bult-in java class
      BigDecimal bd = new BigDecimal(10L);
      BigDecimal bd2 = new BigDecimal("10");


      System.out.println(bd.doubleValue());//10.0

      int x = bd2.intValue();
      System.out.println(x);//10

      //object 不可以用+-*/ !!!!!!!!!
      
      //you should perform the calculation by valueOf()
      BigDecimal reuslt2 = BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(0.1)); //add(要入bigdec..)
      System.out.println(reuslt2.doubleValue()); //0.3
      
      //be careful
      BigDecimal result3 = new BigDecimal("0.2").add(new BigDecimal("0.1"));//BigDec 的底層也只是用String解決

      System.out.println(BigDecimal.valueOf(0.34)
      .multiply(BigDecimal.valueOf(0.34))
      .setScale(2, RoundingMode.UP)
      .doubleValue()); 
    //if without set scale 0.1156 ->with setscale =0.116  roundingmode.down->0.115

    BigDecimal.valueOf(9).divide(BigDecimal.valueOf(3)).doubleValue(); //3.0

    BigDecimal.valueOf(9).divide(BigDecimal.valueOf(2)).doubleValue(); //4.5

    BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3)).doubleValue(); //error  not 3.333

    System.out.println(BigDecimal.valueOf(10)
    .divide(BigDecimal.valueOf(3),4, RoundingMode.UP)
    .setScale(1, RoundingMode.UP)
    .doubleValue());//3.3334 -> 3.4

    System.out.println(BigDecimal.valueOf(10)
    .divide(BigDecimal.valueOf(3),1, RoundingMode.UP) //因已round up so no need again
    .doubleValue());//3.3334 

    Boolean y = 3== 0; // boolean(autobox)
    
    String s1 = "hello";
    String s2 = "hello";
    s1 = "hello!"; //s2 still is "hello"
    //s1 = s1 + "!"; same s1="hello" case but slow litte speed

    String s3 = "hello";
    String s4 = "abc";
    s3 = s4;
    s4 = "def";
    //s3 -> "abc"

    String s5 = new String("hello");
    System.out.println(s1 == s5); //false
    String s6 = new String("hello").intern(); //new String("hello").intern() -> "hello" 較少用
    System.out.println(s2 == s6);//false

    //if s1 =.toUpperCase 都會指 new object

    String s7 = "hello";
    String s8 = "hello";
    System.out.println(System.identityHashCode(s7)); //146...
    System.out.println(System.identityHashCode(s8));//146...
    String s9 = new String("hello");
    System.out.println(System.identityHashCode(s9)); // 148... 即已與s7 s8不同

    //immutability 不可改
    //因java工作像派多個工人出去一齊工作
    //s1 = s1 + X //在運行時 有可能被其他改了 if可改的話

    // == is check 2object address




  }
  
}
