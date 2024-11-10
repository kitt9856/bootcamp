public class DemoStaticMethod {
    public static void main(String[] args) throws Exception {

        int result = sum(3,2);
        System.out.println(result);

        System.out.println(sum(4,9));

        System.out.println(rectangleArea(9, 3));//27

        System.out.println(findMax(new int[] {10, -3 ,9 ,11 ,-100}));//11
        System.out.println(circleArea(2.0));

        System.out.println(0.1 + 0.1); //0.2
        System.out.println(0.2 + 0.1); //0.30000000004 as java用2進制
        System.out.println(0.7 + 0.8); //1.5
        //for java, you never use +/-/*// for double or float value
        //Soluation: BigDecimal.class
        
        



    }

    public static double  circleArea(double radius){
        //radius * radius * PI
        return Math.pow(radius,2.0) * Math.PI; //radius即次方
        //double * double -> problem?
    }

    public static int rectangleArea(int length, int width){
        return length * width;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE; //-21XXXXXX
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
        
        
    }




    public static int sum(int a, int b){
        return a + b; //return int value

    }
    public static String concat(String a, String b){
        return a.concat(b);
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() -1);
    }

    public static String substring(String s, int fromIndex, int toIndex){
        String s1= "";
        for (int i = fromIndex; i <= toIndex; i++) {
            s1 += s.charAt(i);
        }
        return s1;
    }

    //homework
    //public static 



    //not ok, duplicated method signature
   // public static long sum(int a, int b) {
   //     return a + b;
   //     
   // }

    //definitio of method signature: Method name + Input parameters ("sum(int a, int b)")
    public static int sum(int a, int b, int c) {
        return a + b + c;
        
    }
    //sys out is for terminal not for java  --can check from log
        //return is for java program -cannot check from log if u not set, 不會show過程
        //return is program result 
        
    //
}
