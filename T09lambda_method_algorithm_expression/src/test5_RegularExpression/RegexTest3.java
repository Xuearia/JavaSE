package test5_RegularExpression;

import java.util.Scanner;

/**
 * 正则表达式测试类，用于验证用户输入的电话号码、邮箱和时间是否合法。
 */
public class RegexTest3 {

    public static void main(String[] args) {
        // 校验用户输入的电话号码是否合法
        //checkPhone();

        // 校验用户输入的邮箱格式是否正确
        checkmailbox();
    }


    public static void checkPhone() {
        while (true) {
            System.out.println("请您输入您的电话号码(手机|座机): ");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();

            // 使用正则表达式校验电话号码格式
            if (phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")) {
                System.out.println("您输入的号码格式正确~~~");
                break;
            } else {
                System.out.println("您输入的号码格式不正确~~~");
            }
        }
    }

    /**
     * 验证用户输入的邮箱格式是否合法。
     * 支持常见邮箱格式，例如：
     * - user@example.com
     * -czk132@163.com.cn
     * - 用户名部分：至少2个字符 \w{2,}
     * - @ 符号必须存在
     * - 域名主机名部分：2~20个字符 \w{2,20}
     * - 可选域名后缀：1到2层，如 .com 或 .co.uk
     */
    public static void checkmailbox() {
        while (true) {
            System.out.println("请您输入您的邮箱: ");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();

            // 使用正则表达式校验电话号码格式
            if (phone.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")) {
                System.out.println("您输入的邮箱格式正确~~~");
                break;
            } else {
                System.out.println("您输入的邮箱格式不正确~~~");
            }
        }
    }

}
