public class StringLinkedList { //StringArrayList.java's old ver.

  private String value; 
  private StringLinkedList next; //storing next object address
 // private StringLinkedList prev; //Original LinkedList //real linkedlist code

  public StringLinkedList(String value){
    this.value = value;
  }

  public StringLinkedList(StringLinkedList next){
    this.next =next;
  }

  public void next(StringLinkedList next){
    this.next = next;
  }

  //head.add("abc");
  //head.add("def");
  //先找head的尾
  public void add(String value){
    //find tail
    StringLinkedList tail = this;
    while (tail.next != null){
      tail = tail.next;
    }

    tail.next = new StringLinkedList(value); //自已new object
  }

  public void remove(String s){
    StringLinkedList head = this; //抄底head 地址
    StringLinkedList prev = null; 
    while (head != null){
      if(head.value.equals(s)){
        if(prev != null){
          prev.next = head.next; //1->3  下一粒勾去上一粒
        } else {
          this.next = head.next; //2 ->3
          //this不可直接=(be assign) this不可換其他
        }
        return; //head.value.eq s 就收工
      }
      prev = head;
      head = head.next;
    }
  }

  public String toString(){
    StringLinkedList head = this; //利用StringLinkedList指針
    String str = "StringLinkedList[";
    while (head != null){
      str += head.value + ",";
      head = head.next;
    }
    str = str.substring(0, str.length()-1) + "]"; 
    return str;
  }


  public static void main(String[] args) {
    StringLinkedList strings = new StringLinkedList("abc"); //object1
   // strings.next(new StringLinkedList("def"));

    strings.add("def");
    strings.add("ijk");
    System.out.println(strings);
    


    //object reference -> strings -> object1 ()
    //if want remove def, cut def's object next
    

  }
  
}
