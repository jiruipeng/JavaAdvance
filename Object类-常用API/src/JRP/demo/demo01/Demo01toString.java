package JRP.demo.demo01;

public class Demo01toString {

    public static void main(String[] args) {
        Person one = new Person("Len", 22);
//        Person two = one;
        Person two = new Person("Leo", 22);

        Person three = new Person("Leo", 22);
        //如果不重写
//        String str = one.toString();
//        System.out.println(str);//JRP.demo.demo01.Person@1b6d3586

        //重写以后
        String str = one.toString();
        String s = two.toString();
        String s1 = three.toString();
        System.out.println("one" + str);//Person{name='Len',age=22}
        System.out.println("two" + s);
        System.out.println("three" + s1);
        System.out.println("===================");


        boolean equals = one.equals(two);
        System.out.println("boolean equals = one.equals(two); = " + equals);

        boolean equals2 = two.equals(three);
        System.out.println("boolean equals2 = two.equals(three); = " + equals2);

        Teacher teacher = new Teacher("Len", 22);
        boolean equals1 = one.equals(teacher);
        System.out.println("boolean equals1 = one.equals(teacher); = " + equals1);


    }
}
