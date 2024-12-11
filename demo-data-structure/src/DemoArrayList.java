
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) throws Exception {
        //array
        //disadvantages
        //1. define length of array (the length is static)
        //2. for modification, you have to locate the position of array
        String[] arr = new String[] {"hello","abc","def", "abc"};
        System.out.println(arr[2]);
        arr[1] = "bye";
        for(int i =0; i< arr.length; i++){
            if(arr[i].equals("abc")){
                arr[i] = "ijk";
            }
        }

        //arraylist
        //dynamic length
        ArrayList<String> strings = new ArrayList<String>();
        // "new ArrayList<String>()" -> create an ArrayList Of Stting object
        //"ArrayList<String> strings" -> ArrayList of String object reference

        //after java 1.5 (200x)
        ArrayList<String> strings2 = new ArrayList<>(); //<> now deduat String 
        //ArrayList.class -> underlying structure ->array 底層是array
        strings2.add("hello");
        strings2.add("abc");
        strings2.add("def");
        strings2.add("abc");
        System.out.println(strings2.size()); //4, similar to array.length
        strings2.remove("abc");
        System.out.println(strings2.size()); //3 //直覺會以為是remove all but only remove 1
        //as source code forloop have break
        strings2.add("abc");

        ArrayList<String> toBeDeleted = new ArrayList<>();
        toBeDeleted.add("abc");
        toBeDeleted.add("hello");
        
        System.out.println(strings2);
        strings2.removeAll(toBeDeleted);
        System.out.println(strings2); //[def]

        strings2.clear();//array object still exist
        System.out.println(strings2.size()); //0, 

        strings2 = null; //removed ArrayList object //指緊空指針
        //strings2.add("ijk"); //run time error ,NPE(null pointer exception)


        List<String> strings3 = new ArrayList<>(); //List is interface
        strings3.add("hello");
        strings3.add("abc");
        System.out.println(strings3.get(1));//abc (array[1])
        //System.out.println(strings3.get(2)); //error
        strings3.remove("hello");
        System.out.println(strings3.get(0));//abc


    }
}
