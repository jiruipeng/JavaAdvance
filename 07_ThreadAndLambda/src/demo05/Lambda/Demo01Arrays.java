package demo05.Lambda;
/*
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("周杰伦",42),
                new Person("林俊杰",40),
                new Person("方文山",44)
        };

        //对数组中的Persoon对象使用Arrays的sort方法通过年龄进行升序（前边-后边）排序
       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2) ->{
            return o1.getAge() - o2.getAge();
        });

        //优化省略Lambda
        Arrays.sort(arr,(o1, o2) -> o1.getAge() - o2.getAge());

        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }


    }
}
