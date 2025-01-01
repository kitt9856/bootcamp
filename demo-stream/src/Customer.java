
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
  private Long id; //Object (Long), Primitive (long) //not all languse same primitive, so use object 
  private Boolean isVip;
  private List<Order> orders;

  public Customer(Long id, Boolean isVip){
    this.id = id;
    this.isVip= isVip;
    this.orders= new ArrayList<>();
  }

  public long getId(){
    return this.id;
  }
  

  public Boolean isVip(){
    return this.isVip;
  }

  public void addOrder(Order order){
    this.orders.add(order);
  }



  public  void updateOrder(Long orderId, Double newAmount){
    //don't use for-each add/remove/modify the object/object value
    for (int i =0; i < this.orders.size();i++){  //if use for each to add how end??
      if (this.orders.get(i).getId() == orderId){
        this.orders.get(i).setTotalAmount(newAmount);;
      }
    }
  }

  

  public List<Order>  getOrders(){
    return this.orders;
  }

  @Override
  public String toString(){
    return "Customer[" +"id=" + this.id
    + ",is Vip=" + this.isVip
    + ",orders=" +this.orders + "]" ;
  }



  public static void main(String[] args) {
    //Customer1
    //1.order(1L,100.0)
    //2.order(2L,95.0)
    //3.order(3L,20.0)
    Customer c1 = new Customer(1L, true);
    c1.addOrder(new Order(1L, 100.0));
    c1.addOrder(new Order(2L,95.0));
    c1.addOrder(new Order(3L,20.0));

 //Customer2
    //1.order(4L,100.0)
    //2.order(5L,89.0)
    //3.order(6L,5.0)

    Customer c2 = new Customer(2L, false);
    c2.addOrder(new Order(4L,100.0));
    c2.addOrder(new Order(5L,89.0));
    c2.addOrder(new Order(6L,5.0));

    System.out.println(c1);
    

    List<Customer> customers = new ArrayList<>(); //java.lang.unsupported if no reference 
    customers.add(c1);
    customers.add(c2);

    //stream
    //based on customer list, find the customers with any order amount > 800.0
    List<Customer> customers2 = customers.stream()
    .filter(c -> {
      for(Order o : c.getOrders()){
        if(o.getTotalAmount() >= 800.0)
         return true;
      }
      return false;
    }).collect(Collectors.toList());
    System.out.println(customers2);
    

    //Create a new Class VipCustomer (id,orders)
    //Return List<VipCustomer>
    //Filter List<Customer> to find vip customer
    List<VipCustomer> vipCustomers= customers.stream()
    .filter(c -> c.isVip())    //stream<Customer>'s isVIP() //customers 入了 Customer class so steam<customer>
    .map(c -> {
      VipCustomer vCustomer = new VipCustomer(c.getId());
    for (Order order: c.getOrders()){
        // vCustomer.addOrder(order); //before fix
      vCustomer.addOrder(new Order(order.getId(), order.getTotalAmount()));
    }
    //return VipCustomer; //impact vipcustoner
    return vCustomer;
    }).collect(Collectors.toList());
    System.out.println(vipCustomers);

    //stream only open new list and change self to an object


    //Question: update order detail in customer list, any impact to VipCustomer List
    //customers
    customers.get(0).getOrders().get(0).setTotalAmount(999.0);  //int -> double 但不可轉2次
    //vipcustomer is impacted
    System.out.println(customers);

    System.out.println(vipCustomers); // ?! being impacted





    
    

  }
  
}
