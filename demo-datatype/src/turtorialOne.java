public class turtorialOne {
    public static void main (String[] args) {

        // vscode short cut: ctrl + shift + k = restart

        //System.out.println("before" + i);
        //int i = 1;
        //System.out.println("after" + i);

        int i = 5;
        int a;

        a  = i++;
        // a=i -> a=5
        //i++ -> 5+1 -> 6
        System.out.println("using i++");
        System.out.println("a =" + a);//5
        System.out.println("i =" + i);//6

        i = 5;
        a = ++i;
        System.out.println("using ++1");
        System.out.println("a =" + a);
        System.out.println("i =" + i);

        int k = 0;
        k = 1;
        System.out.println("k +" + k); //post-increment
        System.out.println("k +" + k); //post-increment


        boolean b1 = true; 
        boolean b2 = false;
        
        boolean r1 = 10 > 3;
        System.out.println("r1:" + r1);

        boolean r2 = 10 > 11;
        System.out.println("r2:" + r2);

        boolean r3 = 10 >= 10;
        System.out.println("r3:" + r3);

        boolean r4 = 10 <= 10;
        System.out.println("r4:" + r4);

        






    }
    
}
