package linkedlist;

public class LInkedList1 {
  private Node head;
 // private Node last; //Real LinkedList

  public void add(String newValue){
    if(this.head == null){
      this.head = new Node(newValue);  //Node class -- public String value = newValue;
      return; 
      //if no use return here 
      //sysout will add newValue 2time total =>LinkedList1[abc,abc,def]
      
    }

    Node tail = this.head;
    while (tail.next != null){ //Node class -- public Node next = null?
      tail = tail.next; //tail自己變成next value
    }
    tail.next = new Node(newValue); //tail的next value -> newValue
  }

  //0(1) - no loop
  public void removeFirst(){
    this.head = this.head.next;
  }

  // 0(n) - real linkedList -> 0(1)
  public void removeLast(){
    Node tail = this.head; //backup head address
    Node prev = null;
    while(tail != null){
      if(tail.next == null){ //tail definition
        prev.next =null;
        return;
      }
      //自已是tail向前
      prev = tail;
      tail = tail.next;

    }
  }

  public void remove(String s){
    Node current = this.head;
    Node prev = null;
    while (current != null){
      if(current.value.equals(s)){
        if(prev != null){
          prev.next = current.next;
        }else{
          this.head = current.next;
        }
        return;
      }
      prev = current;
      current = current.next;
    }
  }

  public String toString(){
    Node tail = this.head;  //this.head is String
    String str = "LinkedList1[";
    while (tail !=null){
      str += tail.value + ",";
      tail = tail.next;
    }
    str = str.substring(0,str.length() -1) + "]";
    return str;

  }

  public static void main(String[] args) {
    LInkedList1 ll = new LInkedList1();
    ll.add("abc");
    ll.add("def");
    System.out.println(ll);
    ll.add("ijk");
    System.out.println(ll);
    ll.remove("abc");
    System.out.println(ll);
    ll.removeLast();
    System.out.println(ll);

    
  }
  
}
