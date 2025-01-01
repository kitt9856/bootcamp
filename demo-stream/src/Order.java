public class Order {
  private Long id;
  private Double totalAmount;

  public Order(Long id, Double totalAmount){
    this.id=id;
    this.totalAmount=totalAmount;
  }

  public void setTotalAmount(Double totalAmount){
    this.totalAmount = totalAmount;
  }

  public double getTotalAmount(){
    return this.totalAmount;
  }             //return may primitive

  public Long getId(){
    return this.id;
  }


  
  @Override
  public String toString(){
    return "Order[" +"id=" 
    + this.id 
    + ",totalAmount=" + this.totalAmount + "]";
  }
}
