import java.util.Arrays;

public class DemoString {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "apple";
    System.out.println(s1.compareTo(s2)); //7  -> 'h' - 'a'的Ascuii code

    String s3 = "abbbb";
    System.out.println(s3.compareTo(s2)); //-14 -> 'b' -'p'

    String s4 = "hello";
    System.out.println(s1.compareTo(s4)); // 0 (they are equals)
    String s5 = "hello!";
    System.out.println(s1.compareTo(s5)); //-1

    String s6 = "";
    if (!s6.isEmpty()){ //check if s6 is empty string
      System.out.println("s6 is not empty");
    }

    String s7 = " ";
    System.out.println(s7.isBlank()); //true
    System.out.println(s7.isEmpty()); //false

    System.out.println(s6.isBlank()); //true
    System.out.println(s6.isEmpty()); //true

    String s9 = "hello world !!!";
    String s10 = s9.replace("o", "x"); //String 大部份method會return new value, 即不會改變s9
    System.out.println(s10);


    //Given a string (s9), convert to a target string, 
    //which the character is in an even index & it is a character, make it become Block leter
    //e.g. "hello world!!!" -> "HeLlO WoRlD!!!!"
    //Tips: You have to construct a new string by characters

    //char vs String    C is without string
    char[] chs = s9.toCharArray();
    System.out.println(Arrays.toString(chs));

    //searching algotithm
    //string + for loop + charAt

    //revise the string algorothm
    //string -> toCharArray() -> char[] -> edit the value in char[] -> String
    String apple = "apple";
    char[] ch2 = apple.toCharArray(); //performance?
    for (int i = 0; i < apple.length(); i++){
      System.out.println((int) ch2[i]);
    }
//    97
//112
//112
//108
//101
    ch2[2] = 'x';
    //from char[] to String
    System.out.println(new String(ch2));

    //both s20 ,s21 and s22 storing "hello"
    String s20 = "hello";
    String s21 = new String("hello");
    String s22 = String.valueOf("hello"); 







  }
}
