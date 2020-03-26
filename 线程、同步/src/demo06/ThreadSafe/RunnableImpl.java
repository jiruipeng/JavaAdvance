package demo06.ThreadSafe;
//1，创建一个Runnable接口的实现类
public class RunnableImpl implements Runnable{
//  2.在实现类中重写Runnable接口的run方法，设置线程任务
    //定义一个多线程共享资源
    private int ticket = 10;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {
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
