
import java.awt.Color;
import javax.swing.text.PlainDocument;

public class Projector extends Machine {

  private double size;

  public Projector(double size){ //included supper();
    this.size = size;
    //super(); //紅線 因放了在後面
   }
   
   public Projector(double size,String color){
    supper(color);
    this.size = size;
   }
  
  @Override //extend後要重寫so override
  public void  start(){
    System.out.println("Projector is starting...");
  }

  @Override // 有Start 後要有stop 否則紅線
  public void  stop(){
    System.out.println("Projector is stoping...");
  }

  @Override
  public String getColor(){
    return "Orange";
  }

  public static void main(String[] args) {
    Projector p1 = new Projector(3.4);
    System.out.println(p1.getColor()); //black

    Projector p2 = new Projector(3.4,"RED");
    System.out.println(p2.getColor());



  }


}
