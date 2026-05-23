package test4_Algorithm.sortingAlgorithm;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        // 选择排序算法实现
        // 初始化一个无序数组
        int[] arr = {100, 10, 80, 50, 20, 40, 70, 60, 30, 90};


        //Arrays.sort()：使用双轴快速排序（对原始类型）或归并排序（对对象数组）实现。

//        // 选择排序的核心逻辑
//        // 遍历数组，逐步找到每个位置的最小元素并交换
//        for (int i = 0; i < arr.length; i++) {
//            // 假设当前位置i为最小值的索引
//            int min = i;
//            // 遍历i之后的元素，寻找真正的最小值
//            for (int j = i + 1; j < arr.length; j++) {
//                // 如果找到更小的元素，更新min为当前索引j
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//            }
//            // 如果min不等于i，说明找到了更小的元素，进行交换
//            if (arr[min] != arr[i]) {
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//        }
//        // 输出排序后的数组
//        System.out.println(Arrays.toString(arr));
    }

}
