package T02String_API.String_Practice.Topic2_VerificationCode;

import java.util.Random;
import java.util.Scanner;

public class Random_VerificationCode2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要打印几列验证码:");
        int column = sc.nextInt();
        System.out.println(verificationCode(column));
    }

    public static String verificationCode(int n) {
        Random r = new Random();


        String codes = "";
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(3);
            switch (index) {
                case 0:
                    codes += r.nextInt(10);
                    break;
                case 1:
                    codes += (char) (r.nextInt(26) + 65);
                    break;
                case 2:
                    codes += (char) (r.nextInt(26) + 97);
                    break;
            }

        }
        return codes;
    }
}
