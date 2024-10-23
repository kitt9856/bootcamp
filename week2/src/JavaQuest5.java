
import java.util.Scanner;


public class JavaQuest5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a letter:");
        //String character = 

        int count = 0;
        String str = "Welcome to the coding bootcamp.";
        char target = 'c';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }//loop end

        //use loop result so outside of loop
        if (count > 0) {
            System.out.println("we found " + count + " character c in the String.");
        } else {
            System.out.println("Not found");
        }




    }

}
