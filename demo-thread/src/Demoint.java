public class Demoint {

    private int count;

    //Solution:
    //1. synchronized on method (lock the whole method, until one thread completed the method) //lock住個門
    
    public    void addOne(){ //
        this.count ++;
    }

    public int getCount(){
        return this.count;
    }

    public void reset(){
        this.count =0;
    }


    public static void main(String[] args)  {

        int x = 3;
        x++; //read the value, and then + 1, put the value vack to x var
        System.out.println(x);//4

        Demoint demoint = new Demoint();
        Runnable task = () ->{  //soruce code run() is empty
            for (int i = 0; i < 100_000; i++){ //for loop no excute the task
                demoint.addOne();
            }
        };
        Thread thread1 = new Thread(task);

        //main Thread and Thread1
        thread1.start(); //excute the task //main thread 做了個分身 分身去行task 
        try {
        thread1.join(); //main thread stop here, and wait thread1 complete, and then proceed.
        } catch (InterruptedException e) {
        }

        System.out.println(demoint.getCount()); //before join, likely main thread complete first -> 0, main thread 做完野
        //after join, main thread must wait thread1 complete first -> must be 10000

        //three threads
        demoint.reset(); //reset thread as 上面已行完thread
        Thread thread2 = new Thread(task);
        thread2.start();
        Thread thread3 = new Thread(task);
        thread3.start();
        try {
            thread2.join(); 
            thread3.join(); 

            } catch (InterruptedException e) {
            }
        System.out.println(demoint.getCount()); //  (< 200_000) 不固定的result
        //thread 是可以等待

    }
}
