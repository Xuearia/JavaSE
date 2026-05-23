package T01for循环;

import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args) {
        /*
        需求：
        键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？
        */

        // 创建Scanner对象，用于从键盘输入获取数据
        Scanner sc = new Scanner(System.in);
        // 提示用户输入最小范围值，并接收输入
        System.out.println("请输入最小范围:");
        int mini = sc.nextInt();
        // 提示用户输入最大范围值，并接收输入
        System.out.println("请输入最大范围:");
        int max = sc.nextInt();

        // 初始化计数器，用于统计满足条件的数字数量
        int count = 0;
        // 使用for循环遍历从最小范围到最大范围的所有数字
        for (; mini <= max; mini++) {
            // 检查当前数字是否同时被3和5整除，如果是，则计数器加一
            if (mini % 3 == 0 && mini % 5 == 0) {
                count++;
            }
        }
        // 输出范围内满足条件的数字总数
        System.out.println(mini + "~" + max + "范围内能被3和5同时整除数字" + count + "个");

    }
}
