
import java.math.BigDecimal;

public abstract class AccountHolder {
  private Long acccountNumber; //encapsulation
  private String firstName;
  private String lastName;
  private double  balance;

  public AccountHolder(String firstName, String lastName, double balance){
   // this.acccountNumber = acccountNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }


  public Long getAccountNumber(){
    return this.acccountNumber;
  }

  abstract String accountType();

  public String getFirstName(){

    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getFullName(){
    return this.firstName.concat("").concat(this.lastNam);
  }

  public Double getBalance(){
    return this.getBalance();
  }

  public void creditAccount(double amount){
    this.balance = BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue();

  }

  public boolean debitAccount(double amount){
      if(amount > 0 ){

      }
  }


}
