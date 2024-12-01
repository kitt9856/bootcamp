public abstract  class Product {//product 是抽象的名詞，所以用abstract class 形容->無得new Product()
  private String name;
  private double price; //Encapsulation

  public String name(){
    return this.name; //this mean call the object
    //instance method, this 代表call呢個method 個隻object
  }

  public Product(String name, double price){
    this.name =name;
    this.price = price;
  }
  
  public double price(){
    return this.price;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setPrice(double  price){
    this.price = price;
  }


  //abstract method
  public abstract String getProductType();

  public String toString(){
    return "name:" + this.name + this.price;
  }




}
