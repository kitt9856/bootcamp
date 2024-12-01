public class Bookrequest implements PersonAcount {

  private String name;

  private String CustomerAC;

  private boolean CanBook;

  private boolean ValidHKID;

  public Bookrequest(){

  }

  


  public Bookrequest(String name, String CustomerAC ){
    this.name =name;
    this.CustomerAC = CustomerAC;
  }

  public String getName(){
    return this.name;
  }

  public String getCustomerAC(){
    return this.CustomerAC;
  }



  @Override
  public void personID(boolean  y){
    if(!this.ValidHKID)
    this.ValidHKID = true;
  }

  @Override
  public void accountNum(){
    if(this.CustomerAC.length() == 8 && ValidHKID == true ){
      System.out.println("Valid Customer A/C");
      this.CanBook = true;
    }
  }

  //public String getCustomerAC(){
  //  return this.CustomerAC;
  //}


  @Override
  public String toString(){
    return "name:[" + this.name 
    + "] " + "A/C no.:[" + this.CustomerAC +"]";
  }
  
  public static void main(String[] args) {

    Bookrequest person1 = new Bookrequest("Peter", "12345678");
    System.out.println(person1);
    
  }

  
}
