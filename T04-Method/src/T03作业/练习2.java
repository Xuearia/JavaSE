package T03作业;

public class 练习2 {
    public static void main(String[] args) {
        //定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
        System.out.println(getMax(4,10,19));
    }

    public static int getMax(int num1, int num2, int num3) {
        int max = num1;
        if (num1 < num2) {
            max = num2;
        }
        if (num2 < num3) {
            max = num3;
        }
        return max;
    }

}

