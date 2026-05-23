package T02String_API.String_Practice.HomeworkAfterClass;

import java.util.Scanner;

public class job3_CaseSubstitution {
    /*    请编写程序，由键盘录入一个字符串，把字符串中的所有字母都变成大写后输出,再把字符串中的所有字母变成小写后输出。
        比如：
        键盘录入字符串:Hello12345World~!#$
        控制台输出:
        转换后的大写字符串: HELLO12345WORLD~!#$
        转换后的小写字符串: hello12345world~!#$*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input = sc.nextLine();
        System.out.println(BigToSmall(input));
        System.out.println(SmallToLarge(input));

    }

    public static String BigToSmall(String a) {
        String str = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            str += ch;
        }
        return str;
    }

    public static String SmallToLarge( String b) {
        String str = "";
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            str += ch;
        }
        return str;
    }
}
