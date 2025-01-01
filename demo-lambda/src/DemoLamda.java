
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLamda {

    public static void main(String[] args) {
        //Method Signature: Method Name + Input parameters  (how know what method using)

        //Lambda expression: 
        //1.create one-off object for Flyable Interface
        //2. only for those interface having 1 method only (@functionalInterface)
        //"()", because fly() has NO parameters
        //"->", implementation
        Flyable superman = () -> System.out.println("Superman is flying"); //建置object
        superman.fly();
        Flyable superwoman = () -> System.out.println("Superman is flying");
        superman.fly();

        Swimable superman2 = () -> System.err.println("Superman is swimming..");
        superman2.swim();

        //this is NOT Lambda
        FlyNSwim superman3 = new FlyNSwim() {
            @Override
            public void swim() {
                System.out.println("Superman is swimming!!");
            }

            @Override
            public void fly() {
                System.out.println("Superman is flying!!");//
            }
        };

        superman3.fly();
        superman3.swim();

        Math1 add = (a, b) -> a + b;  //不用開add class file 就可以用
        Math1 subtract = (a, b) -> a - b; // ->後其實有 return a-b
        Math1 multiply = (a, b) -> a * b;
        Math1 divide = (a, b) -> a / b;
        System.out.println(add.operate(2, 1));
        System.out.println(subtract.operate(2, 1));
        System.out.println(multiply.operate(2, 1));
        System.out.println(divide.operate(2, 1));

        //Multiple Lines implemntation , you have uew bracket{}
        Math1 multiply2 = (a, b) -> {
            int value = a * b;
            return value;
        };

        //java8 Bult-in FunctionalInterface
        //Function<T,R> (1 in, 1 out)
        Function<String, Integer> stringLength = s -> s.length(); // s is string -> s.length() is integer
        Function<Double, Double> circleArea = radius -> radius * radius * 3.14;
        System.out.println(circleArea.apply(3.0));   //function is interface
        System.out.println(circleArea.apply(5.0));  //function use 公式作為object 

        Function<String, List<String>> splitString = s -> {
            String first = s.substring(0, s.length() / 2);
            String second = s.substring(s.length() / 2, s.length());
            return Arrays.asList(first, second);
        };

        System.out.println(splitString.apply("hello")); //[he,llo]
        System.out.println(splitString.apply("adcdef"));

        //BiFunction  
        BiFunction<String, String, Integer> stringLength2 = (s1, s2) -> s1.length() + s2.length(); //2個in 1個out
        stringLength2.apply("abc", "ijk"); //6

        //superFunction  //自己開
        SuperFunction<String, String, String, String> firstChar
                = (s1, s2, s3) -> "" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0);
        System.out.println(firstChar.apply("abc", "ijk", "def"));

        //Consumer (has input,no output)  
        //e.g. can add to DB value
        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("hello");

        Consumer<List<String>> printStrings = strings -> {
            for (String s : strings) {
                System.out.println(s);
            }
        };
        printStrings.accept(Arrays.asList("hello", "abc", "Jimmy"));

        BiConsumer<String, Integer> charAt = (s, i)
                -> System.out.println(s.charAt(i));
        charAt.accept("hello", 2);//l

        //Supplier  (only output)
        Supplier<Integer> random = () -> new Random().nextInt(100) + 1; //() mean no input
        System.out.println(random.get());

        // Predicate   
        Predicate<String> isTooLong = s -> s.length() >= 5;  //input<> ,output boolean
        System.out.println(isTooLong.test("Amy")); //false
        System.out.println(isTooLong.test("Vincent")); //true

        BiPredicate<String, String> isCorrect = (s, x) -> s.equals(x);
        System.out.println(isCorrect.test("2", "2"));
        System.out.println(isCorrect.test("hello", "abc"));

        //<T,R> mean can same or not same is ok  
        Function<Double, Double> squareArea = length -> length * length;
        System.out.println(squareArea.apply(9.0));

        //UnaryOperator
        UnaryOperator<Double> squareArea2 = length -> length * length; //unary..<>中type自動變2個 =><Double,Double>
        System.out.println(squareArea2.apply(9.0));

        //BinaryOperator
        BiFunction<Double, Double, Double> rectArea = (l1, l2) -> l1 * l2;
        System.out.println(rectArea.apply(3.3, 4.2));
        BinaryOperator<Double> rectArea2 = (l1, l2) -> l1 * l2;        //<>中其實是3個DOuble //2個input Double 1個output DOuble
        System.out.println(rectArea2.apply(3.3, 4.2));

        //application - consumer
        List<String> names = Arrays.asList("amy", "jenny", "susan");
        for (String s : names) {
            System.out.println(s);
        }
        names.forEach(name -> System.out.println(names)); //lambda verions foreach

        //Map.computeIfAbsent
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("amy", "hello");
        nameMap.put("jenny", "goodbye");
        nameMap.computeIfAbsent("amy", s -> "default");
        System.out.println(nameMap);

        //try 1
        nameMap.computeIfAbsent("susan", s -> "default");
        System.out.println(nameMap);

        //try2
        if (nameMap.get("susan") == null) {
            nameMap.put("susan", "default");
        }

        //Map.merge
        Map<String, Integer> nameFrequencyMap = new HashMap<>();
        nameFrequencyMap.put("peter", 2);

        //equivalent to (oldValue, newValue) -> oldValue + newValue
        BiFunction<Integer, Integer, Integer> mergeFrequecyByName
                = (oldValue, newValue) -> oldValue * newValue;

        //Example
        List<Character> grades = Arrays.asList('A', 'C', 'B', 'A', 'D', 'C', 'E', 'F');

        //A -> 50, B -> 40 C-> 30, D->20, E-> 10
        Map<Character, Integer> gradeMap = new HashMap<>();
        for (Character c : grades) {
            //if key exists, add the new value to the old value
            //if key not exists, put new entry with new value
            switch (c) {
                case 'A':
                    gradeMap.merge(c, 50, (o, n) -> o + n); //o mean old value, n =new
                    break;
                case 'B':
                    gradeMap.merge(c, 40, (o, n) -> o + n);

                    break;
                case 'C':
                    gradeMap.merge(c, 30, (o, n) -> o + n);

                    break;
                case 'D':
                    gradeMap.merge(c, 20, (o, n) -> o + n);

                    break;
                case 'E':
                    gradeMap.merge(c, 10, (o, n) -> o + n);

                    break;
                default:
                    gradeMap.merge(c, 0, (o, n) -> o + n); //no exist e.g.'F'
                    break;

            }
        }
        System.out.println(gradeMap);

        // Predicate-> and or
        int age = 66;
        Predicate<Integer> isElderly = age2 -> age2 > 65;
        Predicate<Integer> isChild = age3 -> age3 < 12;
        Predicate<Integer> withDiscount = isElderly.or(isChild);
        System.out.println(withDiscount.test(66)); //true
        System.out.println(withDiscount.test(10)); //true
        System.out.println(withDiscount.test(18)); //false

        //s1 -1 , s2 1
        Comparator<String> descendingOrder = (s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1;
        List<String> strings = Arrays.asList("abc", "zyx", "ijk");
        Collections.sort(strings, descendingOrder);
        System.out.println(strings);

        //動作即人物
        //要做的task/難做的事 抽出來做專家 (method)
    }
}
