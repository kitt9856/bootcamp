public class Demointeger {
    public static void main(String[] args) throws Exception {

        // int - primitive type
        //Integer - Java class, wrapper class for int, is Object
        // can use method like String

        int x  = 3;
        Integer x2 = 4;  
        if (x > x2){ 

        }



        Integer y = 4;
        String s = "hello";
        //y and s are both object in java

        //Alternative
        

        //Avoid
        y = new Integer(4); // same as  Integer y = 4;
        Integer y2 = 8;
        if (y.compareTo(y2) < 0 ) {  //in java 所有比較都用method
            System.out.println("y is smaller than y2");
        } else{
            System.out.println("y2 is smaller than y");
        }

        //alernative
        if (y.compareTo(new Integer(4)) == 0){
            System.out.println("y is equals to 4");
        }

        //Avoud
        if(y == 4){ //implicitly convert y from Integer to int
            System.out.println("y is equals to 4");
        }

        int x3 = y; //un-boxing(Integer -> int)
        Long l2 = 10L; //auto-boxing (long->Long)

        //int x3 = y; //un-boxing 把x3的值拿走，放入y
        //Integer ->int -> double
        double d1 = y.doubleValue(); //doubleValue() return double type 
        //
        Long l1 = new Integer(10).longValue(); //Integer ->long ->long

        Double d4 = new Double(8);
        System.out.println(d4.shortValue()); //8
        //similar to
        //System.out.println((short ) d4); //Double has no relationship with Primitive short
        System.out.println((short) d4.doubleValue()); //Double ->double-> short
        //先.doublevalue()做unbox


        //Other types
        boolean b1 = new Boolean(false); //unboxing
        Character c1 = 'a'; //char to Character  // auto-box same as c1 = new Character('a') 只是program自已開了
        //primitive only save value

        Float f1 = 9.9f;  //auto-box
        float f2 = new Float(9.9); //un-box

        Byte b5 = (byte) 8;
        byte b6 = new  Byte((byte) 8); // avoid

        Double d6 = 8.5;

        Integer i5 = Integer.valueOf(8); //similar to new Int (8)
        String s2 = String.valueOf("hello");
        String s3 = String.valueOf(9); //conversion
        System.out.println(s3); // "9"



    }
}
