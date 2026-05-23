package T04switch循环;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        /*
        需求：键盘录入星期数，显示今天的减肥活动。
        星期一：跑步
        星期二：游泳
        星期三：慢走
        星期四：动感单车
        星期五：拳击
        星期六：爬山
        星期日：好好吃一顿
        */

        // 创建Scanner对象以读取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期一~星期日:");
        String week = sc.next();

        // 使用switch语句根据输入的星期数显示相应的减肥活动
        switch (week) {
            case "星期一":
                System.out.println("跑步");
                break;
            case "星期二":
                System.out.println("游泳");
                break;
            case "星期三":
                System.out.println("慢走");
                break;
            case "星期四":
                System.out.println("动感单车");
                break;
            case "星期五":
                System.out.println("拳击");
                break;
            case "星期六":
                System.out.println("爬山");
                break;
            case "星期日":
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入错误!");
                break;
        }
    }
}
