public abstract  class Container {

  private String model;
  private Double capacity;
  private Color colour;
  
  public static  String[] getColorList(){
    return colour;
  }

  public void setModel( String model){
    this.model = model;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj) return true; // this = equals出來的value
    if(!(obj instanceof Container)) return false;

    Container container = (Container) obj; //原本是Object class ,現在硬改成Container class
    return obj;
  }

  

  public void setColorList(String color){
    String[] colorList = Color.getColorList();
  }



}
