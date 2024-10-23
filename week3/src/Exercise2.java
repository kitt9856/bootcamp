
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas input:");
        String input = scanner.nextLine().trim().toLowerCase();
        boolean palindrome = false;

        //String x = "";
        for (int i = 0; i < (input.length() / 2); i++) {
            if (input.charAt(i) == input.charAt(input.length() - i - 1)) {
                palindrome = true;
                break; //check完就走
            }
            

        }
        if (palindrome) {
            System.out.println(input + " is ");
        } else {
            System.out.println(input + " is not ");

        }
        

        scanner.close();


        /* for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == input.charAt(input.length() - i)){
                x += input.charAt(input.length() - i);
            }
            if (input.equals(x)) {
                palindrome = true;
            }
        }
        if (!palindrome){
            System.out.println(input + "is ");
        } else {
            System.out.println(input + "is not ");

        } */
    }
}
