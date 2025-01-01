
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream{
  
  public static void main(String[] args) {
      List<String> strings = Arrays.asList("vincent","amy","jenny","vincent");
      //loop + if " string length
      List<String> results = new ArrayList<>();
      for (String s : strings){
        if (s.length() >= 5){
          results.add(s);
        }
      }
      System.out.println(results); //不會出amy as amy < 5

      //stream
      List<String> streamResult = strings.stream()
      .filter(s -> s.length() >=5)
      .collect(Collectors.toList());
      System.out.println(streamResult);

      Set<String> streamResult2 = strings.stream()
      .filter(s -> s.length() >=5)
      .collect(Collectors.toSet());
      System.out.println(streamResult2);

      List<String> streamResult3 = strings.stream()
      .filter(s -> s.length() >=5 && s.charAt(0) == 'V')  //not boolean  //只留true 
      .collect(Collectors.toList());
      System.out.println(streamResult3);

      //precieate s-> + boolean =>放入公式



      //Stream.class (java8)  stream從collection to list,set...
      Stream<String> ss = Stream.of("abcd","def","ijk"); //.of 即new ...

      ss.collect(Collectors.toList()); //stream了就可以 .collect //terminal operation
      //collect() is a treminal operation, so u no longer to use "ss" after the terminal operation
      

      Stream<String> ss2 = Stream.of("abcd","def","ijk"); 
     // ss2.filter(s->s.length() >3); //object's method沒有做紀錄 if 無野裝住 //intermediate -> return new Strem<String>
      //ss.map(s-> s.length()); //轉int //intermediate
     //  System.out.println(ss2.count()); //illegalStat 
      //count also terminal operation
      ss2 =ss2.filter(s->s.length() >3); 
      System.out.println(ss2.count()); //1 as only "abcd" >4 length

      //Normal Stream and then collect
      List<String> names = new ArrayList<>(List.of("steve","jenny","owen"));

      //java copy names's contenct to stream object, filter, map..then new ArrayList 
      names.stream().filter(s -> s.length() >= 5).collect(Collectors.toList()); //每次stream treminal operation一次就會消失

      Stream<Integer> integers = Stream.empty();
      System.out.println(integers.count()); //0

      //create an infinite stream of random numbers
      //stream.generate() works with limit() intermediate operation
      Stream<Double> randoms = Stream.generate(()->(double) new Random().nextInt(100)); //supplier only output
      System.out.println(randoms.filter(n->n%2 ==0).limit(10).collect(Collectors.toList())); //without collect will output hashcode

      //for each in stream
      Stream<Integer> integers2 = Stream.of(5,10,51,100);
      integers2.forEach(n ->{ //consumer //only input no output
        System.out.println("n=" + n); //sys out not return so is ok
      });

      //reduce() 用一排數 自動加

      //groupBy
      List<Employee> employees = new ArrayList<>(
        List.of(new Employee(1L, "Steve", 20000, "IT")
        ,(new Employee(2L, "John", 30000, "MK"))
        ,(new Employee(3L, "Mary", 80000, "IT"))
        ,(new Employee(4L, "Sally", 40000, "HR"))
        ,(new Employee(4L, "Tommy", 35000, "MK"))
        ));

        //"e -> e " -> key
        //"e -> e.getSalary " ->value
       Map<String, Integer>employMap=  employees.stream().collect(Collectors.toMap(e->e.getName(), e->e.getSalary()));
       System.out.println(employMap); //先按名的字排 steve,sally =>key,再按人工低至高 =>value

       Map<String, List<Employee>> employMap2=  
       employees.stream().collect(Collectors.groupingBy(e -> e.getDeptCode()));
       System.out.println(employMap2); //按部門分類 HR=[],IT=[],MK=[]
       System.out.println(employMap2.get("IT")); //再分類了的部門中只getIT 

       Map<String, Integer> employMap3=  //output is getSalary so <X,Integer>
       employees.stream().collect(Collectors.groupingBy(e -> e.getDeptCode(), //key
       Collectors.summingInt(e -> e.getSalary()))); //value
       System.out.println(employMap3);
       System.out.println(employMap3.get("MK")); //會同一部門的人工加起

       Map<String, Double> employMap4=  
       employees.stream().collect(Collectors.groupingBy(e -> e.getDeptCode(),
       Collectors.averagingInt(e->e.getSalary())));
       System.out.println(employMap4.get("IT"));

       //Question
       long count = Stream.of(4,5,6)
       //寫了filter會skip map, but u only need count()
     //  .filter(n-> {
     //   System.out.println("filting....");
     //   return  n%2 ==0;
     // })
       .map(n->{ //map 用來改變形狀
        System.out.println(n);
        return n+1;
       }).count(); //count is intermediate , will skip map
       //Stream: Terminal operation may detemine if intermediate operation executes
       System.out.println("count=" + count);

        

  }


  public static class Employee{
    private Long id;
    private String name;
    private int salary;
    private String deptCode; //IT, MK,HR

    public Employee(Long id, String name, int salary, String deptCode){
      this.id = id;
      this.name =name;
      this.salary =salary;
      this.deptCode =deptCode;
    }

    public int  getSalary(){
      return this.salary;
    }

    public String  getDeptCode(){
      return this.deptCode;
    }

    public String  getName(){
      return this.name;
    }

    @Override
    public String toString(){
      return "Employee[" 
      + "id=" + this.id
      +",name=" + this.name
      +",salary=" + this.salary
      + ",deptcode=" + this.deptCode + "]";  
    }


  }

}