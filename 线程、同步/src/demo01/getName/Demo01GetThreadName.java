package demo01.getName;
/*
    线程的名称：
        主线程：main
        新线程：Thread[Thread-0,5,main],Thread[Thread-1,5,main],Thread[Thread-2,5,main]
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法，开启新线程，执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
