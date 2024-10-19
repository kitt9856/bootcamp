
public class DemoForLoop {

    public static void main(String[] args) throws Exception {
        //for loop
        //Step 1 "int i = 0;"
        //i使用範圍只在1-4
        //Step 2: Check if i < 3 -> true
        //Step 3: print hello
        //Step 4: Back to i++ -> i become 1  --> 0 + 1 =1
        //Step 5: Check if i < 3 -> true
        //Step 6: print hello
        //Step 7:Back to i++ -> become 2  --> 1+1 =2
        //Step 8: Check if i < 3 -> true
        //Step 9:print hello
        //Step 10: Back to i++ -> i become 3
        //Step 11: Check if i < 3-> false
        //Step 12: exit loop
        for (int i = 0; i < 3; i++) { //不可i <= 3
            System.out.println("hello");
        }
        // 想做3次 0 i < 3
        //system print(i) wrong

        //4 time i=0 - 3
        for (int i = 0; i < 4; i++) {
            System.out.println("i=" + i);
        }

        // i=0 --次數
        //sum
        int Sum = 0;
        for (int i = 0; i < 10; i++) {
            Sum += 1;
            System.out.println(Sum);
        }

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i; //read or write on variable sum
        }
        System.out.println("sum=" + sum);

        //sum up all even numbers between 1 -20
        sum = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                sum += i; //如是雙數會加自己
            }
        }
        System.out.println("1 to 20 sum" + sum); //sys out 放出邊就在出面行looped sum

        //sum up all even numbers and minus all odd  nimbers between 1-20
        sum = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println(sum);

        //print out 10 8 6 4 2 
        for (int i = 10; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(10 - i);
            }
        }

        //searching
        //String
        String s = "abcdefg";
        //output: aceg
        //charAt(), for loop i -> can be index
        String output = "";
        for (int i = 0; i < s.length(); i++) { //小過length就做野
            if (i % 2 == 0) { //0 % 2 true so print index 0
                output += s.charAt(i); //Strin + char -> String
            }

        }
        System.out.println(output);

        //counting
        String s2 = "bbbbaaaayfhaad"; //a -> 6
        char target = 'a';
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == target) { //charat is prem so use ==
                count++;
            }
        }
        System.out.println(count);//6

        //how many numbers can be divided by 3 or 4 between 1 -100?
        count = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //seaching
        String s3 = "abcdabcdabcd";
        //boolean found = false; if else will do
        //print out the last index of c, if not found, print out-1
        int index = -1; //cannot find 情況 
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == 'c') {
                index = i; //每次到c都到用index no.改到var，loop到最後時
            }            //sys out 最後的var
        }
        System.out.println(index);

        //alternative: lastIndexOf
        System.out.println(s3.lastIndexOf('c')); //也有做loop
        System.out.println(s3.indexOf('c')); //2, the first index of c
        System.out.println(s3.indexOf("cda")); //2, the first index of c

        //contains
        System.out.println(s3.contains("dab")); //true

        //substring(fromIndex, toIndex -1)
        System.out.println(s3.substring(1, 3)); //bc

        //substring -> print the last 2 char as string
        //System.out.println(s3.substring(s3.length() - 2, s3.length())); //cd //length會-1
        System.out.println(s3.substring(s3.length() - 2)); //cd //length會-1

        //continue & break
        //break: exit the nearest loop block
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
            //handle var
            if (i > 2) {
                break; //make sense as real end the program
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i > 2) {
                break; // break not make sense as code not finish
            }
            System.out.println("i=" + i);

        }
        //handle var

        //continue
        //print odd numbers
        //continue: early exit iteration -exit那個回合的loop
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue; //continue就是應該不想行下面的code //skip the rest, and back to i++
                //check unexpect case or shouldnot handle case
            }
            System.out.println("i=" + i);

        }
        //handle var

        //System.out.println(); //ln ->line break
        //System.out.print(); //without line break
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("");

        //12345
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
        }
        System.out.println("");

        // When i = 0, j from 0 to 3
        //When i = 1, j from 0 to 3
        //...
        //.. i = 4, j from 0 to 3 當i=X 行晒j=... 再到i=...
        for (int i = 0; i < 5; i++) {//outer loop
            for (int j = 0; j < 4; j++) {//inner loop  //先行晒這loop,行完才回上層
                System.out.println("i=" + i + ", j=" + j);
                //每次print 目前外層i的數 和 j的數
                // i =0 -> 會loop內層 -> 內層當中sys out i= 和 j=
            }

        }

        // *****
        // ****
        // ***
        // **
        // *
        //int n = 5;
        String star = "*****";
        //String staroutput = "";
        System.out.println(star.length());
        //nested loop // i vs j relationship
       //for (int i = 0; i < 6; i++){
       //    
       //}

        for (int n = 5; n > -1; n--) { //n大過-1就做野 即n=0->index 0也會show野
            System.out.println(star.substring(0,n));

        }

        //high high level (optional)
        //  *
        // ***
        //  *
        // n = 3; 
    }
}
