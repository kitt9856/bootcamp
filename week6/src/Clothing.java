public class Clothing extends Product {

  private String size;
  private String material;

  public Clothing(String name, double price, String category, String subCategory
          String size, String material){
    super(name, price);
    this.size = size;
    this.material = material;
  }

    public void setSize(String size){
      this.size = size;
    }

    public void setMaterial(String material){
      this.material = material;
    }

    @Override
    public String getProductType(){
      return "Clothing";
    }

    @Override
    public String toString(){
      return "name: " + this.name() + this.size + this.material;
    }



  
}
