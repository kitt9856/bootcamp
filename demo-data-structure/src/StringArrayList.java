public class StringArrayList {
  private String[] strings;

  public StringArrayList(){
    this.strings =new String[10]; //lenght = 0
  }

  public void add(String string){
    String[] newArray = new String[this.strings.length +1];
    for(int i = 0; i < this.strings.length; i++){
      newArray[i] = this.strings[i];
    }
    newArray[newArray.length - 1] = string;
    this.strings=newArray; //replace the whole array object
  }

  public void remove(String string){
    boolean hasRemoveItem =false;
    for

    //Early return
    if (!hasRemoveItem)
    return;

    String[] newArray = new String[this.strings.length +1];
    int skipCount = 0;
    int idx = 0;
    for(int i = 0; i < this.strings.length; i++){
      if (this.strings[i].equals(string) && skipCount == 0){
        skipCount++;
       // continue; //continue should放最頂 去skip下面的野
      }
      newArray[idx++] = this.strings[i]; //as不是數自已
    }
    this.strings =newArray; // ****** important
  }

  public int size(){
    return this.strings.length;
  }

  public static void main(String[] args) {
    StringArrayList arr = new StringArrayList();
    arr.add("hello");
    arr.add("abc");
    System.out.println(arr.size());//2

    arr.add("hello");
    arr.remove("hello");

    arr.remove("vincet");
    arr.size();

    System.out.println(System.currentTimeMillis());//timestamp
    long before =System.currentTimeMillis();
    int x = 0;
    for(int i = 0; i < 10_000_000; i++){
    //  x++;
    }
    long after = System.currentTimeMillis();
    System.out.println(after-before); //1千個loop = 4 ms


    //Integer, Boolean

    //e.g.
    List<Customer> customers =new A

    
  }
  
}
