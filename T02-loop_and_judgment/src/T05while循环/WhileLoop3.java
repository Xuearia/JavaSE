package T05while循环;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        // 判断回文数
        // 用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数来判断是否为回文数:");
        int input = sc.nextInt(); // 获取用户输入的整数

        // 初始化变量
        int num = 0; // 用于存储倒序拼接后的数字
        int results = input; // 保存原始输入的数字，用于后续比较

        // 使用 while 循环将输入的数字倒序拼接
        while (input != 0) {
            int ge = input % 10; // 获取当前数字的最后一位
            input = input / 10; // 去掉当前数字的最后一位
            num = num * 10 + ge; // 将最后一位添加到倒序拼接的数字中
        }

        // 判断倒序拼接后的数字是否与原始数字相同
        if (num == results) {
            // 输出结果
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
/*初始状态：
input = 12345
results = 12345
num = 0
第一次循环：
ge = input % 10 = 12345 % 10 = 5
input = input / 10 = 12345 / 10 = 1234
num = num * 10 + ge = 0 * 10 + 5 = 5
第二次循环：
ge = input % 10 = 1234 % 10 = 4
input = input / 10 = 1234 / 10 = 123
num = num * 10 + ge = 5 * 10 + 4 = 54
第三次循环：
ge = input % 10 = 123 % 10 = 3
input = input / 10 = 123 / 10 = 12
num = num * 10 + ge = 54 * 10 + 3 = 543
第四次循环：
ge = input % 10 = 12 % 10 = 2
input = input / 10 = 12 / 10 = 1
num = num * 10 + ge = 543 * 10 + 2 = 5432
第五次循环：
ge = input % 10 = 1 % 10 = 1
input = input / 10 = 1 / 10 = 0
num = num * 10 + ge = 5432 * 10 + 1 = 54321
循环结束：
num = 54321
results = 12345
比较结果：
num 和 results 不相等（54321 ≠ 12345）。
因此，程序会输出“不是回文数”。*/
