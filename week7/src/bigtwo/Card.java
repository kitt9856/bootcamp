package bigtwo;

import java.lang.*;
import java.util.Objects;

//*****  for custom class, always override toString(), equals(), hashCode()
public class Card  {

    //public static final char[] SUITS = new char[]{'D', 'C', 'H', 'S'};
    public static final char[] SUITS = new char[] {'♠', '♡', '♢', '♣'};
    public static final char[] RANKS = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};// char '10'???

    private char rank; //13
    private char suit; //4

    public Card(char rank, char suit){
        this.rank = rank;
        this.suit = suit;
    }

    public char getRank() {
        return this.rank;
    }

    public char getSuit() {
        return this.suit;
    }

    

    public void setRank(char rank){
        this.rank =rank;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) { //instance check of class
            return false;
        }
        Card card = (Card) obj; //obj is instanceof Card
        return Objects.equals(card.getRank(), this.rank)
                && Objects.equals(card.getSuit(), this.suit);
    }

    /* @Override
    public String toString(){
      return "Card[" 
      + "rank= " + this.rank
      + ", suit= " + this.suit
      + "]"; 
    } */

    @Override
    public String toString(){
      return "Card[" 
      +  this.suit
      + this.rank
      + "]"; 
    } 

    //hashcode() should be paired with equals()
    //hashCode(), by default, Oject.hashCode() returns an int value representing the object reference
    @Override  //equals override完 要再寫hashcode
    public int hashCode() {
        return Objects.hash(this.rank, this.suit);
    }

    public static void main(String[] args) {
        Card x = new Card('D', '4');
        System.out.println(x);
    }

}
