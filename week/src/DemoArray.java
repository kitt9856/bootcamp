
import java.util.Arrays;

public class DemoArray {

    int[] array = new int[]{1,2,3,4,5};

    public int getLength(){
        return  this.array.length;
    }

    public int[] getArr(){
        return this.array;
    }

    public void add(int num){
        int[] newArr = Arrays.copyOf(this.array, this.array.length+1);
    }

    public void sub(int num){
        int[] newArr = Arrays.copyOf(this.array, this.array.length-1);
        for(int i  : this.array){
            if (this.array[i] == num) 
                continue;
                newArr[i] =this.array[i];

            
        }
        array = newArr;

    }
    public void sub2(int num){
        

    }

    public static void main(String[] args) throws Exception {
        DemoArray arr1 = new DemoArray();
        arr1.add(6);
        System.out.println(arr1.getLength());//arr1.getLe.. = 6
        System.out.println(Arrays.toString(arr1.getArr()));
        arr1.sub(1);
        System.out.println(arr1.getLength());
        System.out.println(Arrays.toString(arr1.getArr()));

        arr1
    }
}
