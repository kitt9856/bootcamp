
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DemoDate {

    public static void main(String[] args) {
        //LocalDate
        LocalDate date = LocalDate.of(2024, 11, 30);
        System.out.println(date);

        System.out.println(date.getDayOfWeek());//SATURDAY
        System.out.println(date.plusDays(1)); //2024-11-30

        System.out.println(date.plusMonths(2)); //2024-12-01
        System.out.println(date.plusMonths(2)); //2025-01-30
        System.out.println(date); //2024-11-30

        LocalDate date2 = LocalDate.of(2024, 11, 30);
        System.out.println(date.equals(date2)); //true checking value
        System.out.println(date == date2); //false because check object address

        LocalDate date3 = LocalDate.of(2024, 12, 2);
        System.out.println(date2.compareTo(date3)); //-1 nov 30 < Dec 2
        System.out.println(date3.compareTo(date2)); //-1 nov 30 < Dec 2

        //the no. of dats since 1970
        System.out.println(date3.toEpochDay());

        //***important
        //Integer , Double -> use equals(), compareTo()
        Double d3 = 3.3;
        Double d4 = 3.4;
        System.out.println(d3.compareTo(d4)); //-1  是按DOUBLE作者的定義去判斷大小
        System.out.println(d3 < d4);//true   Double < Double -> double <double so true

        LocalDateTime dateTime = LocalDateTime.of(2024,10,1,23,55,59);
        System.out.println(dateTime);//2024-10-01T23:55:59
        System.out.println(dateTime.getSecond());//59
        System.out.println(dateTime.plusSeconds(1)); //2024-10-01T23:56

        //Epoch Scond, the no, seconds since 1970 1 1 00:00:00
        System.out.println(dateTime.toEpochSecond(ZoneOffset.UTC));

        Date date4 = Date.valueOf("2024-10-12"); //Date is Long
        System.out.println(date4);

        //System.out.println(BigDecimal);




    }

}
