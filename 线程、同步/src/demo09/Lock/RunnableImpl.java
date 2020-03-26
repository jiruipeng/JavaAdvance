package demo09.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的三种方案：使用Lock锁
    java.util.concurrent.Locks.Lock接口
    Lock实现提供了比使Asynchronized方法和语句可获得的更广泛的锁定操作。
    Lock接口中的方法：
        void Lock（）获取锁。
        void unlock（）释放锁。
    java.util.concurrent.Locks.ReentrantLock implements Lock接口

    使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2，在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
        3，在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
 */
public class RunnableImpl implements Runnable{
//  2.在实现类中重写Runnable接口的run方法，设置线程任务
    //定义一个多线程共享资源
    private int ticket = 10;


//    1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {
//            2，在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            l.lock();

            if(ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票。");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
//            3，在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    l.unlock();//不管程序是否出现异常，都会释放锁
                }

            }

        }
    }


    /*//设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {
//            2，在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            l.lock();

            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票。");
                ticket--;
            }

//            3，在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
            l.unlock();
        }
    }*/

}
