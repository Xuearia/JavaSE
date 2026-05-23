package T01方法;

public class MethodDemo5 {
    public static void main(String[] args) {
        //方法的调用

        //1.直接调用
        getSum(1, 2, 3);//用于没有返回值

        //2.赋值调用
        int sum = getSum(1, 2, 3);
        System.out.println(sum);

        //3.输出调用
        System.out.println(getSum(1, 2, 3));
    }

    public static int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}

