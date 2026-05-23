package T03作业;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        /*
        需求：
        键盘录入两个数字，表示一个范围。
        统计这个范围中既能被3整除，又能被5整除的数字有多少个？
        */

        // 创建Scanner对象，用于从键盘输入获取数据
        Scanner sc = new Scanner(System.in);
        // 提示用户输入第一个范围值，并接收输入
        System.out.println("请输入第一个范围:");
        int num1 = sc.nextInt();
        // 提示用户输入第二个范围值，并接收输入
        System.out.println("请输入第二个范围:");
        int num2 = sc.nextInt();

        // 初始化计数器，用于统计满足条件的数字数量
        int count = 0;
        // 确定范围的最小值和最大值
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        // 使用for循环遍历从最小范围到最大范围的所有数字
        for (int i = min; i <= max; i++) {
            // 检查当前数字是否同时被3和5整除，如果是，则计数器加一
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        // 输出范围内满足条件的数字总数
        System.out.println(min + "~" + max + "范围内能被3和5同时整除的数字有" + count + "个");
    }
}
