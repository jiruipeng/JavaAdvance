package demo02.setName;

public class Demo1SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("周杰伦");
        mt.start();

        //开启多线程
        new MyThread("林俊杰").start();
    }
}
