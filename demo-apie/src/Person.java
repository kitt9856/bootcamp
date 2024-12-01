
//all class in java implicitly extends object.class

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    //it is to define a person.
    //Person p1 = new Person("Vincent",19)
    //Person p2 = new Person("Sally",19)
    //p1.equals(p2) -> p1 (this), p2 (obj)
    @Override
    public boolean equals(Object obj) {
        //early return
        if (this == obj) { //same address = same object
            return true;
        }
        if (!(obj instanceof Person)) //check obj is or not from (Person obj)
        {
            return false;
        }
        Person person = (Person) obj; //risky-> safe
        //person definition
        //return person.getAge() == this.age//
        // && person.getName().equals(this.name);
        return Objects.equals(person.getAge(), this.age)
                && Objects.equals(person.getName(), this.name);

    }

    @Override
    public String toString() {
        return "Person["
                + "name=" + this.name
                + "age=" + this.age
                + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Vincent",13);
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
        Person p2 = new Person("Vincent",13);
        //Before Overrride equals()
        // System.out.println(p1.equals(p2)); //false, object p1 is not equals to object p2.

        System.out.println(p1.equals(p2)); //true, after override

        Person p3 = p2; //same adderss as p2
        System.out.println(p2.equals(p3)); // trur, because they are pointing to same object.

        //Person person2 = new Dog();
       // Dog dog3 = (Dog) dog; //compile ok but java not resonpible if dog is not from Person dog.

        Object dog = new Dog();//指針可以指向parnet or high level 
        dog = new Person("Vincent", 19);
        //because dog object is in Object reference.So, 
        //it cannot ensure the intsance method during compile time.        
        //dog3.barking();

        // Dog dog2 = new Oject(); //Parent Object cannot be assigned to child 
        if (dog instanceof Dog) { //防止 dog2 = new Person("xxx",10)
            Dog dog2 = (Dog) dog;
            dog2.barking();
        } else if (dog instanceof Person) {
            Person person = (Person) dog;
            System.out.println(person.getName()); //vincent //要先過complie time
        }

        Person person = (Person) dog;// java.lang.classcast...

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2));//true




        Machine x = new Projector(3.4); //now 形態是Machine
        if (x instanceof Projector) {
            Projector x2 = (Projector) x; //casting (down cast) //x的形態已是projector 但仍是Machine object
            System.out.println(x2.getColor()); //Orange
        }

    }

}
