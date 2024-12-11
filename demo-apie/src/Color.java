public enum Color { //company has many CEO??? so java have enum to solve
  RED('R'), //
  YELLOW('Y'), //
  BLACK('B'),//
  ;

  //Usually we use final for enum 
  private final  char value; //enum always final e.g. color -> set to change?
  

  //enum has constructor //if carry value
  //For enum, you can use "private" for constructor
  private Color(char value){
    this.value = value;
  }

  public char getValue(){
    return this.value;
  }

  //techincal can set setter 
  //public void  setValue(char value){
  //  this.value = value;
  //}

  // ! Everytime you press the "Run" button
  //1. Load the classes to the memory 
  // -(For enum, JVM will help create an unique object(s) before executing the main method)
  // -In memory, there are only 3 color objects. RED,YELLOW and BLACK
  // enum example, 幣種

  public static void main(String[] args) {
    String red1 = "RED";
    String red2 = "red";
    String red3 = "Red";
    String red4 =  new String("RED");
  

    System.out.println(red1.equals(red3));
    System.out.println(red1.equals(red4)); //equals是String寫出來 //true, as override object.equals()
    System.out.println(red1 ==red4);//false
    //String.class extends Object.class
    //what if string.class did not override eqauls()? ->Object.class

    //Never to create enum object by yourself --自已已經new左 so no need new
    //new Color()
    Color red10 = Color.RED;
    Color red11 = Color.RED;
    System.out.println(red10 == red11); //true ==check address, 地址一樣 值也一定一樣

    if(red11 == Color.BLACK){ // we always use "==" to compare enum value
      System.out.println("its black");
    }else{
      System.out.println("it is not black");
    }

    //normally we don't use equals() for enum
    if(red11.equals(Color.RED)){
      System.out.println("Its Red");
    }

    System.out.println(red11.getValue()); //R
    System.out.println(Color.YELLOW.getValue()); //Y

    Color.BLACK.setValue('A');
    System.out.println(Color.BLACK.getValue());//A


  }
  
}
