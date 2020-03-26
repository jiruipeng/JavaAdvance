package JRP.demo.demo03;

public class TestSystem {
    public static void main(String[] args) {
        //记录开始时的毫秒值
        long begin = System.currentTimeMillis();

        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        //记录结束时的毫秒值
        long end = System.currentTimeMillis();

        long tick = end - begin;
        System.out.println("一共用了：" + tick + " ms");
    }
}
