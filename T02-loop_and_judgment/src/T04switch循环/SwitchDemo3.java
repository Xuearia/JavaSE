package T04switch循环;

public class SwitchDemo3 {
    public static void main(String[] args) {

        //switch 穿透省略写法
        //案例:

        int week = 3;
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
