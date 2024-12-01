public class Electronics extends Product {

  private int warrantyPeriod;

  //constructor -> new 隻object既方法->所以方法可以有好多
  public Electronics(String name, double price, int warrantyPeriod){
    super(name, price); //用parnet class's constructor
    this.warrantyPeriod =warrantyPeriod;
  }

  @Override//比compiler知，重新定義呢個method點用
  public String getProductType() {//如{}empty會紅線 //因parent有所以子一定要有
    return "Electronics";
  } //extends used to Inheritance with abstract

  public void  setWarrantyPeriod(int warrantyPeriod){
    this.warrantyPeriod = warrantyPeriod;
  }

  @Override
  public String toString(){
    return "name:" + this.price() + warrantyPeriod;
  }
  
}
