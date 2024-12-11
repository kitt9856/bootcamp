public enum Direction {
  EAST(1),
  SOUTH(2),
  WEST(-1),
  NORTH(-2),
  ;

  private int value;

  private Direction(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }



  public boolean  oppsite(Direction direction){
    return this.value * -1 == direction.getValue();
    }
  



  public static void main(String[] args) {
    System.out.println(Direction.WEST.oppsite(Direction.EAST));
    System.out.println(Direction.WEST.oppsite(Direction.NORTH));
    System.out.println(Direction.NORTH.oppsite(Direction.NORTH));
    System.out.println(Direction.NORTH.oppsite(Direction.SOUTH));



  }




}

