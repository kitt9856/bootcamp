public class DemoDatatype {
    public static void main(String[] args) {
        //
        int y = 10;
        int x = 2;

        int a = x + y; // 12

        System.out.println(a);

        int result = a -y * x;
        System.out.println(result);




        //remainder

        int remainder = 10 % 3;
        System.out.println(remainder);

        // double (a number with decimal place)
        double w = 10.5;
        double w2 = 10;  
        System.out.println(w); //shortcut sysout
        System.out.println(w2); 

        // 10 is an int value
        // w2 is an int variable
        // assign an int value to a double variable
        //int value -> double value
        //assign double value to double variable
        
        // Naming convention:camel case
        int englishScore = 70;
        int historySocore = 85;
        int mathScore = 90;

        //int + int -> int
        //int + double -> double + double -> double

        //step1: int + int + int -> int
        //step2: int / int -> int
        //step3: assign int value to double variable

        double averageScore = (englishScore + historySocore + mathScore) / 3;
        System.out.println(averageScore);//81  but real answer=81.6667

        //so should in step2 int / double -> double or double english(var)

        //var

        //re-assignment
        x = 20;
        a = -40;

        // code block: main(String[] args) {}
        // int x = 9; we cannot reuse the same variable name within a code block
        int x2 = 9;

        //how to backup a value?
        int backup = x;
        x = 25;

        //operators: +=,-=, *=,/=
        int e = 9;
        //From right to left
        //9 +1 -> assign to var e
        e = e + 1;//10
        System.out.println("e=" + e); //10
        e += 1;
        System.out.println("e=" + e); //11
        e = e -1; //10
        e -= 1; //9

        e *= 2;
        System.out.println("e=" + e);
        e /= 3;
        System.out.println("e=" + e);

        //++
        e++; //increment by 1 加自己
        System.out.println("e=" + e); //6

        //--
        e--; //decrement by 1
        System.out.println("e=" + e);

        ++e; //increment by 1
        --e; //decrement by 1


    }
}