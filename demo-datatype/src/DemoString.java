public class DemoString { //class name = file anme
    public static void main (String[] args) {
        //integer


        // ...com is a string value
        String emailAddress = "ABC@gmail.com";
        System.out.println(emailAddress);



        //as 2 is an int value, we cannot assign int value to String variable.
        //String x = 2; Not ok!!!!!



        //string operation: +
        String x1 = "hello";
        String x2 = "world";
        String x3 = x1 + x2;
        System.out.println("x3=" + x3 + ", x2=" + x2);

        //!equals()
        // "S"ting because Sting is class
        boolean result = "hello".equals(x1);// 是否=
        //boolean result = x1.equals("hello");  可以這樣寫但不專業 如要hard code用"hello" 因你的value已知道
        System.out.println(result); //true
        boolean result2 = x1.equals("hello!"); // 是否=
        System.out.println(result2); //false

        //! length() 問長度
        int len = x1.length();
        System.out.println(len); //5

        //! charAt(index)
        // index starts from 0 to length -1
        System.out.println(x1.charAt(4));//o
        System.out.println(x1.charAt(0));//h
        System.out.println(x1.charAt(x1.length() -1)); //o  先看最入的()


        int age = 60;
        String sentence = "I am at age " + age; //String + int ->
        System.out.println(sentence);


        //declaration
        int u;
        // int default value is 0, but it is not for local variable
        //System.out.println(u); //not ok, because all local variables have to be initialized.

        long l7 = 10l; //is ok, but people will confuse -> should use 10L
        float f2 = 10.3f;
        double d2 = 10.3d;
        int i2 = 10;

        // toUpperCase()
        System.out.println(x1.toUpperCase()); //HELLO
        System.out.println("Hello".toLowerCase()); //hello
        // 10 cannot to uppercase as it is int in java


        // Chain Method
        System.out.println("Peter".toLowerCase().length() > 4); //string can .length //output 5 . //>4 output true

        // concat()
        System.out.println("Vincent".concat("Lau"));//VincentLau
        String fullName = "Vincent" + "Lau";
        System.out.println(fullName);

        String email = "vincentlau@gmail.com";
        System.out.println(email.contains("gmail")); //true

        




        







    }
}
