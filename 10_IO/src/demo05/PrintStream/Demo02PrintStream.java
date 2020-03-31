package demo05.PrintStream;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句,默认在控制台输出
    使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out)
          重新分配“标准”输出流。
 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出的");
        //PrintStream old = System.out;//保存目前的标准输出到哪里
        PrintStream ps = new PrintStream("10_IO\\目的地是打印流.txt");
        System.setOut(ps);
        System.out.println("我是在打印流目的地中输出");

        ps.close();
        //System.setOut(old);//设置为原来的标准输出
        //重定向控制台输出
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));//更通用的方法：https://bbs.csdn.net/topics/120067235
        //FileDescriptor.out:https://blog.csdn.net/morningsun1990/article/details/19639583
        System.out.println("释放打印流资源");
    }
}
