package Sample;

import java.time.LocalDateTime;

public class DateTimeSample3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2018,1,2,3,4,5,999999990);
        System.out.println("日付と時間:"+localDateTime);
   

       // LocalDateTime localDate2 = localDateTime.plusYears(1);
        localDateTime=localDateTime.plusYears(1);
        localDateTime=localDateTime.plusMonths(2);
        localDateTime=localDateTime.plusDays(3);

        System.out.println("進めた後:"+localDateTime);
    }


}
