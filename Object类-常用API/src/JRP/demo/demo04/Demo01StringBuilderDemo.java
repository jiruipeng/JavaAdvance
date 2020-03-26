package JRP.demo.demo04;

public class Demo01StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); // (空白)
        // 使用带参构造
        StringBuilder sb2 = new StringBuilder("马云");
        System.out.println(sb2);
    }
}
