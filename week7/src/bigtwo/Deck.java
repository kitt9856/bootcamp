package bigtwo;

import java.lang.*;



public class Deck implements CardOperations {
  private Card[] cards;


  public Deck(){
    this.cards = new Card[52]; //private中沒有index value so set this
    int idx = 0; //向前放
    //for each
    for(char suit: Card.SUITS ) //拿出來的是char suit value
                               {         //suit
      for(char rank: Card.RANKS ){ //rank
        this.cards[idx] = new Card(rank,suit);
        idx++;
        //如不想開一行idx++ 在this.cards[] idx++
        //if int idx = -1  should ++idx
      }
    }
  }

  @Override
  public String toString(){
    String value = "Deck[card:=";
    for (Card card : this.cards){
      value += card.toString() + ",";
    }
    value = value.substring(0, value.length() -1);//dele last ","  //return new string object
    value += "]";
    return value;
  }

  public int size(){
    return this.cards.length;  //encap.. replace pri attrid
  }


  //input and return
  //peter try index x switch with index y 
  //Instance method, deck object to contol this card[] object
  /**
   * 
   */
  public void shuffle(){
    //0-25 first half
    //26 - 51 second half
    int half = this.cards.length / 2; //array lenght = 26
    //Local variable
    Card[] newCards = new Card[this.cards.length];
    int idx = 0; // 因要追住i , i = 25時會爆 所以開idx
    for (int i = 0; i< this.cards.length; i++){
      newCards[idx++] = this.cards[i]; // 0 1 ...25
      newCards[idx++] = this.cards[i + half]; // 26 27....51
      
    }
    this.cards = newCards; // newCards 0,26,1,27,2,28,....25,51
  }
  @Override
  public void wash(){
    Deck freshDeck = new Deck();
    freshDeck.shuffle();
    this.cards = freshDeck.cards;
  }



  public static void main(String[] args) {
    char x = 3;
    System.out.println(x);
    Deck deck = new Deck(); //empty constructor -> 52 cards
    System.out.println(deck);

    System.out.println(deck.size());
    deck.shuffle();
    //System.out.println(deck);
    deck.wash();
    System.out.println("after wash: " + deck);
  }
  
}