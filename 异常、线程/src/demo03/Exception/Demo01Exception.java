package demo03.Exception;

import java.util.ArrayList;
import java.util.List;

public class Demo01Exception {
    public static void main(String[] args) {
        /*
        多个异常使用捕获又该如何处理呢？
            1. 多个异常分别处理。
            2. 多个异常一次捕获，多次处理。
            3. 多个异常一次捕获一次处理。
         */
        //1. 多个异常分别处理。
        /*try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);

            System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 2
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/

        //2. 多个异常一次捕获，多次处理。
        /*try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);

            System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 2
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/
        /*
            一个try多个catch注意事项：
                catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
                ArrayIndexoutOfBoundsException extends IndexoutofBoundsException
         */

        //3. 多个异常一次捕获一次处理。
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);

            System.out.println(list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 2
        }catch (Exception e){
            System.out.println(e);
        }//运行时异常被抛出可以不处理。即不捕获也不声明抛出。交给虚拟机处理
        System.out.println("后续代码！");
    }
}
