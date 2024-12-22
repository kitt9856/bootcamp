public class CharSequencePrinter <T extends CharSequence> { //extend Interface, 不可寫implement
  private T value;

  public static void main(String[] args) {
    CharSequence cs1 = new String("hello");
    CharSequence cs2 = new StringBuilder("hello");

    CharSequencePrinter<String> stringPrinter = new  CharSequencePrinter<>();
    CharSequencePrinter<StringBuilder> stringBuilderPrinter = new  CharSequencePrinter<>();


  }
  
}
