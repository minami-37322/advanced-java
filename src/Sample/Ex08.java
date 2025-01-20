package Sample;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,02,01);

        localDate.with(TemporalAdjusters.lastDayOfMonth());

        int day= localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        System.out.println(day);
    }

}
