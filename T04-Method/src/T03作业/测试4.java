package T03作业;

import java.util.Scanner;

public class 测试4 {
    public static void main(String[] args) {
        // 判断一个数字是否在数组中存在
        int[] number = {1, 4, 6, 8, 12, 7, 11, 9};
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int numToFind = sc.nextInt();
        boolean exists = exist(number, numToFind);
        System.out.println("数字 " + numToFind + " 是否存在数组中: " + exists);
    }

    public static boolean exist(int[] arr, int num1) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                return true;
            }
        }
        return false;
    }
}
