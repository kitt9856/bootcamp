



public class Ball2 {
  private Color2 color;
  private static final String BARND = "tesla";
  private int size;

  public Ball2( int size){
    this.size =size;
  }

  public void setColor2(Color2 color2){
    this.color = color2;
  }

  public int getSize(){
    return this.size;
  }

  public Color2 getColor2(){
    return this.color;
  }

 
 
  @Override
  public String toString(){
    return "Ball2=[" + this.color  //color要在inner class中override toString才可以不show hashcode
    +", size=" +this.size  ;
  }

  //local inner class
  public void printComma(){
    class Comma{
      private static final  String VALUE = ",";
    }
    System.out.println(Comma.VALUE);
  }  //output Comma class file中的attribute

  
  

    public class  Color2 {
    private String value;

    public Color2(String value){
      this.value =value;
    }
   
    public static String printBrand(){
      return  Ball2.BARND; //color2.printBrand()
    }

    public String toString(){
      return "color=[" + this.value + "]";
    }



    //cannot read the outer class's attribute value from inner class
  /* pulic String print(){
    return Ball2.BARND + "," + size;  //size是跟new ball so error
  } */



  }


  public static void main(String[] args) {
    Ball2 b1 = new Ball2(3); //不可以直接new e.g. new Ball2(3); =>wrong
    b1.setColor2(b1.new Color2("BLUE")); //assign Color2 attrib. into Ball2 reference 
    System.out.println(b1);

    Ball2.Color2 c2 = b1.new Color2("RED");
    System.out.println(c2);

    
    b1.printComma();

  }
  
}
