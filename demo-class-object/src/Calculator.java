



public class Calculator {

  private int x;
  private int y;


  //static method 與object無關 是掛在自己身上
  public static int sum(int x, int y){
    return x +y;

  }

  //set 不代表 最終x save的value
  public void setX(int x){
    this.x =x;
  }

  public void setY(int y){
    this.y =y;
  }

    public int sum2(int x, int y){
    return x +y;

    }

    //presentation of x and y
    public int sum3(){
      return this.x + this.y;
    }

  public static void main(String[] args) {
    //static method call: Class.methodName() //corect design
    System.out.println(Calculator.sum(1, 2));
    // Instance method call: (wrong design)
    Calculator c1 = new Calculator();
    
    System.out.println(c1.sum2(2,1));

    //instance method call: (correct design)
    Calculator c2 = new Calculator();
    c2.setX(2);
    c2.setY(1);


    System.out.println(c2.sum3());

    Calculator c3 = new  Calculator();
    Calculator c4 = new  Calculator();
    Calculator c5 = new  Calculator();
    c3.sum2(2, 1);
    c4.sum2(2, 1);
    c5.sum2(2, 1);
    System.out.println(c3.sum2(2, 1));//3 as 2+1




  }





  
}
