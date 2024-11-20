
import java.math.BigDecimal;

//BigDeciam didn't "final", so we can "extend"
//once you "final" the class, no other class can extends this class anymore
public class SuperDecimal extends BigDecimal { //bigdecimal 一定要放parm so here no empty constructor

  public SuperDecimal(double value){
    supper(value);
  }

  @Override
  public long longValue(){ //longValue no set final, so can overide
    return 10L;
  }

  @Override
  public int intValue(){
    //super.doubleValue() -> In the current object, "supper" keyword to find parent object
    //super.doubleValue() -> 3.3 -> ceil -> 4.0 -> (int)->4
    return (int) Math.ceil(supper.doubleValue());
  }

  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal(3.3);
    System.out.println(bd1.longValue()); //3
    SuperDecimal sd1 = new SuperDecimal(3.3);
    System.out.println(sd1.longValue()); //10
    System.out.println(sd1.intValue());//4
  }
  
}
