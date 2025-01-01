

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ball {
  private int size;
  private Color color;

  public Ball(int size,Color color){
    this.size =size;
    this.color = color;
  }

  public int getSize(){
    return this.size;
  }

  public Color getColor(){
    return this.color;
  }


  @Override
  public String toString(){
    return "Ball["
    +"size=" + this.size 
    + "color=" + this.color.name() + "]";
  }


  public static enum Color{
    Black,WHITE,;
  }


  public static void main(String[] args) {
    List<Ball> balls = Arrays.asList(new Ball(10, Color.Black),
    new Ball(7, Color.WHITE));

    //Stream Java8 (for loop + if)
    //example 1
    //size > 8, and Black
    List<Ball> result = balls.stream().filter(b -> b.getColor() == Color.Black && b.getSize() >8)
    .collect(Collectors.toList());  //lambda not boolean
    System.out.println(result);

    //可以balls =balls.stream().... 但平常不會這樣做

    //for each
    List<Ball> result2 = new ArrayList<>();
    for(Ball ball : balls){
      if(ball.getColor()== Color.Black && ball.getSize() >15){
        result2.add(ball);
      }
    }
    System.out.println(result2);

   // List<Ball> ballA = balls.stream()
   // .filter(balls -> this.getSize > 8 && this.getColor == java.awt.Color.BLACK)
   // .collect(Collectors.toList());

    //example 2: Stream.map() (Change the object type)
    List<Integer> result3 = balls.stream()
    .filter(b -> b.getColor() == Color.Black ) //stream<Ball>
    .map(b -> b.getSize())    //已經是Stream<Integer>
    .collect(Collectors.toList());  //List<Integer>   //當中只是new XX
    System.out.println(result3); //[10,20]

    //Example 3: More than on filter
    List<Integer> result4 = balls.stream()
    .filter(b -> b.getColor() == Color.Black ) //stream<Ball>
    .map(b -> b.getSize())    //已經是Stream<Integer>
    .filter(i -> i>15)
    .collect(Collectors.toList());  //List<Integer>   //當中只是new XX
    System.out.println(result4);

    //example4 :construct to another List of object
    List<Ball> result5 = balls.stream()
    .filter(b -> b.getColor() == Color.Black ) //stream<Ball>
    .map(b -> b.getSize())    //已經是Stream<Integer>
    .filter(i -> i>15)  //Stream<Integer>
    .map(i -> new Ball(i, Color.WHITE)) //Stream<Ball>
    .collect(Collectors.toList());  //List<Ball>   
    System.out.println(result5); 
  }
  
}
