package test4_Algorithm.sortingAlgorithm;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        // 初始化一个有序数组
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // 使用自定义的二分查找方法寻找91的位置，这里会返回-1，因为91不在数组中
        System.out.println(binarySearch(arr, 91));

        // 使用Java提供的二分查找方法寻找20的位置，会返回一个非负数表示索引位置
        System.out.println(Arrays.binarySearch(arr, 20));
    }

    /**
     * 自定义二分查找方法
     * @param arr 一个有序数组
     * @param number 需要查找的数字
     * @return 如果找到，返回数字在数组中的索引；如果未找到，返回-1
     */
    public static int binarySearch(int arr[], int number) {
        // 定义左边索引
        int left = 0;
        // 定义右边索引
        int right = arr.length - 1;

        // 当左边索引小于等于右边索引时，执行查找
        while (left <= right) {
            // 计算中间索引
            int middle = (left + right) / 2;
            // 如果查找的数字小于中间的数字，调整右边索引
            if (number < arr[middle]) {
                right = middle - 1;
            } else if (number > arr[middle]) {
                // 如果查找的数字大于中间的数字，调整左边索引
                left = middle + 1;
            } else {
                // 如果找到，返回中间索引
                return middle;
            }
        }
        // 如果未找到，返回-1
        return -1;
    }
}
