public class PriorityClass extends AccountHolder {

  public PriorityClass(String firstName, String lasstName, double balance){
    super(firstName,lasstName,balance);
  }



    @Override
    String accountType() {
      return "P class";
    }


  
}
