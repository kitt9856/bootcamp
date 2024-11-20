import java.util.Arrays;
import java.util.Random;



public class AnswerMarksix {

  //可以專心思考
  //Static method
  public static boolean isDuplicated(int[] marksix, int number){
    for (int i =0; i < marksix.length; i++){
      if (number == marksix[i])
        return true; // same as break function
    }
    return  false;
  }



  public static void main(String[] args) {
    int[] marksix = new int[7];
    //no duplicated
    int ballCount = 0;
    int idx = 0;  //放array index = x[i]
    boolean duplicated = false;
    while (ballCount < 7) {
      duplicated = false;
      int number = new Random().nextInt(49) + 1; //1 -49 as next(50)->0-49
      
      if (!isDuplicated(marksix, number)){ //with duplicat 抽走該球
        marksix[idx] = number;
        idx++;
        ballCount++;
      }
        
    }
    System.out.println(Arrays.toString(marksix));
  }
  
}
