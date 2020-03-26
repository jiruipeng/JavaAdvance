package demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        try{
            //可能产生异常的代码
            readFile("d:\\a.tx");
        }catch (IOException e){//try中抛出异常对象，catch就定义什么异常变量，用来接收这个异常对象
            //异常的处理逻辑，接收异常对象之后，怎么处理异常对象
            //System.out.println("catch - 传递的文件后缀不是.txt"+e);
            /*
                Throwable类中定义了3个异常处理的方法
                String getMessage（）返回此throwable的简短描述。
                String tostring（）返回此throwable 的详细消息字符串。
                void printStackTrace（）Jv打印异常对象，默认此方法，打印的异常信息是最全面的
             */
            //System.out.println(e.getMessage());//文件的后缀名不对
            //System.out.println(e.toString());//java.io.IOException: 文件的后缀名不对
            //System.out.println(e);//java.io.IOException: 文件的后缀名不对
            /*
                java.io.IOException: 文件的后缀名不对
                    at demo02.Exception.Demo01TryCatch.readFile(Demo01TryCatch.java:32)
                    at demo02.Exception.Demo01TryCatch.main(Demo01TryCatch.java:10)
             */
            e.printStackTrace();
        }
        System.out.println("后续代码");

    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("路径没有问题，读取文件");
    }
}
