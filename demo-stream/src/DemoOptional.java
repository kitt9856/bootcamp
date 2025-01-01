
import java.util.Optional;

public class DemoOptional {
  
  //1. Optional<T> MUST be used in return type for method.
  //2. Optional<T> MUST NOT be used in parameter.
  //3. Optional<T> MUST NOT be used in Class Attribute Type. //not all database support Optional or <>

  public static class Person{
    private Optional<String> emailAddress;

    public void setEmailAddress(String emailAddress){
       this.emailAddress= Optional.ofNullable(emailAddress);       //of()不可入null
       
    }
  }

  public static void main(String[] args) {

    //scemario 1 (without optional)
    String result = concat(null, "hello");
   // if (result.length() > 0)
   // System.out.println("successful");
    
  //Scenario 2 (with Optional)
    String x = "abc";
    Optional<String> ss = concat2(x, "hello");
    if(ss.isPresent()){ //optional's method
      System.out.println(ss.get().length()); //入面不是null so 100% safe
    } else {
      System.out.println("i hnow it is a null value.. Do anything");
    }

    //Not good for method user to convert the parameter value before passing to the method.
  //concat3("abc","def");

  //Some other ways to resolve optional object
  //1. isPresent() -> get()  拆盒
  //2. ifOresent() 
   ss.ifPresent(s-> System.out.println(s.length()));
   //3. orElse()
   String afterUnbox = ss.orElse("default");
   System.out.println(afterUnbox); //有野就不會行去null
   //4. orElseGet()
   String afterUnbox2 = ss.orElseGet(()-> "default"); //supplier
   System.out.println(afterUnbox2);
   //5. orElseThrow()
   String afterUnbox3 = concat2("abc", "def").orElseThrow(() -> new IllegalArgumentException()); //implicly concat2 is Optional Object if other people use
   System.out.println(afterUnbox3); 
  
  }


  

  //Acceptable design: return null or throw exception
  public static String concat(String x, String y){
    if (x == null)
      //throw new IllegalArgumentException();
      return null;
    return x.concat(y);
  }

  public static Optional<String> concat2(String x, String y){
    if (x == null)
      return Optional.empty();
    return Optional.of(x.concat(y)); //if 明知會有null就Optional.of() ,if肯定不會有null 用.of就得
  }

  //Optional good at apply return type

  //Wrong design 
  //hard to use for user(teamate)
  public static String concat2(Optional<String>x,Optional<String>y){
    if (x ==null || !x.isPresent()||!y.isPresent()){
      return null;
    }
    return x.get().concat(y.get());
  }

}
