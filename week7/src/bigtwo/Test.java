package bigtwo;

import java.awt.CardLayout;

public class Test {

  public static void main(String[] args) {
    Card c1 = new  Card('A', 'D');
    Card c2 = new Card('A', 'D');
    System.out.println(c1.equals(c2));

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
  }
  
}
