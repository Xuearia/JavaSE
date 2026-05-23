package T03练习;

public class 测试6 {
    public static void main(String[] args) {
    /*
    * 需求:
	现有一个整数数组{100,50,90,60,80,70}。
	请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）*/

        int[] arr = {100, 50, 90, 60, 80, 70};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }  if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("最大值是:" + max);
        System.out.println("最小值是:" + min);
        int avg =(sum-(min+max))/(arr.length-2);
        System.out.println("去除最大值和最小值后,平均值为:"+avg);
    }
}
