public class Demoif {
  public static void main(String[] args) {
    
    char gender = 'M'; //char only one word
    //char gender2 = 'MC'; //wrong
    String gender3 = "M";
    String gender4 = "MC";

    int age = 18;
    boolean isAdult = age >= 18;
    System.out.println("isAdult :" + isAdult);

    

    // == only use for primitive e.g. byte,int, long....
    //if String checking use . e.g.  .equal

    String str1 = new String("");
    String str2 = new String("");
    System.out.println("case1" + str1.equals(str2));
    System.out.println("case2" + (str1 == str2)); //10/10/2024 待續解釋 GTP:new後分配了新的空間
    //雖是相同內容，但JAVA是看地址不是看對象的內容

    boolean isMale = gender == 'M';
    System.out.println("isMale :" + isMale);
    //!=
    if (!isMale && isAdult){
      System.out.println("!isMale && isAdult" );
    } else {
      System.out.println("isMale && isAdult");
    }

    String str3 = "str3";
    String str4 = "str4";

    if (str3.equals(str4)) {
      System.out.println("we are");
    } else {System.out.println("we are not");}

    //self try
    if (str3.equals(str4)) {
      System.out.println("we are");
    } else {
      String Newstr4 = str4.replace(str4.charAt(str4.length() - 1), '3');
      //String Newstr4 = str4.replace('4', '3');
      System.out.println("Newstr4 is " + Newstr4);
    }
    //self try

    //compareTo ????? 
    str3.compareTo(str4); 
    System.out.println("str3.compareTo(str4) is:" + str3.compareTo(str4));

    String x = "ZZZZ";
    String y = "ABC";

    System.out.println("x.compareTo(y) is:" + x.compareTo(y)); //GTP:compare first word unicode = Z and A


    String str5 = "happy";
    String str6 = "happy";
    String str7 = "new";
    String str8 = "year";

    
    //string.compareTo()
    System.out.println("case5" + str5.compareTo(str5));
    System.out.println("case6" + str5.compareTo(str6));
    System.out.println("case7" + str5.compareTo(str7)); //ascii code h=72 n=78 72-78=-6
    System.out.println("case8" + str5.compareTo(str8)); //ascii code h=72 n=89 72-89=-17
    System.out.println("case9" + str8.compareTo(str5)); //ascii code h=72 n=89 89-72=-17

    //ASCII 
    System.out.println((char)48); //0
    System.out.println((char)65); //A
    System.out.println((char)97); //a

    //substring(int)   print第X個位開始至最後
    //substring(int beginIndex, int endIndex)  print第X個位開始至第x個 endindex會-1
    String str9 = "Diamond Hill";
    System.out.println("No.5 index is " + str9.charAt(5));
    System.out.println("case1 :" + str9.substring(5)); // nd Hill
    System.out.println("case 2:" + str9.substring(3, 10));// mond Hi endindex會-1

    //chain method 不同method同在一起
    System.out.println("case3:" + str9.substring(3, 10).equals("mond"));
    System.out.println("case4: " + str9.substring(3, 10).equals("mond Hi"));

    //用==
    System.out.println("case5 :" + (str9.charAt(3) == 'C')); //false // as str9.charAt(3)='m'
    System.out.println("case6 :" + (str9.charAt(3) == 'm'));
    System.out.println("case7 :" + (str9.charAt(3) == 'M')); //false 在string中 m!=M

    //.isEmpty()   check empty
    String str10 = "";
    String str11 = " ";
    System.out.println("str10.isEmpty():" + str10.isEmpty() );
    System.out.println("str11.isEmpty():" + str11.isEmpty() );

    //,isBlank check 是否空值 或 內容是space 否則出false
    String str12 = ".";
    System.out.println("str10.isBlank():" + str10.isBlank() ); //true 空值
    System.out.println("str11.isBlank():" + str11.isBlank() ); //true 內容是space
    System.out.println("str12.isBlank():" + str12.isBlank() ); //false

    String password = " ";
    if (password.trim().isBlank()) {
      System.out.println("password is blank");
    }


    str9 = "Diamond Hill"; //上面已set String str9
    //starsWith   check開頭的字是否X
    System.out.println("startsWith :" + str9.startsWith("D")); //true
    System.out.println("startsWith H? :" + str9.startsWith("H")); 

    //startsWith(String prefix, int toffset)   該字是否在index x
    System.out.println("starwith case2:" + str9.startsWith("D", 0)); 
    System.out.println("starwith i is index1?:" + str9.startsWith("i", 1));
    System.out.println("starwith case3:" + str9.startsWith("D", 1));

    String ABC = "ABAC";
    System.out.println(ABC.startsWith("A", 2));
    System.out.println(ABC.startsWith("B"));
    String AB = "      ABCA";
    System.out.println("AB is " + AB.startsWith("A")); //false
    String newAB = "      !ABCA";
    System.out.println("newAB is " + newAB.startsWith("A")); //false

    
    //endsWith
    System.out.println("endsWith :" + str9.endsWith("D"));


    char grade = 'B';

    switch (grade) {
      case 'A':
      System.out.println("grade is A");
      break;
      case 'B':
      System.out.println("grade is B");
      break;
      case 'C':
      System.out.println("grade is C");
      break;
      default:
      System.out.println("grade is D");
      break;
    }

    if (grade == 'A')
    System.out.println("grade is A");
    else if (grade == 'B')
    System.out.println("grade is B");
    else if (grade == 'C')
    System.out.println("grade is C");
    else 
    System.out.println("grade is D");

    
    




  }
  
}
