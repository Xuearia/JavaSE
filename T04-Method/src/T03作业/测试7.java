package T03作业;

import java.util.Arrays;

public class 测试7 {
    public static void main(String[] args) {
        /*
        * 比较两个 int 类型的数组是否一样，返回 true 或者 false
        需求:
        如果两个 int 类型的数组，元素个数，对应位置的元素内容都是一样的则认为这 2 个数组是一模一样的。
        例如：如下 2 个数组是一样的
        int [] arrs = {10, 20, 30};
        int [] arrs = {10, 20, 30};
        分析:
        1. 方法是否需要接收数据进行处理？需要接收两个 int 类型的数组，因此，形参声明为:int [ arr1,int [ arr2
        2. 方法是否需要返回数据？方法判断完后需要返回:true、false, 因此，返回值类型声明为 boolean 类型。
        3. 方法内部的业务：判断两个数组内容是否一样。*/
        int[] arrs1 = {10, 20, 30};
        int[] arrs2 = {10, 20, 30,};
        System.out.println(comparison(arrs1,arrs2));
    }

    public static boolean comparison(int[] arr1, int[] arr2) {
        /*if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;*/
        return Arrays.equals(arr1, arr2);
    }
}


