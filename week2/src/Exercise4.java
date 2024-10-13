public class Exercise4 {
  public static void main(String[] args) {
    //use -> sysytem.out.print();  ln會隔行

    //print 1-10 except6
    for (int i = 0; i < 11; ++i){
      if (i == 6 )
        continue;
      System.out.print(i); //01234578910
    }
  }
  
}
