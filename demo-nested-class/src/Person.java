public class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name =name;
    this.age=age;
  }

  public Person(){

  }

  public static Builder builder(){
    return new Builder();
  }

  public String getName(){
    return  this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setAge(int age){
    this.age =age;
  }

  public static class Builder{
    private String name;
  private int age;

    public Builder name(String name){
      this.name = name;
      return this;
    }

    public Builder age(int age){
      this.age = age;
      return this;
    }

    

    public Person build(){
      return new Person(this.name, this.age);
    }

  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(18);
    p1.setName("OSCAR");

    //Builder Pattern
    //( you don't need specify the all-arg constructor for 100 attributes...)
    //Advantage: 1. it is easy to verify the input values when you are creating the object
    Person p2 = Person.builder().name("Ocsar").age(18).build();

    System.out.println(p2.getAge());
    System.out.println(p2.getName());
  }

  //factory pattern e.g. shap() 新股票 same method to process
  
}
