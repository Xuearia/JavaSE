package T03作业;

public class 练习4 {

    public static double getAbsoluteValue(double number) {
        if (number < 0) {
            return -number; // 如果数字为负数，返回其相反数
        } else {
            return number; // 如果数字为非负数，直接返回
        }
    }
    public static void main(String[] args) {
        double testNumber1 = -12.34; // 负数测试用例
        double testNumber2 = 56.78; // 正数测试用例
        double testNumber3 = 0.0;   // 零测试用例
        double testNumber4 = -0.99; // 小负数测试用例

        System.out.println("Absolute value of " + testNumber1 + " is: " + getAbsoluteValue(testNumber1)); // 打印第一个测试用例的结果
        System.out.println("Absolute value of " + testNumber2 + " is: " + getAbsoluteValue(testNumber2)); // 打印第二个测试用例的结果
        System.out.println("Absolute value of " + testNumber3 + " is: " + getAbsoluteValue(testNumber3)); // 打印第三个测试用例的结果
        System.out.println("Absolute value of " + testNumber4 + " is: " + getAbsoluteValue(testNumber4)); // 打印第四个测试用例的结果
    }
}
