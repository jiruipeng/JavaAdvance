package JRP.demo.demo02;

import java.util.Calendar;
import java.util.Date;

public class Demo07CalendarMethod {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2020);
        Date date = calendar.getTime();
        System.out.println(date);
//        System.out.println();
    }
}
