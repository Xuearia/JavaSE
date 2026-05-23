package T01方法;

public class Method2 {
    public static void main(String[] args) {
        //方法的重载

        launch();
        launch("米国");
        launch(999, "米国");

    }

    public static void launch() {
        System.out.println("默认给岛国发射一枚导弹");
    }

    public static void launch(String a) {
        System.out.println("给" + a + "发射一枚导弹");
    }

    public static void launch(int b, String a) {
        System.out.println("给" + a + "发射" + b + "枚导弹");

    }
}

