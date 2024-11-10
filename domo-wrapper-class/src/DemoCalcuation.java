public class DemoCalcuation {
  public static void main(String[] args) {
    Integer num1 = Integer.valueOf(127); //create an object of 127
    Integer num2 = Integer.valueOf(127); //within -128 to 127, reuse the same object of 127
    Integer num5 = Integer.valueOf(127); //within -128 to 127, reuse the same object of 127

    System.out.println(num1 == num2); //true
    System.out.println(num1.compareTo(num2));//0

    Integer num3 = Integer.valueOf(128);
    Integer num4 = Integer.valueOf(128);
    System.out.println(num3 == num4); //false
    System.out.println(num3.compareTo(num4));//0
    System.out.println(num3.equals(num4)); //check value, true

    //In java, for object, "==" is to check if they are same object
    //for number (byte,short,integer,long), -128 to 127 是常用數
    //java中 可以有多個不同的"127" e.g. int x =3 int x2 =3

    //num5 = 1000; //改指向1000
    Integer num6 = new Integer(127);
    System.out.println(num1 == num6); //false 因new後已開新房屋
    Integer num7 = 127;
    System.out.println(num1 == num7); //true same房屋

    System.out.println(num7 + 20);

    

    //128開始都當new做法 開新128
    //127或前，如不new 會當同一object


    




  }
  
}
