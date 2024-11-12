
import java.math.BigDecimal;

public class StringBox { //simulate stringbuilder.class
  private char[] chs;

  public StringBox(String s){
    this.chs = s.toCharArray();
  }

  public char charAt(int idx){
    return  this.chs[idx];
  }

  //String design
  public StringBox concat(String s2){
    char[] arr= new char[this.chs.length + s2.length()];
    int idx = 0;
    for (int i = 0; i < this.chs.length; i++){ //抄起舊array
      arr[idx++] = this.chs[i];
    }
    for (int i = 0; i < s2.length(); i++){//work array
      arr[idx++] = s2.charAt(i);
    }
    return new StringBox(String.valueOf(arr));
  }
  



  //StringBuilder design
  public void append(String s2){
    char[] arr= new char[this.chs.length + s2.length()];
    int idx = 0;
    for (int i = 0; i < this.chs.length; i++){ //抄起舊array
      arr[idx++] = this.chs[i];
    }
    for (int i = 0; i < s2.length(); i++){//work array
      arr[idx++] = s2.charAt(i);
    }
    this.chs = arr;
  }

  @Override
  public String toString(){
    return String.valueOf(this.chs); // 轉單位
  }

  public static void main(String[] args) {
    StringBox sb = new StringBox ("hello");
    System.out.println(sb.charAt(1));

    sb.append("def");  //append修改自身
    System.out.println(sb); //StringBox@54bedef2 (object reference) -> sb object's address


    //concat() dosesn't change the state of itself 不會修改自身
    StringBox newStringBox = sb.concat("ijk");
    System.out.println(sb);
    System.out.println(newStringBox);//

    //BigDecimal method doesn't change itself
    BigDecimal bd = BigDecimal.valueOf(3.4); 
    BigDecimal result = bd.add(BigDecimal.valueOf(3.5)); //doesn't change bd value
    System.out.println(result);
    System.out.println(bd);


  }
  
}
