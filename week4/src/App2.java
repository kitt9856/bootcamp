import java.util.Arrays;

public class App2 {
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3,4,5,6,7,8};
    for(int i: arr){
      if(i % 2 == 0)
        System.out.println(i + " is even number");
      System.out.println(i + " is odd number"); //out of block so 係咪都會print
      
    }

    String str = "Java , Python , JavaScript , TypeScript , R , C++ , C#";
    String[] strArr = str.split(",");
    for (int i = 0; i < strArr.length / 2; i++){
      String temp = strArr[i];
      strArr[i] = strArr[strArr.length - 1 - i];
      strArr[strArr.length - 1 -i] = temp;
    }    
    System.out.println("Excercise 1 : " + Arrays.toString(strArr));

    String str1 = str.replace(" ", "");
    System.out.println("Exercise 2: "+ str1);

    char[] charArr = str.toCharArray();
    char[] charArr2 = str.repplace(" ","").toCharArray();
    System.out.println("Exercise 3: " + Arrays.toString(charArr2));

    //if( == 'J' || =='P')
    String result = "";
    for (int i = 0; i < charArr2.length; i++){
      if (charArr2[i] >= 'A' && charArr2[i] <= 'Z'){
        continue;
      }
      result += charArr2[i];
    }
    System.out.println("Exercise 3: " + result);



  }
  
}
