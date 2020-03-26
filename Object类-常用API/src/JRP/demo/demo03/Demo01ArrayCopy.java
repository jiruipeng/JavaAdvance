package JRP.demo.demo03;

import java.util.Arrays;

public class Demo01ArrayCopy {

    public static void main(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};

        System.out.println("打印前的数组元素：");
        System.out.println("src = " + Arrays.toString(src));
        System.out.println("dest = " + Arrays.toString(dest));

        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后的数组元素：");
        System.out.println("src = " + Arrays.toString(src));
        System.out.println("dest = " + Arrays.toString(dest));
    }
}
