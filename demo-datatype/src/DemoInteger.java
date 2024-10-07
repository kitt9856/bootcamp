public class DemoInteger {
  public static void main(String[] args) {
    //byte, short, int, long
    byte b1 = 3;
    System.out.println(b1);
    //byte is in the range of -128 and 127  **byte should not "B"yte
    b1 = -128;
    b1 = 127;
    //b1 = -129;  //cannot convert from int to byte
    //b1 = 128; //cannot convert from int to byte

    short s1 = -32768; //-2^15
    short s2 = 32767; //2^15
    //s1 = -32769;
    //s2 = 32768;


    int i1 = -2_137_483_648;  //_ = 錢的,
    int i2 = 2_137_483_647; //2^31

    int age = 13; // =的右方必是int value , if use byte, short, long would do convert

    System.out.println(i1 + 1); //-2137483647
    System.out.println(i2 + 1); //2137483648

    // 2^63
    long l1 = Long.MAX_VALUE;
    System.out.println(l1); //9223372036854775807


    //overflow
    System.out.println(i2 + 1);
    System.out.println(i1 - 1);
    System.out.println(b1 + 1); // b1 -> byte + int -> int + int -> int -> 128



  }

  
}
