package T03练习;

import java.util.Scanner;

public class 练习8_评委打分 {
    public static void main(String[] args) {
        // 目标：完成评委打分的案例。
        // 1、定义一个动态初始化的数组，负责后期存储6个评委的打分

        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);
        //总分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个评委打分:");
            int next = sc.nextInt();
            arr[i] = next;
            sum += arr[i];
        }
        //平均分
        double avg = sum / arr.length;
        //遍历打分
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("平均分为：" + avg);
    }


}
