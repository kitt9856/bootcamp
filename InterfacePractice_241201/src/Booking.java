
import java.util.Arrays;

public class Booking extends Bookrequest implements SystemOperation {

  private int aDayLimit = 10;

  private static final int TotalLimit = 10;

  public Bookrequest[] BookList;

// private  int count;

 Bookrequest backupForCancel;

 private int countTotal;

 
  public Booking() {
     // super(name, CustomerID);
      
      this.BookList = new Bookrequest[TotalLimit];
     // this.aDayLimit -= 1;
     // System.out.println("Today accept " + this.aDayLimit + " quotaes");

      
  }

  

  public void  addNewBook(Bookrequest CustomerAC){
    Bookrequest[] newBook = Arrays.copyOf(BookList, BookList.length + 1);
      if(newBook[countTotal]==(null)){
        newBook[countTotal++] = CustomerAC;
        this.BookList = newBook;
        this.aDayLimit =  countTotal;
    } 
  }

  public int getADayLimit() {
      return this.aDayLimit;
  }

  //public int getRoundLimit() {
  //    return this.RoundLimit;
  //}

  public Bookrequest[] getBookList(){
    return this.BookList;
  }

  @Override
  public void cancelBook(Bookrequest CustomerAC){
    for(int i =0; i < this.BookList.length -1 ; i++){
      if(CustomerAC.equals(this.BookList[i])){
        for (int j = i; j < this.BookList.length-1; j++){
        backupForCancel = this.BookList[j+1];
        this.BookList[j] = this.BookList[j+1];
        this.BookList[j+1] = backupForCancel;
        }
        this.BookList[this.BookList.length -1] = null;
        this.countTotal--;
        return;
      }
    }
  }

  @Override
  public String toString(){
    return "there is " + this.getADayLimit() + " quota booked and " + "List:" + Arrays.toString(this.getBookList());
  }

  public static void main(String[] args) {
    Bookrequest person1 = new Bookrequest("peter", "12345678");
    System.out.println(person1);
    System.out.println(person1.getCustomerAC());
    String x = person1.getCustomerAC();

    Booking booking1 = new Booking();
    booking1.addNewBook(person1);
    System.out.println(booking1);

    Bookrequest person2 = new Bookrequest("Ho","123");
    booking1.addNewBook(person2);
    System.out.println(booking1);
    booking1.cancelBook(person2);
    System.out.println(person1);
    booking1.addNewBook(person2);
    System.out.println(booking1);

     

  }

}
