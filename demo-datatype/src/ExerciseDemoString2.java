public class ExerciseDemoString2 {
  public static void main(String[] args) {
    String str1 = "VenturenixLAB, Coding";

     /*
   * 
   * Expect Result : 1. VENTURENIXLAB,
   * 
   * JAVA 2. venturenixlab, java
   * 
   * 3. V*NTUR*NIXLAB, JAVA!!!
   */

    //String str2 = str1.toUpperCase();
    //System.out.println(str1.toUpperCase());
//
    //System.out.println(str1.toLowerCase());
    //System.out.println(str1.replace('e', '*') + "!!!");

    //String str2 = str1.replace('e', '*');

    //String str2 = str1.replace("Coding" , "Java");
    //System.out.println("case1" + str1.toUpperCase().replace("Coding", "Java")); //toupercase first ,then replace
    //System.out.println("case2" + str1.replace("Coding", "Java").toUpperCase());
    //System.out.println("case3" + str1.toLowerCase().replace("Coding", "Java")); 

    System.out.println("1." + str1.replace("Coding", "Java"));
    System.out.println("2." + str1.replace("Coding", "Java").toLowerCase());
    String str2 = str1.replace("Coding", "Java");
   // System.out.println(str2); //checking
    System.out.println("3." + str2.replace('e', '*').toUpperCase().concat("!!!") );
  }
  
}
