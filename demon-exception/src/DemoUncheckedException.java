import java.util.EmptyStackException;
import java.util.Stack;

public class DemoUncheckedException {
  
    public static void main(String[] args) {
      int y= 0;
      //int x = 10 / y;  //java.lang.arrayindexOutOfBound
      //for length 3

      //System.out.println(Integer.valueOf("abc")); //java.lang.NumberFormat
      //"abc"

      //concat(null,"abc");


      int count = 0;
      //Solition:try-catch  //如有危險 請java...
      try{
        System.out.println("abc"); //print
        
        //int p =10/0; //有危險 下面的code也會skip //error, go to print hello
        int p =10/count;
        System.out.println("wold"); //skipped

      }catch(ArithmeticException e){
        System.out.println("hello"); //then print this
      }

      String input = "123a";// this is an unknown user input
      try{
        int j= Integer.valueOf(input);
      } catch (NumberFormatException e){
        System.out.println(input + " is not..");
      }

      //we should not use try-catch for some Exceptions
      //e.g. 1)array index outbound, 2) null pointer exception

      int[] arr2 = new int[4];
      //should not
      int idx = 4;
      try{
        arr2[idx] = 100;
      } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("index of array should be >= 0 and < array length.");
      }

      //should  (直接在寫code時解決)
        if(idx >= 0 && idx < arr2.length){
        arr2[idx]=100;
      }
      



      String s = null;
      //should not
      try{
        int length = s.length();
      }catch(NullPointerException e){
        System.out.println("s should not be null");
      }

      //Should -> avoid
      int length = s != null ? s.length():0;

      //throw (similar to turn, but "throw" is for exception object)
      try{
        concat(null, "abc");  //消化這炸彈   
      }catch (IllegalArgumentException e){
        //can empty
      }

      //pop() method throw runtime exception if stack is empty      
      Stack<String> stack1 = new Stack<>();
      //stack1.pop(); //pop a empty will error (see pop() decribe)
      try {
         String s7 =  stack1.pop();
         s7.charAt(10);
      } catch (EmptyStackException e) { //只會中一個catch

      } catch(ArrayIndexOutOfBoundsException e){

      }

      //Custom Exception
      //during compile time, compiler doesn't know the parameter 


      //throw ->Exceltion class object
      public static  String concat(String s1, String s2){ //Argument = Parameter
        if(s1 == null){
          throw new IllegalArgumentException(); //throw = 出error的return
        }
        return s1.concat(s2);
      }

      //finally
      int y2=0;
     try{
      int answer = 10/y2;//happy/unhappy
      //happy
     } catch (ArithmeticException e){
      //unhappy
     } finally {
      //hapy/unhappy
      System.out.println("end");
    
     }

    // System.out.println("end");
    

     

    }
     //throw Business Exception
     public static int calculate(int x, int y){
      if(x < 0 || y < 0)
        throw new BusinessException(); //throwed still error
      return x + y;
    }
    //對方是否可以handle到try catch出咩

    //catch() 中只可or  = |

    

    //天然事件?
}
