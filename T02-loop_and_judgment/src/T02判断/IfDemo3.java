package T02判断;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
     /*   需求：
        在实际开发中，电影院选座也会使用到if判断。
        假设某影院售卖了100张票，票的序号为1~100。
        其中奇数票号坐左侧，偶数票号坐右侧。
        键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示：
        如果票号为奇数，那么打印坐左边。
		如果票号为偶数，那么打印坐右边。*/

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的号码:");
        int Number = sc.nextInt();
        //票号范围
        if (Number >= 1 && Number <= 100) {
            //判断奇数和偶数
            if (Number % 2 == 0){
                System.out.println("坐右边");
            }else {
                System.out.println("坐左边");
            }
        //票号不在范围的提示
        }else {
            System.out.println("输入错误!请输入1~100的整数号码!");
        }
    }
}
