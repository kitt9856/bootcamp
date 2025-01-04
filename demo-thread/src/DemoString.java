public class DemoString {
  private CharSequence str;

  public DemoString(){
    this.str = new StringBuffer();  //stringBuilder 都是array 且incorrect
  }

  public   void addChar(char c){
    if(this.str instanceof  StringBuilder){
      StringBuilder sb = (StringBuilder) this.str;
      }else if (this.str instanceof StringBuffer){
      StringBuffer sb = (StringBuffer) this.str;
      sb.append(c);
      this.str =sb;
      }
      else if (this.str instanceof String){
        String s= (String) this.str;
        s += c;
        this.str =s;
    }
  }

  public String getStr(){
    return this.str.toString();
  }

  //Solution1: StringBuffer
  //Solution2: synch
  public static void main(String[] args) {
    DemoString ds = new DemoString();
    Runnable task = () ->{
      for (int i = 0; i < 100_000; i++){
        ds.addChar('a');
      }
    };
    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
    try {
        thread1.join();
        thread2.join();

    } catch (InterruptedException e) {
    }
    System.out.println(ds.getStr().length());  //   (< 200_000)
  }
}
