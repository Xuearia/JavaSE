package T03练习;

import java.util.Random;

public class 练习5_计数数字 {
    public static void main(String[] args) {
        /* 需求：生成10个1~100之间的随机数存入数组。
            1）求出所有数据的和
            2）求所有数据的平均数
            3）统计有多少个数据比平均值小 */

        // 创建Random对象以生成随机数
        Random random = new Random();
        // 定义一个长度为10的整数数组来存储随机数
        int[] numbers = new int[10];

        // 初始化变量来存储总和、平均值和小于平均值的数量
        int sum = 0; // 总和
        double average = 0.0; // 平均数
        int countBelowAverage = 0; // 统计比平均值小的个数

        // 使用for循环生成10个1~100之间的随机数，并计算总和
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // 生成1到100之间的随机数
            sum += numbers[i]; // 累加到总和中
            System.out.print(numbers[i] + " "); // 输出当前随机数
        }
        // 换行
        System.out.println();

        // 计算平均值，注意这里使用double类型以避免整数除法
        average = (double) sum / numbers.length;

        // 再次遍历数组，统计有多少个数小于平均值
        for (int number : numbers) {
            if (number < average) {
                countBelowAverage++;
            }
        }

        // 输出结果
        System.out.println("和为: " + sum);
        System.out.println("平均值为: " + average);
        System.out.println("比平均值小的个数有: " + countBelowAverage);
    }
}
