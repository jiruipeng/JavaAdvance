package JRP.demo.demo02;

import java.util.Calendar;

public class Demo06CalendarInit {

    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        //设置年
        int year = calendar.get(Calendar.YEAR);
        //设置月
        int month = calendar.get(Calendar.MONTH) + 1;
        //设置日
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
        //2020年2月19日
    }
}
