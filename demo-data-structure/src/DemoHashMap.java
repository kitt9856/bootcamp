import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    //underlying structure of hashmap: array + linked list
    HashMap<String, String> hm1 = new HashMap<>();
    hm1.put("1" , "vincent"); //put one entry into the hashmap
    hm1.put("2","lucas");//put one entry into the hashmap
    hm1.put("3","steven");//put one entry into the hashmap
    System.out.println(hm1.size()); //3 entires in total

    //<String, String>
    //<key, value>, key cannot be repeated.
    hm1.put("2", "lydia"); //overide the enty (as they have same key)
    System.out.println(hm1.get("2")); //lydia
    System.out.println(hm1.size());//3 en..

    System.out.println(hm1.get("10")); //null

    for(Map.Entry<String, String> entry : hm1.entrySet()) {  //entrySet() show all entry
      System.out.println(entry.getKey() + "" + entry.getKey());

    }

    //正常hashmap不會forloop 因hashmap已在幫你找東西 similar 查字典

    for(String key : hm1.keySet()){
      System.out.println(key);
    }

    for(String value : hm1.values()){
      System.out.println(value);
    }

    hm1.remove("2");
    System.out.println(hm1);

    HashMap<Author,List<String>> authorMap = new HashMap<>();
    authorMap.put(new Author("Vincent"), Arrays.asList("abc","def"));    //put() 都是call equal() 
    authorMap.put(new Author("Luscas"), Arrays.asList("ijk","xyz")); 
    authorMap.put(new Author("Vincent"), Arrays.asList("opq","hhh")); 

    System.out.println(authorMap.size());//2 
    //put() can replace orginal as 1.hashmap call equal() 2.String call equal()

  }
  //1個for loop中有for loop  O(n二次方) 
  //2個平for loop = O(n)
  //if...(no loop)= O(1)
  //collection.sort =O(n log n) or O(log n)

  //B tree -> Red bad tree 
  
  //stack underlying=linkist

  //Mergesort
  //DSA data structure algor e.g arraylist to remove
  
}
