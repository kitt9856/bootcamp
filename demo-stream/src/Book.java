public record  Book(String author,String title) {
  //record, for creating immutable object
  //1. no setter
  //2. all-arg constructor
  //3. getter
  //4. no empty constructor
  //5. Support toSting()
  //6. support equals()
  //7. support hashcode()
  //8. support instance method
  //9.
  //record run 時會在byte code's class file中 write getter...
  //但不可再set入去

  public int titleLength(){
    return this.title.length();
  }
  

  public static void main(String[] args) {
    Book book = new  Book("Jimmy Chan", "ABC");
    System.out.println(book.author); //getter
    System.out.println(book.title); //getter
    System.out.println(book.toString()); //不用自己寫
    Book book2 = new Book("Jimmy Chan", "ABC");
    System.out.println(book.equals(book2));
    System.out.println(book.hashCode() == book2.hashCode()); //true
  }



  
}
