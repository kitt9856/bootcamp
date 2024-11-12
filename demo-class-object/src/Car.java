public class Car {
  private double speed;

  //Instance method
  public void accelarate(){ //不一定要setter
    this.speed += 10;//踩油就加speed
  }

  public double getSpeed(){
    return this.speed;
  }

  public static void main(String[] args) {
    Car c = new Car();
    c.accelarate(); //踩油
    c.accelarate();


    
  }

  
  
}
