import java.util.Scanner;


public class DemoScanner2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("please input a number: ");
    int number = input.nextInt();

    boolean isAdult = number >= 18;

    if (isAdult)
    System.out.println("isAdult");
    else
      System.out.println("is not Adult");

  }
}