package JRP.demo.demo02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateFormatMethod {
    public static void main(String[] args) {
        Date date = new Date();
        // 创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        System.out.println(str); // 2020年02月17日
    }
}
