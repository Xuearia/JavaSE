package test4_数学;

public class Math_Demo {
    public static void main(String[] args) {

        //public static double abs(double a)  取绝对值（结果为正数）
        System.out.println("---------取绝对值-----------");
        System.out.println(Math.abs(-20));//20
        System.out.println(Math.abs(123));//123
        System.out.println(Math.abs(-3.14));//3.14

        //public static double ceil(double a) 向上取整
        System.out.println("---------向上取整-----------");
        System.out.println(Math.ceil(3.1415925));//4.0
        System.out.println(Math.ceil(3.0000001));//4.0
        System.out.println(Math.ceil(3));//3.0

        //public static double floor(double a)向下取整
        System.out.println("---------向下取整-----------");
        System.out.println(Math.floor(3.1415926));//3.0
        System.out.println(Math.floor(3.0000001));//3.0
        System.out.println(Math.floor(3));//3.0

        //public static long round(double a)  四舍五入
        System.out.println("---------四舍五入-----------");
        System.out.println(Math.round(3.4999));//3
        System.out.println(Math.round(3.5432));//4
        System.out.println(Math.round(6.0));//6

        //public static int max(int a, int b) 分别取两个数中的较大值
        System.out.println("---------取最大值-----------");
        System.out.println(Math.max(10,20));

        //public static int min(int a, int b) 分别取两个数中的较小值
        System.out.println("---------取最小值-----------");
        System.out.println(Math.min(10,20));

        //public static double pow(double a, double b)	取次方，计算 a 的 b 次幂
        System.out.println("---------取次方数-----------");
        System.out.println(Math.pow(2,3));//2的3次方 8.0
        System.out.println(Math.pow(3,2));//3的2次方 9.0

        //public static double random()	取随机数，返回值范围在 [0.0 , 1.0)（包含 0.0 但不包含 1.0）
        System.out.println(Math.random());

    }
}
