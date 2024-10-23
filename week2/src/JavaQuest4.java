public class JavaQuest4 {
  public static void main(String[] args) {


    //first 10 numbers 
    //1.even no. 2.divisble by 3 3. > 0
    int count = 0;
    for (int i = 0; i < 100; i++){
      if (i % 2 ==0 && i % 3 == 0 && i > 0){
        System.out.println(i);
        count++;
      }
      if (count == 10) 
      break;
    }
  }
  
}
