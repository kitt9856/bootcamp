public class Dog extends Animal {
  //private int age;
  private String name;

  //implicitly empty constructor
  public Dog(){
    //supper(); //call the parent constructor
  }
    //這file本身已有這段

   public Dog(int age){
    super(age);
   }

   public Dog(int age, String name){
    //this.age = age;//error as age not in dog file
    super(age);
    // super() go first
    this.name = name;
   }

   public void barking(){
    System.out.println("I am barking");
   }

   public void setName(String name){
    this.name = name;
   }

   public String getName(){
    return this.name;
   }

   @Override
   public String toString(){
    return "Dog[" + "age" + super.getAge() //or this.getAge() but super is better 
    + "name" + this.name + "]";
   }

  public static void main(String[] args) {
    //1. constructor
    //call parent constructor to create animal object,
    //and then associate the Dog
    Dog d1 = new Dog(13,"Sally");
    System.out.println(d1.getAge());//13
    //1. constructor
    
    //2. setter
    d1.setAge(10);
    //d1.age; //error because age is Private attribute in parent class
    System.out.println(d1.getAge());//10


    //d1 是指DOg object
   // new Dog();

    Dog d2 = new Dog(18, "Tommy");
    d2.setAge(17);
    Dog d3 = d1;
    d3.setAge(18);
    System.out.println(d3);
    System.out.println(d1); //so d3 =d1 d1 also impact

    //We just have dog objects here and 1 dog array object and 2 object reference(dogs1,dogs2)
    Dog[] dogs1 = new Dog[] {new Dog(1,"abc"),new Dog(9, "def")};
    Dog[] dogs2 = dogs1;

    dogs2[1].setName("Vincent");
    System.out.println(dogs2[1].getName()); //Vincent
    System.out.println(dogs1[1].getName()); //Vincent






  }
}
