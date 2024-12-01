package bigtwo;

//what is Enum?

//1. Each Constant is asingleton
//2. fixed set of constants
//3. Custom Properties and Methods
//4. Type-Safe (no need equals and hashcode
//5.enum constructor private by default)

//uniqe左 所以是一樣地址

import com.sun.tools.javac.Main;

//java auto make it is a unique Object .e.g. Math.PI "PI" is eunm
public enum Direction {
  //private String[] directions = {"east","south"};
EAST(1, "TEST1"),
SOUTH(2, "TEST2"),
WEST(-1, "TEST3"),
NOUTH(-2, "TEST4"),
;

  private int direction;
  private String testAttribute;

  //why not public? Illegal modifier for the enum constructor; only private is permitted.// enum不會開比人用因自己會做晒
  private   Direction(int i){
    this.direction = i;
  }


  private Direction(int i, String testAttribute){
    this.direction = i;
    this.testAttribute = testAttribute;
  }

  public String getTestAttribute(){
    return this.testAttribute;
  }

  public int getDirection(){
    return this.direction;
  }

  public boolean  isOpposite(Direction inputParam){
    return this.getDirection()* inputParam.getDirection() == -1;

  }

  public String getDirectionDetails(Direction direction){
    if(direction == null)
      return "Invalid Value";

    for (Direction dir : Direction.values()){
      if (dir == direction){
        return String.format("Direction: %s, Value: %d, Attributes: %s",//
         dir.name(),dir.getDirection(),dir.getTestAttribute());
      }
      return "Direction not found"; 
    }
  }


 public static void main(String[] args) {
  System.out.println(Direction.EAST.isOpposite(Direction.EAST)); //EAST as object
  System.out.println(Direction.EAST.isOpposite(Direction.NOUTH));

  System.out.println(Direction.EAST.getTestAttribute());
  System.out.println(Direction.SOUTH.getTestAttribute());
  System.out.println(Direction.WEST.getTestAttribute());
  System.out.println(Direction.NOUTH.getTestAttribute());

  System.out.println(Direction.EAST.getDirection());
  System.out.println(Direction.SOUTH.getDirection());
  System.out.println(Direction.WEST.getDirection());
  System.out.println(Direction.NOUTH.getDirection());

  System.out.println(Direction.EAST == Direction.EAST);

  System.out.println(
    Direction.EAST.getDirection() == Direction.WEST.getDirection()
  );

  System.out.println(
    Direction.EAST.getTestAttribute() == Direction.WEST.getTestAttribute()
  );

  System.out.println(Direction.EAST.getTestAttribute().equals(Direction.WEST.getTestAttribute()));



  //Direction dir: Direction.valueOf()){  //.valueOf output array
   

  
 }  
  
}
