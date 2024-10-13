public class DemoForLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 11; ++i) {
      if (i % 2 == 1){
        System.out.println("approach 1 :" + i);
      }
    }

    for (int i = 10; i >0; i--) {
      if (i % 2 == 1){
        System.out.println("approach 2" + i);
      }
    }

    String str1 = "ABCDEFGH";
    char ch1 = 'F';
    int index = 0;
    System.out.println(str1.length());
    System.out.println(str1.charAt(5));

    //find the index of 'F' within str1
    //step 1 : i = 0
    // step 2 : charAT(0)
    // step3 : charAT(0) = A
    // condiition : find 'F'
    // step 4 : A != F 
    // i++ -> i +1
    // step 5: i = 1
    // step 6: charAT(1)
    // step 7: charAt(1) = B
    // i++ ->i =2
    // step 8 : charAT(2)
    // step 9: charAt(2) = C
    // keep loop
    // step 11: i = 5
    // step 12 : charAt(5) =F
    // str1.charAt(5) == F
    // str1.charAt(i) == ch1
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == ch1) {     //用LOOP找char
        index = i;
      }
    }
    System.out.println(index);

    //int sum = 0;
    int count = 0; //要數野
    for (int i = 1; i < 101; i++) { //0不要 as要由1開始
      if (i % 3 == 0 || i % 4 == 0) { //3 or 4都要
        count++;
      }
    }
    System.out.println(count); //50


    int tolal = 0;
    for (int i = 1; i < 51; i++) {
      if (i % 2 != 0) {
        tolal += i;
      } else { //if i%2 ==0  //不是奇數就偶數 SO可以入else
        tolal -= i;
        //approach 2
       // if (i % 2 == 0) {
       //   tolal += i;
      }
    }
    System.out.println(tolal);

    String star = "";
    for (int i < 5; i = 0; i--) {
      if (i == 4) {
        star = star.concat("*");
        System.out.println(star);

        
        
      }
    }



  }

}
