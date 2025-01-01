public class Box<T> {
  private T value; //null

  public static <T> Box<T> empty(){
    return  new Box(null);
  }
  
  public Box(T value){
    this.value =value;
  }

  public static void main(String[] args) {
    Box<String> box = Box.empty();
  }
}
