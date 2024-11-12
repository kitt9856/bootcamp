public class DemoStringBuilder {

  public static void main(String[] args) {
    String s = "abc" + "def";
    System.out.println(s); //abcdef
    String s2 = s.concat("def"); //return a new String object
    System.out.println(s2);//abcdef


    //
    StringBuilder sb = new StringBuilder("abc"); //除17個以外 都要new as they are object
    System.out.println(sb); //abc  當中有tostring 
    sb.append("def");
    System.out.println(sb);//abcdef

    //Why StringBuilder?
    System.out.println(sb.replace(1, 3, "x")); //axdef index1 to index(3-1) into "x"
    System.out.println(sb);//axdef 

    //StringBuilder has the best performance on String operation
    StringBuilder sb3 = new StringBuilder();
    long startTime = System.currentTimeMillis(); //千分1秒
    for (int i = 0; i < 1_000_000; i++){    //= 10,000,000
      sb3.append("a");


    }

    long endTime = System.currentTimeMillis(); 
    System.out.println(endTime - startTime);// 9ms

    String s10 ="";
     startTime = System.currentTimeMillis(); //千分1秒
    for (int i = 0; i < 1_000_000; i++){    //= 10,000,000
      s10 += "a";


    }

     endTime = System.currentTimeMillis(); 
    System.out.println(endTime - startTime); //20401 ms

  }
  
}
