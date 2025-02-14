public class Cat {

  // run on hard disk 
  private String name; //Attribute 即object的特性 (cat的特性)
  private int age;//Attribute
  //private 其他人看不到  --在一個球中
  //未有value的
  // age/name 都各有自已的地址在object入面，
  //透過地址再指向age/name
  //如果用new (XXXvalueOf..)，就會開新的地址
  //c.setName(peter)
  //c2.setName(peter) c,c2 name is same address
  //c2. new....(peter) c2 use new address now

  //input -> output
  //there code is from Person.java but can work as 只要輸入到就用到
  public static String getFullName(Person person){ //is 公用的
    //person object -> output
    return person.getFullName();
  }




  //Java: Instance = Oject
  //Instance Method
  //要被看到 用public 再用method...看球中的東西
  //getter
  public String getName() {
    return this.name;
  }

  //Instance Method
  //Setter
  //viod no return value
  public void setName(String x){//void --放野入球中
    //過程: 外面的X 用setName放入name  再放入球中的name (name --private已有)
    this.name = x;
  }

  //Instance Method
  public int getAge() { //getAge是球的
    return this.age; //return球中的age
  }

  //Instance Method
   public void setAge(int age){
    this.age = age;
   }

   public String info() {
    return "Cat[name =" 
    + this.name
    + ", age =" + this.age
    + "]";
   }

   
   public static void main(String[] args) {
    String cat1Name = "John";
    int cat1Age = 10;

    Cat cat1 = new Cat(); //empty constructor implicity exists 
    // new Cat();  //can run 
     System.out.println(cat1.info()); //Cat[name =null, age =0] 因如cat1未有料:
    cat1.setName("John");
    cat1.setAge(10);
    System.out.println(cat1.info());//Cat[name =John, age =10]

    //Dog dog = new Dog();
    //System.out.println(dog.age); //error after add private //0 as same folder



   }

  
  
  
}
