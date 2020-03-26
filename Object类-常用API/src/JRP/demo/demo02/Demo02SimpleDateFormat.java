package JRP.demo.demo02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02SimpleDateFormat {

    public static void main(String[] args) {
        Date date = new Date();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);
        System.out.println(str);
    }
}
