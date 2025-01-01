
import java.util.ArrayList;
import java.util.List;

public class VipCustomer {
  private Long id;
  private List<Order> orders;

  public VipCustomer(Long id){
    this.id =id;
    this.orders = new ArrayList<>();
  }

  public long getId(){
    return this.id;
  }

  public VipCustomer(Long id, List<Order> orders){
    this.id =id;
    this.orders = new ArrayList<>();
  }

  public void addOrder(Order orders){
    this.orders.add(orders);
  }

  public List<Order> getOrders(){
    return this.orders;
  }

  @Override
  public String toString(){
    return  "VipCustomer[" + "id=" + this.id + ", orders=" + this.orders + "]";
  }

  
}
