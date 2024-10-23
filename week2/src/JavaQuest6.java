public class JavaQuest6 {
  public static void main(String[] args) {
    int count = 0;
    int firstNumber = 0;
    int secondNumber = 1;
    for (int i =0; i < 500; i++){
     // count = (secondNumber + i) + firstNumber;
     int thirdNumber = firstNumber + secondNumber;
     firstNumber = secondNumber;
     secondNumber = thirdNumber;
     count++; //計到就print
     if (count > 15)
     break;
    }
    System.out.print(firstNumber + "+" + secondNumber);

    count = 15;
    firstNumber = 0;
    secondNumber = 1;
    int i = 0;
    while(i < 13){
      int thirdNumber = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = thirdNumber;
      i++;

    }



  }
  
}
