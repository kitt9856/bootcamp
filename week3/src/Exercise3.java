
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int targetNumber = random.nextInt(100) + 1; //nextInt(100)
    int guess = 0;

    int i = 0;
    int lowerBound = 0;
    int higherBond = 100;
    while (guess != targetNumber){ //幾時會做野
      System.out.println("Guess a number between 1 and 100.");
      guess = scanner.nextInt();
      i++;
      if (guess == targetNumber){
        System.out.println("correct");
      } else if (guess > targetNumber) {
        System.out.println("too high");
      } else if (guess < targetNumber) {
        System.out.println("too low");
      }
    }

    //do-while loop
    do {  //做一次先
      System.out.println("Guess a number between" + lowerBound + "and" + higherBond + ".");
      guess = scanner.nextInt();

      if (guess == targetNumber){
        System.out.println("correct");
      } else if (guess > targetNumber) {
        System.out.println("too high, try number between" + lowerBound);
      } else if (guess < targetNumber) {
        System.out.println("too low, try number between" + higherBond);
      }
    }while (guess != targetNumber); //幾時會做 // countiune
    

    scanner.close();



  }
  
}
