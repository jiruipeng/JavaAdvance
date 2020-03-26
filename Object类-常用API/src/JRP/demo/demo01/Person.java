package JRP.demo.demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Person{" + "name='" + name + '\'' + ",age=" + age + '}';
//    }
    //自动重写快捷方式：toString()+Alt+enter
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 如果对象地址一样，则认为相同
        if (this == o){
            System.out.println("对象地址一样");
            return true;
        }
        // 如果参数为空，或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass()){
            System.out.println("参数为空，或者类型信息不一样");
            return false;
        }
        // 转换为当前类型
        Person person = (Person) o;
        // 要求基本类型相等，并且将引用类型交给java.util.Objects类的equals静态方法取用结果
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
