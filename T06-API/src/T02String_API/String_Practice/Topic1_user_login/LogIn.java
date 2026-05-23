package T02String_API.String_Practice.Topic1_user_login;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 3;
        while (count > 0) {

            System.out.println("-----登录系统-----");
            System.out.println("请输入用户名:");
            String user = input.next();

            System.out.println("请输入密码:");
            String password = input.next();

            System.out.println("----------------");
            boolean judgment = check(user, password);
            if (judgment == true) {
                System.out.println("欢迎进入系统");
                break;
            } else {
                count--;
                System.out.println("登录失败,您还有" + count + "次机会");

            }

        }
    }

    public static boolean check(String user, String password) {
/*
        //常规写法
        if ("czk".equals(user) && "123456".equals(password)) {
            return true;
        } else {
            return false;
        }
*/
        //更简洁的写法
        return "czk".equals(user) && "123456".equals(password);
    }

}
