public class App {
    public static void main(String[] args) throws Exception {
        int x = 3;
        //x *= 3;
        //x *= 3;
        //x *= 3;
        //x *= 3;
        //System.out.println("x: " + x);

        //for (starting point; ending point; counting "++"/"--"...)
        for (int i = 0; i < 10; ++i) {
            x *= 3;
        }
        System.out.println(x); //177147

        //for loop
        //initialization (var declaration & assignment); continue criteria; incremental operation
        //step 1 : i = 0
        //step 2 : check
        //step 3 : print "hello"
        //step 4 : i++ -> i become 1
        //step 5 : i = 1
        //loop 3 more times
        // step i = 4
        // check if i < 4? no
        //finally: exit the loop
        for (int i = 0; i < 4; i++) { //i = 0,1,2,3
            System.out.println("hello");
        }

        int sum = 0;
        for (int i = 0; i < 11; i++) { //10 cycle
            sum += i;
            System.out.println("round :" + i + "," + "sum: " + sum);
        }
        System.out.println("sum :" + sum); //ans : 55

        //find odd number
        for (int i = 0; i < 11; i++) {
            if(i % 2 != 0)
            System.out.println("odd no." + i);
        }
        //find even number
        for (int i = 0; i < 11; i++) {
            if(i % 2 == 0)
            System.out.println("even no." + i);
        }

        sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0)
            sum += i;
        }
        System.out.println("find odd no. and sum it" + sum); // 1+3+5+7+9

        //if (true){
        //for (;;){}

        //how to use break in for-loop
        for (int i = 0; i < 11; i++){
            if (i > 7)
                break; //exit the loop
        System.out.println("how to use break in for-loop:" + i);//when i = 7, still print
        }

        sum = 0;
        for (int i = 0; i < 11; i++){
            if (i == 7)
                continue; //skip
            sum += 1;
            System.out.println("how to use continue in for-loop:" + sum); // sum = 48 ->0+1+2+3+4+5+

        }



    }
}
