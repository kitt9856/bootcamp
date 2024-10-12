public class DemoString2 {
  public static void main(String[] args) {
    
    String  str1 = ""; //空值
    String  str2 = "oscar";
    String  str3 = "kit@gmail.com";
    String  str4 = "你好";
    String  str5 = " ";
    

    str1.equals(str2); // return type method signture, () -> input parameter
    // returnType methodSignature(inputParameter)
    System.out.println(str1.equals(str2)); //same if str1 = str2

    //str1.equals(str2);

    System.out.println("str1.length():" + str1.length()); //0 length的()不可入野
    System.out.println("str5.length():" + str5.length()); //1

    str3.charAt(0); //char & string , '' ""
    System.out.println("str3.charAt(0):" + str3.charAt(0)); //output k 因第0個位是k //case 2

    //case 1 find last word
    int str3Length = str3.length(); //str3的長度 就不用數最後一個數是多少位
    //System.out.println(str3Length); //13
    System.out.println("last word is: " + str3.charAt(str3Length - 1)); //因charat是由0開始數，而length是數字數 so -1
    //case 2 不入VAR 直接用method找
    System.out.println("last word is: " + str3.charAt(str3.length() - 1));
    //error case
    //System.out.println(str3.charAt(str3Length)); 
    // 因為charat是由0開始數，str3Length是13但charat最後一個字已經係12


    //trim() remove space ()中不用入野
    String str6 = "   Bootcamp  ";
    System.out.println("before:" + str6);
    System.out.println("after trim :" + str6.trim());
    String str7 = "    Bootcamp   abc";
    System.out.println("before:" + str7);
    System.out.println("after :" + str7.trim());

    //replace(char oldChar ,char newChar) 如改char用''' 改2個字以上用""
    // ()中不能一邊'' 另一邊""
    String str8 = "      Diamond Hill       ";
    System.out.println(str8);
    System.out.println(str8.replace('D', 'd').trim()); //只把D改d
    System.out.println(str8.replace("Dia", "AID").trim()); // AIDmond Hill


    String str9 = "ABCDE";
    System.out.println(str9);
    System.out.println("result of toLowerCase" + str9.toLowerCase());

    //toUpperCase
    String str10 = "AbCdEf";
    System.out.println("str10.toLowerCase() :" + str10.toLowerCase());

    String str11 = "  happy";
    String str12 = "new year";
    System.out.println(str11 + str12);
    //concat  like +string
    System.out.println("concat 1:" +str11.concat(str12));
    System.out.println("concat 2:" +str12.concat(str12));
    System.out.println("concat 2:" +str12.concat("!!")); //new year!!
    System.out.println("concat 2:" +str12.concat(str11.toUpperCase())); //concat(要放string野)
    
    
  }
  
}
