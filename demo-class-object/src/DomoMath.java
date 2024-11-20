public class DomoMath {
  public static void main(String[] args) {
    System.out.println(Math.PI);


    double cubeVolume = Math.pow(9.0, 3.0);
    System.out.println(cubeVolume); //729.0

    //Math.max()
    int[] arr = new int[]{2,3,10,1};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i <arr.length; i++){
      max = Math.max(arr[i], max);
    }

    //Math.min()

    System.out.println(Math.sqrt(25)); //5.0 開方5
    System.out.println(Math.sqrt(-25)); //NAN

    //absoluate value
    System.out.println(Math.abs(-3)); //3
    System.out.println(Math.abs(3)); //3

    System.out.println(Math.round(3.14159));//3 四捨五入
    System.out.println(Math.round(3.44159));//3
    System.out.println(Math.round(3.54159));//4 四捨五入

    System.out.println(Math.random()); //0.0-1.0
    //0.5533506217342451

    System.out.println(Math.floor(Math.random() * 1000) ); //0-10000

    



  }
  
}
