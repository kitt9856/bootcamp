
import java.util.Arrays;

public class Prep {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;
    int num3 = 3;

    int[] intArray = new int[3]; //arry.length = 3
    intArray[0] = num1;
    intArray[1] = num2;
    intArray[2] = num3;
    // = int[] {num1, num2..}


    int[] intArr2 = new int[] {1,2,3}; //直接放入

    String[] strArr = new String[10];
    strArr[0] = "";


    char [] charArr = new char[3];
    charArr[0] = 'a';
    System.out.println("1.:" + charArr[0]);
    charArr[0] = 'c'; //可renew
    System.out.println("1.:" + charArr[0]);

    

    String str = "example";
    char[] convertTocharArr = str.toCharArray();
    System.out.println("checking str:" + str);
    System.out.println("checking char[]:" + Arrays.toString(convertTocharArr));


    double[] doubleArr2 = new  double[] {1, 'c', 10.0, -127.129876};
    int[] intArr3 = new int[] {1,10,'a'}; //char is int

    String[] strArr3 = new String[] {"1", "a", "c", "123.123", "123.123"}; //{1,a,c} error
    System.out.println(strArr3[0]);
    System.out.println(strArr3[1]);
    System.out.println(strArr3[2]);
    System.out.println(strArr3[3]);
    System.out.println(strArr3[4]);

    //boolean

    






  }
  
}
