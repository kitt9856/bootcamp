public class Baby {
  private int age;

  public Baby(int age){
    this.age = age;
  }

  public Baby(){

  }

  //Baby b =new Baby(); //can run
  //b.getAge(); //紅線 未開getter
  public int getAge(){
    return this.age;
  }

  public static void main(String[] args) {
    Baby b2 = null;
    Baby b3 = new Baby();
    new Baby(10); //無野裝

    //System.out.println(b2.age); //can run but java.lang.NullPointerException
  }




}
