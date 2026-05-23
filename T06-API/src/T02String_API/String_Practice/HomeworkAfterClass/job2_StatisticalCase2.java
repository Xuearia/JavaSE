package T02String_API.String_Practice.HomeworkAfterClass;


import java.util.Scanner;

public class job2_StatisticalCase2 {
    /*请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
    比如：Hello$12%34%%5W--$orld中
    大写字母：2个，小写字母：6个，数字：5个,字符:7个。*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input = sc.nextLine();

        int capitalLetters = 0;
        int lowercaseLetter = 0;
        int digital = 0;
        int specialCharacters = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // 判断字符是否为大写字母
            if (Character.isUpperCase(ch)) {
                capitalLetters++;
            }
            // 判断字符是否为小写字母
            else if (Character.isLowerCase(ch)) {
                lowercaseLetter++;
            }
            // 判断字符是否为数字
            else if (Character.isDigit(ch)) {
                digital++;
            }
            // 如果字符不属于上述任何类别，则认为是特殊字符
            else {
                specialCharacters++;
            }
        }
        System.out.printf("大写字母有:%d个 ", capitalLetters);
        System.out.printf("小写字母:%d个 ", lowercaseLetter);
        System.out.printf("数字:%d个 ", digital);
        System.out.printf("其他字符:%d个 ", specialCharacters);
    }
}

