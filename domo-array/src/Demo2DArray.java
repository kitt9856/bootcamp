
import java.util.Arrays;



public class Demo2DArray {

  public static void main(String[] args) {
    int[] arr = new int[] {2,100,1};
    //2d array
    int[][] arr2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    //123 i =0 when j =0 ->1 when j=1 ->2


    System.out.println(arr2[1][2]);
    for(int row = 0; row<arr2.length;row++){
      for(int col = 0; col <arr2[row].length;col++){
        System.out.println(arr2[row][col]);
      }
    }

    String[] str = new String[] {"peter","joe","Ocs"};
    String[][] str2 = new String[][]{{"ae","op","zx"},{"bv","ml","jh"}};
    System.out.println(Arrays.toString(str2));
    String[][] string2 = new String[0][0]; // 0x 0
    String[] string3 = new String[0];

    String[][] string4 = new String[2][2]; //2x2
    System.out.println(string4[1][1]); //0

    System.out.println(string2); //String.toString()
    //toString from Object file -> no use override
    System.out.println(Arrays.toString(arr)); //1d array
    System.out.println(Arrays.deepToString(str2)); //2d array




     



  }

  public static int sum(int x , int y){
    return x + y;
  }
  public static int square(int num){
    return num* num;
  }
  
}
