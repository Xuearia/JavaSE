package T04switch循环;

import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        // 创建一个 Scanner 对象以读取用户输入
        Scanner sc = new Scanner(System.in);

        // 显示机票预订菜单
        while (true) {
            System.out.println("***********************");
            System.out.println("机票预订菜单");
            System.out.println("1. 机票查询");
            System.out.println("2. 机票预订");
            System.out.println("3. 机票改签");
            System.out.println("4. 退出服务");
            System.out.println("***********************");
            // 提示用户输入选项
            System.out.print("请选择一个选项: ");
            int choice = sc.nextInt();

            // 使用 switch 语句根据用户的选择执行相应的操作
            switch (choice) {
                case 1:
                    System.out.println("您选择了机票查询");
                    break;
                // 当用户选择 1 时，输出“您选择了机票查询”
                case 2:
                    System.out.println("您选择了机票预订");
                    break;
                // 当用户选择 2 时，输出“您选择了机票预订”
                case 3:
                    System.out.println("您选择了机票改签");
                    break;
                // 当用户选择 3 时，输出“您选择了机票改签”
                case 4:
                    System.out.println("退出服务");
                    break;
                // 当用户选择 4 时，输出“退出服务”
                default:
                    System.out.println("无效的选项，请重新选择");
                    break;
                // 当用户选择不在 1 到 4 之间时，输出“无效的选项，请重新选择”
            }
        }
    }
}
