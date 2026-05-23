package T02判断;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
    /*        需求：
    编写一个Java程序，模拟根据天气情况决定活动的行为。具体要求如下:
    从键盘录入一个字符串，表示当前的天气情况（“下雨”或“不下雨”）。
    根据录入的天气情况做出相应的活动选择：
    如果天气是“下雨”，则输出“看电视”。
    如果天气是“不下雨”，则输出“踢足球”。*/

    // 分析：
    // 1. 键盘录入一个字符串，表示天气情况。
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入天气情况（下雨/不下雨）");
    String weather = sc.next();

    // 2. 对天气情况进行判断
    if (weather.equals("下雨")) {
        System.out.println("看电视");
    } else {
        System.out.println("踢足球");
    }
}
}
