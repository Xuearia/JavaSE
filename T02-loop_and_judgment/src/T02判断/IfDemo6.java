package T02判断;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入比赛成绩");
            int grade = sc.nextInt();
            System.out.println("请输入性别（男/女）");
            String sex = sc.next();
            
            if (!"男".equals(sex) && !"女".equals(sex)) {
                System.out.println("输入的性别无效，请输入“男”或“女”");
                return;
            }

            if (grade >= 10) {
                if ("男".equals(sex)) {
                    System.out.println("进入男子组");
                } else {
                    System.out.println("进入女子组");
                }
            } else {
                System.out.println("淘汰");
            }
        } finally {
            sc.close();
        }
    }
}
