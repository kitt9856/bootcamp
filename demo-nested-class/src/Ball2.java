
import Ball2.Color2;
import java.awt.Color;

public class Ball2 {
  private Color2 color;
  private static final String BARND = "tesla";
  private int size;

  public Ball2( int size){
    this.size =size;
  }

  public void setColor2(String color){
    this.color = color;
  }

  //local inner class
  public void printComma(){
  
    class Comma{
      private static final  String VALUE = ",";
    }
    System.out.println(Comma.VALUE);
  }

  

    public class  Color2 {
    private String value;

    public Color2(String value){
      this.value =value;
    }
   
    public static String printBrand(){
      return  Ball2.BARND;
    }



    //cannot read the outer class's attr
  /* pulic String print(){
    return Ball2.BARND + "," + size;  //size是跟new ball so error
  } */



  }


  public static void main(String[] args) {
    Ball2 b1 = new Ball2(Color2.BLUE,3); //不可以直接new
    Ball2.Color2 c2 = b1.Color2("BLUE");

    Ball2.Color2 c2 = b1.new Color2("RED");
    b1.printComma();

  }
  
}
