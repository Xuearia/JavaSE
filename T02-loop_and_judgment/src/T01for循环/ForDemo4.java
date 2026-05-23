package T01for循环;

public class ForDemo4 {
    public static void main(String[] args) {
        // 求1到100之间的偶数和，并把求和结果在控制台输出
        int sum = 0; // 初始化累加和为0
        for (int i = 1; i <= 100; i++) { // 使用for循环从1遍历到100
            if (i % 2 == 0) { // 判断当前值i是否为偶数
                sum += i; // 如果是偶数，将其加到sum上
            }
        }
        System.out.println("1-100的偶数和为:" + sum); // 输出最终的偶数和2550
    }
}
