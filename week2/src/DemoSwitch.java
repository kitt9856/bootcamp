
public class DemoSwitch {

    public static void main(String[] args) {

        // normal example
        int dayOfWeek = 3;
        String dayName = "";
        switch (dayOfWeek) { //no range checking, only ==
            case 1:
                dayName = "Monday";
                break;  //if no break print out all case3,4,7 ,中了後的CASE都不會check 所以當中了，出晒
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 7:
                dayName = "Sunday";
                break;
        }
        System.out.println("Day Name=" + dayName);

        char gradeForMoney = 'B';
        int money = -1;
        switch (gradeForMoney) {
            case 'A':
                money += 10;
            case 'B':
                money += 10;
            case 'C':
                money += 10;
            case 'D':
                money += 10;
            case 'E':
                money += 10;
        }

        //not ok - switch example
        //如係連續數，要續個case寫 
        int score = 81;
        char grade = ' ';
        switch (score) {
            case 82:
                grade = 'A';
                break;
            case 80:
                grade = 'A';
                break;
            case 79:
                grade = 'B';
                break;
            // ....
            default:
                grade = 'F';
        }
        System.out.println("grade=" + grade);

    }
}
