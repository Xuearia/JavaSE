package test4_Algorithm.sortingAlgorithm;

import java.util.Arrays;

/**
 * BubbleSortDemo类用于演示冒泡排序算法的实现
 * 冒泡排序是一种简单的排序算法，它重复地遍历要排序的数列，
 * 一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 遍历数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 */
public class BubbleSortDemo {
    /**
     * 主函数执行冒泡排序算法
     * @param args 命令行参数，未使用
     */
    public static void main(String[] args) {
        // 初始化一个整数数组
        int[] arr = {100, 10, 80, 50, 20, 40, 70, 60, 30, 90};

        // 外层循环控制整个排序过程需要进行的轮数
        for (int i = 0; i < arr.length; i++) {
            // 内层循环控制每一轮的比较和交换过程
            for (int j = i + 1; j < arr.length; j++) {
                // 如果发现前面的元素大于后面的元素，则交换它们的位置
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 输出排序后的数组
        System.out.println(Arrays.toString(arr));
    }
}
