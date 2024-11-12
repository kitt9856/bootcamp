public class Person {
  private String firstName;
  private String lastName;
  private String emailAddress;

  //construcor: 
  //1. Construcor Name = Class name , 
  //2. no return type, 
  //3. Start with Capital letter
  public Person(String firstName, String lastName, String emailAddress){ // all-arguments constructor
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;


  }

    //you may hace more than 1 constructor
    public Person() { //empty constructor

    }

    //same number of arguments, they are same type
   /*  public Person(String firstName,){ 
      this.firstName = firstName;
    } */

    //static after this.X? can't this. is to find object ,static is not object


  public String getFullName(){
    //當中的this只是file 在用他才有用
    return  this.lastName + " " + this.firstName; //如不加","return 出來不會知哪個是姓/名
  }

  //void 用來只做 不return
  public void setLastName (String lastName){
    this.lastName = lastName;
  }

  public void setFirstName (String firstName){
    this.firstName = firstName;
  }

  public char getChar(int index) {
    return this.emailAddress.charAt(index);
  }

  //change to static method 只要有input料就可以做到
  public static char getChar(String emailAddress, int index){
    return emailAddress.charAt(index);
  }

  public static int min(int x,int y, int z){
    if (x >y){
      if (y>z){ //x > y >. z
        return  z;
      }else{ // x > && y < z
        return  y;
      }
    }else { //x < y
      if (y <z ){ //x < y <z
        return  x;
      } else { //x < y && z <y
        if (x < z) {
          return x;
        }else {
          return z;
        }
      }
    }
  }

  //static method -- input 導致有output
  public static String getFullName(Person person){ //is 公用的
    //person object -> output
    return person.getFullName();
  }




// toString()
  @Override
  public String toString(){ //like array 不能直接print so use toString to make sure can print
    return "Person["
    +"firstName=" + this.firstName
    +", lastName=" + this.firstName
    + "]";

  }

  public static void main(String[] args) {
    //new "constructor"
    Person p1 = new Person("Sally", "Chan","sallychan@gmail");
    System.out.println(p1); //Person[firstName=Sally, lastName=Sally]
    p1.setFirstName("Vincent");
    p1.setLastName("Lau");
    System.out.println(p1.toString()); //Person[firstName=Vincent, lastName=Vincent]

    Person p2 = new Person("Sally", "Chan","xxxx@gmail");
    System.out.println(p1); //Person[firstName=Sally, lastName=Sally]
    p2.setFirstName("Vincent");
    p2.setLastName("Lau");

    //function/method. but in java, we call it static method
    System.out.println(Person.min(9, 3, 1));
    System.out.println(Person.min(9, 1, 3));
    System.out.println(Person.min(1, 9, 3));
    System.out.println(Person.min(1, 3, 9));


    //compare the design between getChar() and min()
    Person p3 = new Person("Ocasr", "Chan","ocasr@gmail");
    System.out.println(p3.getChar(1));
    System.out.println(p1.getChar(1));

    //can we make the getChar() become a static method? NO
    



  }

  
}
