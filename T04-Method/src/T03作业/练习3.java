package T03作业;

import java.util.Scanner;

public class 练习3 {
    public static void main(String[] args) {
        //在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
        //请输入第一个整数：10
        //请输入第二个整数：30
        //请输入第三个整数：20
        //从大到小的顺序是： 30 20 10

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入二个整数:");
        int num2 = sc.nextInt();
        System.out.println("请输入三个整数:");
        int num3 = sc.nextInt();

        int max = getMax(num1, num2, num3);
        int min = getMin(num1, num2, num3);
        int mid = (num1 + num2 + num3) - max - min;

        System.out.println(max +" "+ min +" "+ mid);
    }

    //返回最大值函数
    public static int getMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }

    //返回最小值函数
    public static int getMin(int a, int b, int c) {
        int temp = a < b ? a : b;
        int min = temp < c ? temp : c;
        return min;
    }
}
