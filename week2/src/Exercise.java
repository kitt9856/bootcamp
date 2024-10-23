public class Exercise {
  public static void main(String[] args) {
    String original = "Programming";
    String reversed = "";
    for (int i = original.length() -1 ; i >= 0; i--){
      char ch = original.charAt(i);//先找想轉的char
      reversed += ch;//把想轉的char逐個加入

    }
    System.out.println("original: " + original);
    System.out.println("reversed: " + reversed);

  }
  
}
