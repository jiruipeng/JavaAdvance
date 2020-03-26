package JRP.demo.demo02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04DateFormatMethod {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = "2020年02月17日";
        Date date = df.parse(str);
        System.out.println(date);//Mon Feb 17 00:00:00 CST 2020

        String str1 = df.format(date);
        System.out.println(str1);//2020年02月17日
    }
}
