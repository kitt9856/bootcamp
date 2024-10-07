public class DemoDoulble {
  public static void main(String[] args) {
    //flat, double
    //10.3 -> double value
    double d1 = 10.3;
    //float f1 = 10.3; // Error as cannot convert from double to float

    //** byte -> shoty -> int -> long -> float -> double
    float f2 = 71;
    double d2 = 71;
    long l2 = 71;
    // no precision loss 無精度損失 所以可以run

    double x = 1.1;
    //float f = x; //error

    // 6 -> int value
    // 這2個是例外case
    byte b10 = 6; //這是例外
    short s10 = 6;

    //value 可以放到高過自己的type,but 降級是不可以

    int i11 = 6;
    //b10 = i11;

    //6 -> int value
    //6L -> long value
    long l12 = 6L;
    float f12 = 6L; //6.0
    double d12 = 6L;  //6.0  可以RUN但不代表不會轉

    // int i12 = 6L; //long value不可入int

    //6.5f;

    float f13 = 6.5f;
    double d13 = 6.5f;
    //long l13 = 6.5f; //error

    // 6.5 or 6.5d
    double d14 = 6.5;
    //float f14 = 6.5;
    //long l14 = 6.5;



  }
  
}
