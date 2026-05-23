package T03作业;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // 让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数:");
        int a = sc.nextInt();
        System.out.println("请输入第2个数:");
        int b = sc.nextInt();
        System.out.println("请输入第3个数:");
        int c = sc.nextInt();


        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

//        if (max < b) {
//            max = b;
//        }if (max < c) {
//            max = c;
//        }
       System.out.println(max + "最大");


    }
}
