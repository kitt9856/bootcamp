public class DemoRecursion {

  public static void main(String[] args) {
    //1+2+3+4+5
    int sum=0;
    for (int i = 1; i <= 5; i++){
      sum +=1;
    }
    System.out.println(sum);

    System.out.println(sum(5));

  }

  public static int sum(int x){
    //base criteria
    if(x <=1) //exit criteria
      return 1;
    return x + sum(x-1); //call itself  //if不知幾時完可以用
  }

  //step1 : 5 + sum(4)
  //step2 : 4 + sum(3)
  //...
  //Setp 4: 2+sum(1) 中了
  //setp 5: return 1
  //step 6: 2+1
  //step 9: 15


  //tail non-tail e.g. send 晒email to customer 才log process time


  
}

 
