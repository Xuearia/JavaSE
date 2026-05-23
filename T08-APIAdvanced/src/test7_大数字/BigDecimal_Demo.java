package test7_大数字;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Demo {
    public static void main(String[] args) {
        // BigDecimal用于解决浮点型运算失真的问题
        // 展示普通的浮点型运算，结果可能会出现失真情况
        System.out.println(0.1 + 0.2); // 输出 0.30000000000000004
        System.out.println(1.0 - 0.32); // 输出 0.6799999999999999
        System.out.println(1.015 * 100); // 输出 101.49999999999999
        System.out.println(1.301 / 100); // 输出 0.013009999999999999
        System.out.println("--------------------");

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c); // 输出 0.30000000000000004，再次展示浮点型运算的精度问题

        System.out.println("--------------------");

        // 1、把他们变成字符串封装成 BigDecimal 对象来运算。
        // BigDecimal a1 =  new BigDecimal(Double.toHexString(a));
        // BigDecimal b1 =  new BigDecimal(Double.toHexString(b));
        /*推荐以下方式小数转成字符串在得到BigDecimal对象来使用(更简洁)*/
        // 使用 BigDecimal.valueOf() 方法将 double类型的变量a和b转换为 BigDecimal类型
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);

        // 加法
        // 调用 add() 方法进行 BigDecimal类型的加法运算
        BigDecimal sum = num1.add(num2);
        System.out.println("加法结果: " + sum); // 输出 0.3，BigDecimal类型的加法结果是精确的

        // 减法
        // 调用 subtract() 方法进行 BigDecimal类型的减法运算
        BigDecimal difference = num1.subtract(num2);
        System.out.println("减法结果: " + difference); // 输出 -0.1，BigDecimal类型的减法结果是精确的

        // 乘法
        // 调用 multiply() 方法进行 BigDecimal类型的乘法运算
        BigDecimal product = num1.multiply(num2);
        System.out.println("乘法结果: " + product); // 输出 0.02，BigDecimal类型的乘法结果是精确的

        // 除法
        // 调用 divide() 方法进行 BigDecimal类型的除法运算，保留两位小数，采用四舍五入的舍入模式
        BigDecimal quotient = num1.divide(num2, 2, RoundingMode.HALF_UP);
        System.out.println("除法结果: " + quotient); // 输出 0.50，BigDecimal类型的除法结果是精确且按要求保留两位小数的

        // 这一步是为了将 BigDecimal类型的精确计算结果转换为普通的 double类型
        // 以便在需要使用 double类型数据的场景中使用
        double d = quotient.doubleValue();
        System.out.println(d); // 输出 0.5，将 BigDecimal类型转换为 double类型后的值
    }
}