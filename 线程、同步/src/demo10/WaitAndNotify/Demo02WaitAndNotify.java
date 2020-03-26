package demo10.WaitAndNotify;
/*
    进入到Timewaiting（计时等待）有两种方式
    1，使用sleep（pong m）方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait（Long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

    唤醒的方法：
        void notify（）唤醒在此对象监视器上等待的单个线程。
        void notifyALL（）唤醒在此对象监视器上等待的所有线程。
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while (true){
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            obj.wait(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("顾客1包子已经做好了，开吃！");
                        System.out.println("---------------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while (true){
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            obj.wait(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("顾客2包子已经做好了，开吃！");
                        System.out.println("---------------------------");
                    }
                }
            }
        }.start();
    }
}
