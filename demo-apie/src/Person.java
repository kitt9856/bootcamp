
//all class in java implicitly extends object.class
public class Person {
  private int age;

  public Person(int age){
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public String toString(){
    return "Person["
    +"age=" +this.age
    +"]";
  }

  public static void main(String[] args) {
    Person p1 = new Person(13);
    //Person@54bedef2 -> object refernece
    //before @override to String
    //System.out.println(p1.toString());

    //after @override toString()
    System.out.println(p1.toString());//Person[age=13]

    System.out.println(p1); //sys out is calling toString()

    Object o1 = new Object(); //最頂部的object defaul已有Object
    System.out.println(o1.toString()); 
    //Object.toString() returns object reference


    //equals(..) & hashcode()
    Person p2 = new Person(13);
    System.out.println(p1.equals(p2)); //false



  }
  
}
