
import java.util.Objects;

public class Father extends GrandFather implements Swimable, Walkable {

    //extends 2 class?? if same name method who called?
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public Father(String name, double weight, double height) {
        super(height, weight);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void drive() {
        System.out.println("Father is driving...");
    }

    //if you write down the @override here..
    //1.compiler will help check the parent class, ensure there is same method for overriden
    //2.Readability!!!
    @Override
    public void swim() {  //因是class要{} ,swimable中有void所以要void
        System.out.println("Father is swimming...");

    }

    @Override
    public void walk() {
        System.out.println("Father is walking..");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Father)) {
            return false;
        }
        Father father = (Father) obj;
        return Objects.equals(father.getName(), this.name)
                && Objects.equals(father.getHeight(), super.getHeight())
                && Objects.equals(father.getWeight(), super.getWeight());
    }

    //java case-senitive on method name
    @Override
    public int hashCode() {
        return Objects.hash(this.name, super.getHeight(), super.getWeight());
    }

    public static void main(String[] args) {
        Father f1 = new Father("Vincent"); //以下行數與此無關
        System.out.println(Swimable.x);

        //poly
        Swimable father = new Father("Oscar");
        // During compile time(紅線), only swim() method is visible for father object
        father.swim(); //swimable有swim() 
        //father.walk();
        Walkable father2 = new Father("Steve");
        father2.walk();
        //father2.swim();

        //Father & Walkable has relationship
        //Father & Swimable has relationship
        //Walkable & Swimable has no relationship
        //Walkable father3 = father;//error
        //Father father4 = father; //complie time error as not confirm
        //compiler think this "father" may not be a Father object
        //if you insist and confirm the "father" is a Father Oject, and you want to convert its type.
        Father father4 = (Father) father;
        father4.swim();
        father4.walk();
        //both can run

        Walkable father5 = father4;
        father5.walk();
        //father5.swim(); //complie time error //swimalbe and walkable no relationship

        //father value always is just "Oscar" , no change value, but 形態改變
        System.out.println(Swimable.sum(10, 2));//12

        Swimable father6 = (Father) father5;
        //2 risks:
        //from walkable obj -> Father
        //Object -> Swimable

        Father father7 = new Father("Peter");
        father7.eat();

        new Father("Kenny").eat(); //disappear // if want to use, must save to var

        //Swimable.eat(); //eat method is an instance method
        //Swimable vs GrandFather (NO relationship)
        GrandFather father8 = (Father) father6; //1 risk 
        //but father and GrandFather has relationship
        //extend 仔的object可放parnet指針

        //father8.drive;//complie time error //hidden
        //Parent object cannot be assigned to child object refernece
        //Father father9 = new  GrandFather();
        //father9.drive;//要drive要先new Father()
    }
}
