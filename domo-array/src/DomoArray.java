import java.util.Arrays;

public class DomoArray {
    public static void main(String[] args) throws Exception {
        int x = 10;
        //why do we need array?
        int x1 = 11;
        int x2 = 12;
        

        double pi = 3.14159;
        //store a set of smae type of values

        //"new" -> create an array object
        //int[5] -> an int array object able to store 5 int values
        int[] arr = new int[5];   //

        //index starts from 0
        //so, int[5] -> index from 0 to 4
        System.out.println(arr[0]); //0 -> because int default value 0
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //Bug
        //System.out.println(arr[5]);//java.lang.ArrayIndexOutBounds...
        //as no [5]
        
        //edit the value
        arr[2] = 99;
        arr[4] = 1;
        System.out.println(arr[2] + arr[4]); //100

        //read array by loop
        for (int i = 0; i < arr.length; i++){//i <5 i=0 1 2 3 4
            System.out.println(arr[i]);

        }

        //for loop to sum up all values in the int array
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum = " +sum);

        //sum up all even numbers in the int array
        arr[1] = 8;
        arr[3] = 14;
        sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("even no. =" + sum);


        //swap
        //exchange the value for the head and tail of the array
        int backup = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = backup;
        System.out.println(backup);

        //Move the head value to the tail
        //now: 1 8 99 14 0
        // result: 8 88 14 0 1
        System.out.println(Arrays.toString(arr));// [1, 8, 99, 14, 0]
        for (int i = 0; i < (arr.length -1) ;i++){ //length -1 handle last no. +/-
            backup = arr[i];
            arr[i] = arr[i + 1]; //第一個數變下一個數
            arr[i + 1] = backup; //被改變的數要變XX
        }        
        // 8,1,99,14..
        // 8,99,1,14,0

        System.out.println("forloop swap= " + Arrays.toString(arr));

        //find max value
        //result: 99
        int max = Integer.MIN_VALUE; //the min value of int
        //int max = -1; same ineger.min
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max )
            max = arr[i];
        }
        System.out.println("max = " + max);



        //find min value
        //result: 0
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min )
            min = arr[i];
        }
        System.out.println("min = " + min);


        //create long array
        long[] arr2 = new long[4];
        arr2[0] = -100;
        arr2[1] = -9;
        arr2[2] = 50;
        arr2[3] = 14;

        //copy all even numbers from arr2 to arr3

        //count 有幾多個格 因開新array要知有多少格
        int count = 0;
        for (int i = 0; i < arr2.length; i++){
            if ( arr2[i] % 2 == 0){
                count++; //1,2,3,4... 
            }
        } 
        System.out.println(count);  //3    
        long[] arr3 = new long[count];
        int idx = -1;
       // System.out.println(arr3[++idx]);
        for (int i = 0; i < arr2.length;i++){
            if (arr2[i] % 2 == 0){ //在arr2中index i可/2
                arr3[++idx] = arr2[i]; //++idx即1+idx//0,1,2,3...
            }
        }
        System.out.println(Arrays.toString(arr3));

        //move the max value to the tail
        //u create the array here
        //tips: done by one for loop
        long[] arr4 = new long[] {10,99,-4,-100}; // 直接放[]中，不逐個開
        long backup2;
        System.out.println(Arrays.toString(arr4));
        for (int i = 0;i < arr4.length - 1; i++){
            if (arr4[i] > arr4[i + 1]){ //in the same iteration, we control 2 elements in the array
                backup2 = arr4[i]; //符合if就放入var
                arr4[i] = arr4[i + 1]; //因已backup 可以改野
                arr4[i + 1] = backup2; //被改的野要變X
            }
        }
        System.out.println("new arr4=" + Arrays.toString(arr4));
        

        






    }
}
