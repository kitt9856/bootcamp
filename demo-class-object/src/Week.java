public class Week {
  private static int counter = 0;
  private int number;

  public static final int No_OF_DAYS =test();
  public static final int No_OF_HOURS =test2();

  public static final int WEEK_OF_HOURS;

  public Week(){
    System.out.println("Creating week project");
  }

    //Initializer block
    //everytime you create a new week object, initializer block go first before constrictor.
    {
      System.out.println("Initializer block");
      //able to control object, so we can use "this" here...
    this.number = ++counter; //as not static so can use this.

    }



  //static block go first ? or static method?
  static { //same  public static final int No_OF_DAYS = 7;
   // No_OF_DAYS = 7;
   System.out.println("Static blocl..");
    WEEK_OF_HOURS = No_OF_DAYS * No_OF_HOURS;
   
  }

  public static int test(){
   System.out.println("Static method block test1..");

    return 7;
  }

  public static int test2(){
    System.out.println("Static method blocktest2..");
 
     return 24;
   }

   public int getNumber(){
    return this.number;
   }


  public static void main(String[] args) {
    //Static method block..
    //Static blocl..
    System.out.println(Week.No_OF_DAYS); //7
    System.out.println(Week.WEEK_OF_HOURS); //168 //so static block is last to run

    Week w1 =new  Week();
    Week w2 =new  Week();
    /* Initializer block
Creating week project
Initializer block
Creating week project */


  }
  
}
