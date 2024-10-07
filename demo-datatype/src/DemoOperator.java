public class DemoOperator {
  public static void main(String[] args) {
    // "!=" -> check if not equals to
    boolean result = 3 !=2; //3 !=2 is a statement
    System.out.println(result);//true

    // "==" -> check if equals to 
    //"=" -> assignment
    boolean result2 = 3 == 2;
    System.out.println(result2); //false

    // || or, && and
    // event A or event B 
    // event A and event B

    boolean eventA = 3 < 2; // false
    boolean eventB = 10 % 2 == 0; //10是否雙數 // ture

    boolean combine = eventA && eventB;
    System.out.println(combine); //false

    combine = eventA || eventB;
    System.out.println(combine); //true

    System.out.println(3 < 2 || 10 % 2 == 0); //true 3>2 is a event, 10 % 2 == 0 is another event

    // ==, !=, >=, <=, >, <, comparison _> event result

    // !eventA -> check if eventA = true  ,machine laugue mean !eventA -> opposite of eventA
    System.out.println(!eventA); //true 

    int age = 18;
    if (age >= 18) {
      System.out.println("Adult."); // will print
    }else {
      System.out.println("Not Adult");
    }

    char gender = 'M';
   // if(!(age >= 18 && gender == 'M')){
   //   System.out.println("Not Male Adult");  //邏輯清析時可用，
   // }
   boolean isAdult = age >= 18;
   boolean isMale = gender == 'M';
   if (!(isAdult && isMale)) {            //只用and時可以用!,但多種運算不建議用
    System.out.println("not male adult");
   }


  }
  
}
