package T02String_API.String_Practice.HomeworkAfterClass;

public class job1_StringSymmetry {
    /*    请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
        例如："abcba"、"上海自来水来自海上"均为对称字符串。*/
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        // 调用 symmetryDetection 方法判断字符串是否对称，并输出结果
        System.out.println(symmetryDetection(str));
    }

    public static boolean symmetryDetection(String s) {
        // 处理空字符串，空字符串可视为对称字符串
        if (s == null) {
            return false;
        }
        // 使用双指针法，i 指向字符串开头，j 指向字符串结尾
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            // 比较对应位置的字符，如果不相等则字符串不对称
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        // 所有对应位置的字符都相等，字符串对称
        return true;
    }
}