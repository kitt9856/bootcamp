

public class DemoForEach {
  public static void main(String[] args) {
    int[] arr = new int[] {10,2,4,9,-3};
    for (int i = 0; i < arr.length; i++){
      System.out.println(i);
    }


    //for-each
    //disadvantage: You can only access the element of the iteration
    for(int x : arr){
      System.out.println(x);
    }

    for (int i = 0; i < arr.length - 1; i++){
      System.out.println(arr[i] + "," + arr[i + 1]);

    }

    String[] arr2 = new String[] {"hello","xxx","apple"};
    //for (int x : arr2){
    //  System.out.println(Arrays.toString(arr2));
    //}

    //"abaaabbbyyabrs"
    //Find out which character appear the most number of times.
    //result:b
    String ch = "abaaabbbbyyabrs";
    int count = 0;
    char target = ' ';
    String largCh = "";
    int backup = 0;  //backup = old n count
    for (int i = 0; i < ch.length(); i++) {
        target = ch.charAt(i);
        for (int j = 0; j < ch.length(); j++) { //counting
            if (target == ' '){ //
              continue;
            }else{
            if (target == ch.charAt(j)) {
                count++;
            }
            }
            

        }
        if (count > backup){
          backup = count;
          largCh += target; //ab
          if (largCh.length() > 1){
            largCh = largCh.replace(largCh.charAt(0), ' ');
          }
        } 

        count = 0;
        ch = ch.replace(target, ' ');
        System.out.println(ch + count + " "+ backup);

    }
    System.out.println("the char: " +  largCh +" appear "+ backup + " time"   );

   
    
    
    
    

    

      //char chTarget = ch.charAt(i);
      
    

    //do-while loop
    // at least do once 無條件做1次
    //debug or trying時會用
    int x = 10;
    do { 
      System.out.println("x= " + x);
        x++;
    } while (x < 14); //when x < 14, loop continues..
    // x=10
    // x=11
    // x=12
    // x=13
    



  }
  
}
