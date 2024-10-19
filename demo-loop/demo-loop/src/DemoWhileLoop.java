public class DemoWhileLoop {
  public static void main(String[] args) {
    //while
    //step 1:check if < 4
    //step 2
    //step3:i++->
    //step 4:
    int i = 0;
    while (i < 4) { //while 不用回到loop中
      System.out.println(i);
      i++;
    }
    System.out.println(i);

    //counting
    String s = "abcdabcdabcd";
    //while loop, how many b inside the String?
    int count = 0;
    i = 0;
    while (i < s.length()) {
      if (s.charAt(i) == 'b'){
        count += 1;
      }
    }
    i++;
    System.out.println(count);





    //searching
  }
  
}
