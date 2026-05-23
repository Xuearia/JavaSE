package test1_Arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {
        /**
         * 目标：掌握Arrays类的常用方法。
         */
        // 1、public static String toString(类型[] arr): 返回数组的内容
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));

        // 2、public static 类型[] copyOfRange(类型[] arr, 起始索引, 结束索引) ：拷贝数组（指定范围，包前不包后）
        int[] arr2 = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(arr2));

        // 3、public static copyOf(类型[] arr, int newLength)：拷贝数组，可以指定新数组的长度。
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));//用0填充空位


        // 4、public static setAll(double[] array, IntToDoubleFunction generator)：把数组中的原数据改为新数据又存进去。
        double[] proces = {99.3, 128, 100};
        //                  0     1    2
        // 把所有的价格都打八折，然后又存进去
        Arrays.setAll(proces, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {

                return proces[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(proces));

        // 5、public static void sort(类型[] arr)：对数组进行排序(默认是升序排序)
        Arrays.sort(proces);
        System.out.println(Arrays.toString(proces));

    }
}

