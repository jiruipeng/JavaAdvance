package demo02.setName;
/*
    设置线程的名称：（了解）
        1，使用Thread类中的方法setName（名字）
            void setName（string name）改变线程名称，使之与参数name相同。
        2·创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程起一个名字
            Thread（string name）分配新的Thread对象。
 */
public class MyThread extends Thread{
    public MyThread(){}

    public MyThread(String name){
        super(name);//把线程名称传递给父类，让父类（Thread）给子线程起一个名字
    }

    @Override
    public void run() {
        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
