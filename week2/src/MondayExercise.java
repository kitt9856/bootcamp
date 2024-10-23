
import java.util.Arrays;


public class MondayExercise {

    public static void main(String[] args) {
      //Exercise 1
        String inputString = "programming";
        char targetChar = 'a'; //char> ASCII -> int

 // Objective : Practice : indexOf() , while-loop

    // Task: Write a program that takes a string and a character as input,
    // and counts how many times the character occurs in the string using indexOf()
    // and a while-loop. Make sure to handle cases where
    // the character is not found.

        int count = 0;
      //  int i = 0;
        int index = inputString.indexOf(targetChar); //check inputstring's ascii code 
        //find the index of input int/char
        //if i print index, out put -> 5
        //return -1 , if the character does not occur
        while(index != -1){ //只要中target就做野  
          count++; //中target count 1次
          index = inputString.indexOf(inputString, index + 1); //if a have more one //如不寫這句只計到1次
          //用中了target的index位數再+1 即下一個位 放入var中
        }
        System.out.println("the character " + targetChar + " appears" + count + " times.");

        
// Exercise 2
    // Print Vowels in a String

    // Objective: Practice for-loop, charAt() , if-else, and String manipulation
    // Task: Write a program that takes a string input from the user
    // and prints all the vowels (a, e, i, o, u) present in the string using a for-loop
    // and if-else. Ensure both uppercase and lowercase
    // vowels are considered.

    // Example: Input string: "Java Programming". Output: a a o a i



        String inputString2 = "Java Programming";
        //count = 0;
        //i = 0;
        for (int i = 0; i < inputString2.length(); i++){
          char ch = inputString2.charAt(i); // use string find target char
          //每次loop先用var裝index(i)的字
          if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' ||
          ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){ //中條件就PRINT出來
            System.out.print(ch + " ");
          }

        }

        char[] vowels = new char[] {'A','E','I','O','U','a','e','i','o','u'};
        System.out.println("Approach 2:");
        for (int i = 0; i < inputString2.length(); i++){//沿住題目的字去loop
          for (int j = 0; j < vowels.length; j++) {//沿住vowels的字去loop
            if (inputString2.charAt(i) == vowels[j]){//在loop vwels中，check外層loop題目字時候，是否= target
              System.out.print(inputString2.charAt(i) + " ");
            }
          }
        }
        System.out.println("");



        String inputString3 = "I am a boy.";
        System.out.println(inputString3.substring(2, 4)); //substring()中第2個函數會-1
        


        String inputString4 = "Java , Python , javaScript, ,typeScript";
        char target = 'P';

        //using charAt
        for (int i = 0; i < inputString4.length(); i++){
          if (inputString4.charAt(i) == target)
          System.out.println("charAt():" + i);
        }

        //using indexof : (find the first occur index, can ise)
        System.out.println("indexOf(): " + inputString4.indexOf(target));



        int number = 0;

        for (int i = 1; i < 6; i++) {
          for (int j = 1; j < 6; j++){
            System.out.print(i * j + " ");
          }
          System.out.println();//j行晒就格行 即做晒1行
        }
        // i = 1 , j = 1 -> 1 ,


        int[] intArr = new int[4];
        int a = 1;
        int b = 3;
        int c = 5;
        int d = 7;
        intArr[0] = a;
        intArr[1] = b;
        intArr[2] = c;
        intArr[3] = d;
        System.out.println("print Array " + intArr);
        System.out.println("print Array" + Arrays.toString(intArr));


        for(int i = 0; i < intArr.length; i++){ // array's length without ()
          System.out.println(intArr[i]);
        }


        //String[] strArr = {"ele1", "ele2"}; //not suggest
        String[] arr1 = new String[4];
        String[] arr2 = new String[] {"a","b","c","d"};
        for (int i = 0; i < arr1.length; i++){
          arr1[i] = arr2[i];
        }
        //順序
        System.out.println("after renew arr1: " + Arrays.toString(arr1));
        //倒序  d,c,b,a  d is index 0
        for (int i = 0; i < arr1.length; i++){
          arr1[i] = arr2[arr2.length - i - 1];
          //when i = 0, arr2[4-0-1] =arr2[3]
        }
        System.out.println("after renew arr1 resever: " + Arrays.toString(arr1)  );


        String[] arr3 = new String[] {"abc","def+_{}{:>}","ghii987","xyzabc"};
        // arr3[0] is type of string, so that we can use string method
        System.out.println("Exercise 8: " + arr3[0].charAt(0));


        String[] arr4 = new String[] {"abc","def","ijk","xyz"};
        for (int i = 0; i < arr4.length; i++){ //i -.每間房
          //approach 1 set a var to arr4[i]
          //String str = arr4[i]; //
          //for (int j = 0; j < str.length(); j++)
          for (int j = 0; j < arr4[i].length(); j++){//房中
            System.out.println("Exercise 9: " + arr4[i].charAt(j));
          }

        }


        String[] arr5 = new String[] {"abc","def","ijk","xyz"};
        String[] arr6 = new String[arr5.length];
        for (int i = 0; i < arr5.length; i++){
          arr6[i] = arr5[arr5.length - i - 1];
        }
        System.out.println("Exercise 10: " + Arrays.toString(arr6));

        for (int i = 0; i < arr5.length ; i++){
     
        }

        for (int i = (arr5.length - 1) ; i > -1  ; i--){

          System.out.print( arr5[i] + ",");

     
        }

        







        
    }

}
