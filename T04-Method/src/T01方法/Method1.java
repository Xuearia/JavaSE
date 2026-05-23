package T01方法;

public class Method1 {
    public static void main(String[] args) {
        // 目标：理解方法的参数传递机制：值传递。
        int a = 10;
        change(a); // change(10);
        System.out.println("main:" + a); // 10

    }

    public static int change(int a) {
        System.out.println("change1:" + a); // 10
        a = 20;
        System.out.println("change2:" + a); // 20

        return a;
    }
}

