
public class Demoif {

    public static void main(String[] args) {
        int x = 3;

        if (x > 2) { // x  > 2 -> return true
            System.out.println("x > 2");
        }

        boolean result = x > 2;

        if (result) {
            System.out.println("x > 2");
        }

        int age = 66;
        boolean isElderly = age >= 65;
        if (isElderly) {
            System.out.println("Elderly.");
        }

        //same but it not easy to read
        //if (age >= 65) {
        //  System.out.println("Elderly.");
        //}
        String s = "hello"; //if 因應S的值做野
        if (s.length() > 4) {
            System.out.println("length > 4"); //should print out
        } else {
            System.out.println("length <= 4");
        }

        //**change max to be a/b
        int a = 101;
        int b = 100;
        int max = -1;

        if (a > b) {
            max = a;
        } else { // b >= a
            max = b;
        }

        int historySore = 70;
        int passingSore = 60;
        boolean examResult = false;

        if (historySore >= passingSore) {
            examResult = true;
        } else {
            examResult = false; //盡量寫埋else result
        }
        if (examResult) {
            System.out.println("Exam is passed!");
        } else {
            System.out.println("Exam is fail");
        }

        // else if
        String color = ""; //""-> empty string value = space " "
        if (historySore > 60) {    //if use >= 進入不到else if因 重疊
            //evet1
            color = "GREEN";  
            System.out.println(color);
        } else if (historySore == passingSore) { //"==", check if they are equals
            //event 2
            color = "YELLOW";
            System.out.println(color);
        } else {
            //event 3
            color = "RED";
            System.out.println(color);

        }

        char grade = ' ';
        int score = 85;
        //Grade A: >= 90, Grade B: >= 80, Grade C: >= 70, fail: < 70

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade =" + grade);

        //防止重疊 >=
        //AND &&
        //OR ||
        if (score >= 90) {
          //event
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
          //event
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
          //event
            grade = 'C';
        } else {
          //event
            grade = 'F';
        }


        boolean isGradeB = score >= 80 && score <= 89;
        System.out.println(isGradeB);

        int customerAge = 70;
        char customerGender = 'F';

        int baseFee = 100;
        //If Male,10% charges
        //Female and more than 60, 8% charges, otherwise, 10% charge

        //OR combine same result scenario
       // male or female <= 60,10% charge
       //note:10% charge觸發條件 1:Male  2.female <= 60
       if (customerGender == 'M' || (customerGender == 'F' && customerAge <= 60)) { //and 會先行
        baseFee *= 1.1;
       } else if (customerGender == 'F' && customerAge > 60){
        baseFee *= 1.08;
       }


       if (customerGender == 'M') {
        baseFee *= 1.1;
       } else if (customerGender == 'F' && customerAge > 60){
        baseFee *= 1.08;
       } else if (customerGender == 'F' && customerAge <= 60){
        baseFee *= 1.1;
       }
       System.out.println(baseFee);


       //string method
       String s2 = "heLlo world" ;
       //if string value contains "w", print "Contain w."
       //if string value contain "w" and length > 7, print "****"
       //position 3 is upper case, print "upper case."

       //You may print more than one sentence.

       if (s2.contains("w")) {
        if (s2.length() > 7){
          System.out.println("****");
        } else{
          System.out.println("Contain w.");
        }
       } 

       boolean containw = s2.contains("w");
       boolean lengthLargerThan7 = s2.length() > 7;
       boolean isPosition3UpperCase = s2.charAt(2) >= 65 && s2.charAt(2) <= 90; //65 come from ASII code 
       //90 = 65 + 26

       if (containw) {
        System.out.println("Contain w.");
       }
       if (containw && lengthLargerThan7){  //true && true -> true
        System.out.println("*****");
       }
       if (isPosition3UpperCase) {
        System.out.println("upper case.");
       }
       //may print more than one sentence so only use if no else if
       //if else只中一個出一結果

       //true && true -> true
       //true && false -> false
       //false && false -> false



    }

}
