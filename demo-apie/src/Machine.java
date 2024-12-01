public abstract  class Machine  {
  private String color;
  //abstract method implicitly public
 abstract void start();
 abstract void stop();  

 public Machine(){
  super();
  this.color = "BLACK"; //if use construnctor ,but it must color = black
 }

 public Machine(String color){
    this.color =color;
 }

 public  String getColor(){
  return this.color;
 }


 //final method cannot be override by child class
 //projector.class can access abc() method, but it cannot overide it
 public final int abc(){
  return 3;
 }


 //no seter that mean u only use color black
// public void setColor(String color){
//  this.color = color;
// }

  
}
