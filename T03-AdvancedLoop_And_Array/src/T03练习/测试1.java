package T03练习;

public class 测试1 {
    public static void main(String[] args) {

        //现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。

        double[] numbers = {12.9, 53.54, 75.0, 99.1, 3.14};

        double min =numbers[0];
        for (int i = 1; i < numbers.length; i++) {
           if (min > numbers[i]){
               min = numbers[i];
           }
        }
        System.out.println("最小值:"+min);
    }
}
