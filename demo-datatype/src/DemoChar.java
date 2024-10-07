public class DemoChar {
  public static void main(String[] args) {
    //data type:char
    String s = "hello";
    String s2 = "h";

    //data type: char, which stores single character ONly.
    char c = 'h';
    //char c = "h";   "" is wrong
    System.out.println(c); //h

    c = 'a';
    System.out.println(c);

    
    c = '1';
    System.out.println(c); //1

    c = '你';  // c ='你們';  出error as 多過2個位
    System.out.println(c); 

    // c = '';  not support empty

    c = ' ';
    System.out.println(c); // show block

    //int vs char
    // char -> int -> long -> float -> double
    char x = 'p';
    System.out.println(x + 1); //char + int -> int + int -> int -> 113

    char x2 = '0';
    System.out.println(x2 + 0); //48

    char x3 = 'a';
    System.out.println(x3 + 0); //97

    char x4 = 'A';
    System.out.println(x2 + 0); //65

    int i10 = x4 + 5;
    System.out.println(i10); //70

    long l8 = x3 + 9; //char + int -> int + int -> int -> long
    System.out.println(l8); //106

    char h = '你';
    System.out.println(h + 0); // 20320

    int y = 40000;
    char h2 = (char) y;  //加(char)硬改y做 char, 正常是error, 這做法java不負責
    System.out.println(h2); //鱀

  }
  
}
