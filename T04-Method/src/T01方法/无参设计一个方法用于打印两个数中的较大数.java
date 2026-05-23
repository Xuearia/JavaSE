package T01方法;

public class 无参设计一个方法用于打印两个数中的较大数 {
    /**
     * 打印两个固定数中的较大数
     */
    public static void getMax(int n,int k) {
        int a = n; // 定义第一个数字
        int b = k; // 定义第二个数字
        int max;    // 定义最大值变量

        // 比较两个数字并确定较大值
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // 打印较大值
        System.out.println("较大的数是: " + max);
    }

    public static void main(String[] args) {
        // 调用getMax方法
        getMax(12,20);
    }
}
