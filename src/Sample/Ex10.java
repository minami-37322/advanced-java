package Sample;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;



public class Ex10 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,07,27);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format= localDate.format(formatter);
        
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String dayOfWeekJp = getJapaneseDayOfWeek(dayOfWeek);
        System.out.println(localDate + "（" + dayOfWeekJp + "）");
    }

        public static String getJapaneseDayOfWeek(DayOfWeek dayOfWeek) {
            switch (dayOfWeek) {
                case MONDAY: return "月曜日";
                case TUESDAY: return "火曜日";
                case WEDNESDAY: return "水曜日";
                case THURSDAY: return "木曜日";
                case FRIDAY: return "金曜日";
                case SATURDAY: return "土曜日";
                case SUNDAY: return "日曜日";
                default: return "";
    }
        
  }
}
