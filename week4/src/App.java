
import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));


        String inputString = "abracadarbra";
        String taragetSubString = "abab";
        int index = inputString.indexOf(taragetSubString);
        //if exist -> return index, if not -> return -1
        while (index != -1){//condition: can find the index of targetSubString from inputString
            System.out.println("found at index: " + index);
            index = inputString.indexOf(taragetSubString, index + 1);
            //indexOf(Substring, fromIndex):Finds the next
        }

        String sentence = "Learning Java is fun";
        String[] strArr = sentence.split(" ");//input param of .split() //砍開位置
        //approach 1
        System.out.println(Arrays.toString(strArr));
        //approach 2
        for (int i = 0; i < strArr.length;i++){
            System.out.println("Word: " + strArr[i] + ", Length : " + sentence.length());
        }

        //1. use case of split()
        strArr = sentence.split("J");
        System.out.println("split J :" + Arrays.toString(strArr));

        //QQQ,VOO,TSLA
        String stockList = "QQQ,VOO,TSLA";

        String[] splitStockList = stockList.split(",");

        System.out.println("stock List : " + Arrays.toString(splitStockList)); //[QQQ,VOO,TSLA]
        for (int i = 0; i < splitStockList.length; i++){
            System.out.println("Fetch API by splitStockList :" + splitStockList);
        }

        //other syntax of for-loop
        for (String arr2: splitStockList){ //for-each, for(type of source : source){} ,要loop晒所有element
            System.out.println("arr2: " + arr2);


        }

        int[] arr3 = new int[]{1,2,3,4,5,7};
        for (int i : arr3){
            System.out.println("For-each loop : " + i);
        }

        for (int i : arr3){
            System.out.println("before break: " + i );
            
        }






    }
}
