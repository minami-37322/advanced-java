package Sample;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


public class DateTimeSample5 {
    public static void main(String[] args) {
        System.out.println("LocalDateTimeからフォーマットされた文字列へ変換");
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println("デフォルトの出力形式"+localDateTime);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年MM日dd HH 時 mm分 ss秒");

        String format=localDateTime.format(formatter);
        System.out.println(format);
        System.out.println("==================");

        String strLocaDateTime="2018/12/31 23:59:59";
        DateTimeFormatter fomatter2=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime localDateTime2=LocalDateTime.parse(strLocaDateTime,fomatter2);

        System.out.println("文字列から変換された LocalDateTime:"+localDateTime2);
    }

}
