public class demoExercise {



    public static void main(String[] args) {
        
         /**
 * Expected Output:
 * 
 * I am going to add two numbers together: 
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
        int x = 31;
        System.out.println("The first one:" + x);

        int y = 42;
        System.out.println("The second one:" + y);

        int z = x + y;
        System.out.println("The sum is:" + z);

        int a = y - x;
        System.out.println("The subraction reuslt is:" + a);

        int o = x * y;
        int b = o / 10;
        System.out.println("The another sum result is" + b);

        boolean varB = x > y;
        System.out.println("The variable varB is " + varB);

        boolean varC = b >= 130;
        System.out.println("The variable varC is " + varC);

        double v = -130.2;
        System.out.println("The variable fnumber is " + v);

        double u = -20.5;
        System.out.println("The variable fnumber is " + u);

        int reminder1 = 10;
        int reminder2 = 3;
        int ans1 = reminder1 / reminder2;
        int ans2 = reminder1 % reminder2;
        System.out.println("The variable reminder is " + ans2);
        System.out.println("The variable result is " + ans1);


        int aa = 100;
        int bb = 300;
        // && = and
        // || = or
        if (aa > bb || 10 < 1) { //condition, true or false
            System.out.println("a is > b :  true");
        } else {
            System.out.println("a is not > b: false");
        }
        

        //if a year is divisible by 4 and not divisible by 100 or divisible by 400,
        //then, it is a leap year
        // != mean not, == mean is

        int year1 = 2009;
        int year2 = 2020;
        int year3 = 2400;

        // && || 有分先後次序

        if (year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0) ) {
            System.out.println(year1 + " is leap year");
        } else{
            System.out.println(year1 + " is not leap year");
        }

        if (year2 % 4 == 0 && (year2 % 100 != 0 || year2 % 400 == 0) ) {
            System.out.println(year2 + " is leap year");
        } else{
            System.out.println(year2 + " is not leap year");
        }

        if (year3 % 4 == 0 && (year3 % 100 != 0 || year3 % 400 == 0) ) {
            System.out.println(year3 + " is leap year");
        } else{
            System.out.println(year3 + " is not leap year");
        }

        // else - if中的餘下的結果


        // 8 primitive type
        //week 1 : int, double, boolean, +-*/%, >.<.>=,<=


    }
    
}
