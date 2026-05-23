package T02练习;

import java.util.Random;
import java.util.Scanner;

public class 随机验证码 {
    public static void main(String[] args) {
        // 开发一个程序，可以生成多少次,多少位数的验证码，每位可以是数字、大小写字母。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要生成几位数的验证码:");
        int length = scanner.nextInt();
        System.out.println("请输入你要生成几次:");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            String generate = verificationCode(length);
            System.out.println("第" + count + "次生成,验证码为:" + generate);
        }
    }

    public static String verificationCode(int length) {
        //生成一个字符串用于串联下方生成的字符
        String code = "";
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            int type = random.nextInt(3) + 1;
            switch (type) {
                case 1:
                    //生成数字0-9的数字
                    code += random.nextInt(9);
                    break;
                case 2:
                    //生成随机大写字母
                    // 加上 65 后，范围变为 65 到 90，对应的是大写字母 'A' 到 'Z'。
                    code += (char) (random.nextInt(26) + 65);

                    break;
                case 3:
                    //生成随机小写字母
                    //加上 97 后，范围变为 97 到 122，对应的是小写字母 'a' 到 'z'。
                    code += (char) (random.nextInt(26) + 97);
                    break;
            }
        }
        return code;
    }
}