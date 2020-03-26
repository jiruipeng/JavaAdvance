package JRP.demo.demo02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo05HowLongYouBorn {

    public static void main(String[] args) throws ParseException {
        function();
    }

    public static void function() throws ParseException {
        // 将字符串日期,转成Date对象
        // 创建SimpleDateFormat对象,写日期模式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入出生日期，格式：YYYY-MM-dd");
        Date birthday = dateFormat.parse(new Scanner(System.in).next());

        //打印birthday的Date格式
        System.out.println("生日日期的Date格式：" + birthday);
        //获取今天的日期对象
        Date today = new Date();//当前时间对应的毫秒值

        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthday.getTime();//生日日期的毫秒值：946656000000
        long todaySecond = today.getTime();
        long seconds = todaySecond - birthdaySecond;
        System.out.println("生日日期的毫秒值：" + birthdaySecond);

        if(seconds < 0){
            System.out.println("还没出生呢！");
        } else {
            System.out.println("你已经出生了这么多天：" + seconds/1000/60/60/24);
        }




    }
}
