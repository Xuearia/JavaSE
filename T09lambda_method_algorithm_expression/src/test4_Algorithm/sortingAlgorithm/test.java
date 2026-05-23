package test4_Algorithm.sortingAlgorithm;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {100, 10, 80, 50, 20, 40, 70, 60, 30, 90};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(binarySearch(arr, 50));
    }
    public static int binarySearch(int arr[], int number) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // 计算中间索引
            int middle = (left + right) / 2;
            if (number < arr[middle]) {
                right = middle - 1;
            } else if (number > arr[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}