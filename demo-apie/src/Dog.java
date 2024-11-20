public class Dog extends Animal {
  //private int age;
  private String name;

  //implicitly empty constructor
  /* public Dog(){
    supper(); //call the parent constructor
  }
   */ //這file本身已有這段

   public Dog(int age, String name){
    //this.age = age;//error as age not in dog file
    super(age);
    // super() go first
    this.name = name;
   }

   public void setName(String name){
    this.name = name;
   }

  public static void main(String[] args) {
    //call parent constructor to create animal object,
    //and then associate the Dog
    Dog d1 = new Dog(13,"Sally");
    System.out.println(d1.getAge());
    //1. constructor
    //2. setter

    d1.setAge(10);
    System.out.println(d1.getAge());


    //d1 是指DOg object
  }
}
