public class Printer<T> {
  private T value;

  public Printer(T value){
    this.value=value;
  }

  public void print(){
    System.out.println(this.value);
  }

  //<K extends Animal> is to describe the range of "Zoo<T>"
  

  public static void main(String[] args) {
    Printer<String> stringPrinter = new Printer<>("hello");
    stringPrinter.print();

    Printer<Integer> integerPrinter = new Printer<>(10); //多用途printer integerPrinter只可用Integer 即<Integer>= IntegerPrinter.java
    //不用再開IntegerPrinter 在complie time do it,但需要鎖定<Integer>不能再用string
    integerPrinter.print();
    //integerPrinter.setValue("abc")
    integerPrinter.print();

    //Generics does not support primitives
    //Printer<int> intOrinter = new Printer<>();
  }
  
}
