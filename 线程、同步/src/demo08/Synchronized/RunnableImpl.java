package demo08.Synchronized;
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重真的票

    解决线程安全问题的二种方案：使用同步方法
    使用步骤：
        1·把访问了共享数据的代码抽取出来，放到一个方法中
        2·在方法上添加synchronized修饰符

    格式：定义方法的格式
    修饰符 synchronized 返回值类型 方法名（参数列表）{
        可能会出现线程安全问题的代码（访问了共享数据的代码）
    }
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享资源
    private int ticket = 10;


    //设置线程任务：卖票
    @Override
    public void run() {
        System.out.println("this:"+this);
        //使用死循环，让卖票操作重复执行
        while (true) {
            //同步代码块
            sellTicket();

        }
    }
    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住只让一个线程执行
        同步方法的锁对象是谁？
        就是实现类对象new RunnableImpL（）
        也是就是this
     */
    public /*synchronized*/ void sellTicket(){
        synchronized (this){
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票。");
                ticket--;
            }
        }
    }

}
