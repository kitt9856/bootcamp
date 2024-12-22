public class NumberPrinter<T extends Number> {//<>描述緊T的野 //extends abstract class
  private T value;

  public NumberPrinter(){

  }

  public NumberPrinter(T value){
    this.value=value;
  }

  public void setValue(T value){
    this.value = value;
  }



  public static void main(String[] args) {
   // NumberPrinter<String> printer = new NumberPrinter<>();
   NumberPrinter<Long> Longprinter = new NumberPrinter<>(); //要是XX的仔
   NumberPrinter<Short> Shortprinter = new NumberPrinter<>(); 


  }



  
}
