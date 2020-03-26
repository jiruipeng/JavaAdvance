package JRP.demo.demo02;

import java.util.Date;

public class Demo01Date {

    public static void main(String[] args) {
        //创建日期对象，输出当前时间
        System.out.println("当前时间：" + new Date());//Wed Feb 19 16:13:11 CST 2020
        //创建日期对象，把当前的毫秒值转成日期对象
        System.out.println("0L当前毫秒值转成的日期对象：" + new Date(0L));//Thu Jan 01 08:00:00 CST 1970
    }
}
