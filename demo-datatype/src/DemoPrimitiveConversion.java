public class DemoPrimitiveConversion {
  public static void main(String[] args) {
    int i1 = 3;
    double d1 = 9.3;
    System.out.println(i1 + d1); //3.0 + 9.3


    //float f1 = 3.4; 3.4-> double value
    //so , double value cannot be assigned to float type
    // because double is higher level than float

    float f2 = 3.4f; //3.4f is a float value
    //dont write 3.4F 
    double d2 = 3.4f; //assign a lower level type value to a higher level type

    //byte -> short -> int -> long -> float -> double
    //char -> int -> long -> float -> double

    int i2 = 10; //int value
    long l1 = 10L; //long value
    long l2 = 10; // assign a lower level type value to a higher level type

    float f3 = 20L; //OK -> 20.0

    double d3 = 3.4d; //3.4d-> double value

    //run 後的work是電腦的JDK做
    //float f1 =3.4; 紅線是由VS CODE 

    double d4 = 3.4;
    //float f1 =  d4; //why? Java: not safe -> incorrect syntax 
    // not safe -> because d4 may contain a value with high precisions

    // as a java developer, you have a right to make it happen( take the risk)
    //Explicit conversion
    float f1 = (float) d4; //take the risk
    System.out.println("f1= " + f1);

    int i3 = 32768; 
    short s1 = (short) i3;//short max: 32767 
    System.out.println("s1=" + s1); //s1 = -32768, overflow

    //short max and min value between -32768 to 32767

    int i4 = -32769; 
    short s2 = (short) i4;//short max: -32768   
    System.out.println("s2=" + s2); //s2 = -32767, overflow

    double d5 = 6.7;
    int i5 = (int) d5; //downcasting (take risk)
    System.out.println("i5=" + i5); //i5=6, preicison loss

    char c1 = 'a';
    int i6 = c1;
    System.out.println(i6); //97

    int i7 = 97;
    //char c2 = i7; not ok, downcast

    //Implicit Conversion(ok -> from int to lower level)    hard code value時會value check
    //real-time check if the value 97 is with the range scope of type
    char c3 = 97;
    byte b1 = 97;
    short s3 = 97;

    //implicit conversion (not ok -> from float to lower level)
   // int i8 = 1.9f; // 高level(float)放入低level so not ok
   // short s4 =1.9f;
    
   short s5 = 32767;
   short s6 = 10;
   //int + short -> int + int ->int  不是int +short -> int 
   //int s7 = s5 + s6;
   int result = (int) s5 + (int) s6;
   System.out.println(result); //32777
   System.out.println(s5 + s6); // 背後自已轉做int而已

   //byte + byte -> 127 + 1 -> -128 (byte overflow) -> int
   
   byte b10 = 90;
   byte b11 = 91;
   // byte b12 = b10 + b11; byte 不可加byte (死記)
   byte b12 = (byte) (b10 + b11);
   System.out.println(b12); //-128 (overflow)





  }
  
}
