public class StringArrayList {
  private String[] strings; //linkedlist appear

  public StringArrayList(){
    this.strings =new String[0]; //lenght = 0
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
    boolean hasRemoveItem =false;  //check是否真係有要刪的東西
    for(int i = 0; i < this.strings.length;i++){
      if(this.strings[i].equals(string)){
        hasRemoveItem = true;
        break;
      }
    }
    //Early return
    if (!hasRemoveItem) //無就走
       return;

    String[] newArray = new String[this.strings.length +1];
    int skipCount = 0;
    int idx = 0;
    for(int i = 0; i < this.strings.length; i++){
      if (this.strings[i].equals(string) && skipCount == 0){ //found it first time
        skipCount++;
        continue; //continue should放最頂 去skip下面的野
        
      }
      newArray[idx++] = this.strings[i]; //as不是數自已
    }
    this.strings =newArray; // ****** important
    //因找到target就skip newArray會把下一round的放入
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
   // List<Customer> customers =new A

    
  }
  
}
