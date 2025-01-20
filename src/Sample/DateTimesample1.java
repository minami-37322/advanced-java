package Sample;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimesample1 {
    public static void main(String[] args) {
        
        LocalDate localDate=LocalDate.now();
        System.out.println("現在の日付:"+localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在の日付と時間:"+localDateTime);
    }

}
