package T01for循环;

public class ForDemo3 {
    public static void main(String[] args) {
        // 求1到100的和
        int sum = 0; // 初始化累加和为0
        for (int i = 1; i <= 100; i++) { // 使用for循环从1遍历到100
            sum += i; // 每次循环将当前值i加到sum上
        }
        System.out.println(sum); // 输出最终的累加和
    }
}
