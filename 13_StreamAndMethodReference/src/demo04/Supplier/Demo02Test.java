package demo04.Supplier;
/*
    练习：求数组元素最大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
        提示：接口的泛型请使用java.lang.Integer类。
 */

import java.util.function.Supplier;

public class Demo02Test {
    //定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int maxValue = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i>=max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println("数组中元素的最大值是："+maxValue);

    }
}
