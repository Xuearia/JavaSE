package T02练习;

public class 数字加密 {
    public static void main(String[] args) {
        /*需求
某系统的数字密码是一个四位数，如 1983, 为了安全，需要放加密后再传输，加密规则是：对密码中的每位数，
都加 5, 再对 10 求余，最后将所有数字顺序反转，得到一串加密密后的新数，请设计出满足本需求的加密程序
        1  9  8  3
 +5     6  14  13  8
 %10    6  4  3  8
 反转    8  3  4  6
加密后的结果就是：8346*/
        System.out.println(encryption(9876));
    }

    public static String encryption(int number) {
        // 定义一个长度为 4 的数组来存储每一位数字
        int[] arr = new int[4];
        // 把输入的四位数拆分成单独的数字并存入数组
        for (int i = 3; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        // 对数组中的每个数字加 5 并对 10 求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        // 反转数组
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        // 把反转后的数组元素组合成一个字符串
        String encryptedNumber = "";
        for (int i = 0; i < arr.length; i++) {
            encryptedNumber = encryptedNumber + arr[i];
        }
        return encryptedNumber;
    }
}
