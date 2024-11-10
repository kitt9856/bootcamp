
import java.util.Arrays;
import java.util.Random;

public class DemoRandom {

    public static void main(String[] args) {
        int result = new Random().nextInt(3);
        System.out.println(result);

        int result2 = new Random().nextInt(3) + 1;
        System.out.println(result2);

        //Exercise
        //marksix
       // int[] marksix = new int[7];
        //gen 7 no., **no duplicated
        //while or for loop?
        //break

        //六合彩
        int x = 0;
        int[] y = new int[7];
        System.out.println(x);
        int i = 0;
        while (y[i] == 0) {
            boolean again = false;

            //  again = false;
            x = new Random().nextInt(50);
            System.out.println(x);
            for (int j = 0; j < y.length; j++) { // check 是否有重複
                if (j != i) {
                    if (x == y[j]) { //x is or not == y[1,2,3...]
                        again = true;
                    } else {
                        again = false;
                    }
                }

                System.out.println("i= " + i + "j= " + j);

            }
            if (again) { //有重複skip this round loop ,即不會 y[i] = x;
                continue;
            }

            y[i] = x;

            i++;
            if (i == y.length) { //i == 7
                break;
            }
        }
        System.out.println(Arrays.toString(y));


        
        //useful
        System.out.println(new Random().nextDouble()); //between 0 and 1

    }

}
