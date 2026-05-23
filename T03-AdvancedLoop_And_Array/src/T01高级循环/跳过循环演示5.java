package T01高级循环;

import java.util.Random;
import java.util.Scanner;

public class 跳过循环演示5 {
    /**
     * 主方法执行猜数字游戏
     * 随机生成一个1到100之间的数字，然后让用户猜测这个数字
     * 用户每次猜测后，程序会给出提示，直到用户猜对为止
     */
    public static void main(String[] args) {
        Random a = new Random();
        int random = a.nextInt(100) + 1;

        System.out.println("请输入1-100:");
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            int input = sc.nextInt();
            count++;
            System.out.println("第" + count + "次");

            if (input == random) {
                System.out.println("猜对了");
                break;
            } else if (input > random) {
                System.out.println("猜大了");
            } else if (input < random) {
                System.out.println("猜小了");
            }
        }
    }
}
