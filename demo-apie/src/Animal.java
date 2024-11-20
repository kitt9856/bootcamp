public abstract  class Animal { //禁止別人new animal() , can carry attriute
  private int age;

  //implicitly empty constructor
  public Animal(){
    //defaul supper();

  }

  public int getAge(){
    return this.age;
  }

 
  public void setAge(int age ){
    this.age =age;
  }

  public Animal (int age){
    this.age = age;
  }

  public static void main(String[] args) {
    // 1. constructor can be used for object creation
    //Animal animal = new Animal(3); //error as  abstract class animal //cannot be "new" after abstract
    //2. Parent class constructor can be used

    //Abstract class
    //1. cannot be "new"
    //2. "share?" the common attribute (private attribute, public mthod)
    //3. parent  constructor  can be used by child class
    //4. parent object instance method can be accessed by yhr child object
    //5. Define abstract methods (Without implementation)
  }
  
}
