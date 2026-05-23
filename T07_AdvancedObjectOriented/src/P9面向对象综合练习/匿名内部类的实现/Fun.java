package P9面向对象综合练习.匿名内部类的实现;

public class Fun {
    public static void main(String[] args) {


// 使用匿名内部类直接在 new 的时候实现接口
        IPlay p = new IPlay() {
            @Override
            public void playGame() {
                System.out.println("通过匿名内部类实现：正在玩游戏");
            }
        };
        p.playGame();

        // 补充：因为 IPlay 是函数式接口（只有一个抽象方法），
        // 就像你写的，可以用 Lambda 简写为：
        // IPlay p2 = () -> System.out.println("通过Lambda实现：正在玩游戏");
        // p2.playGame();
    }

}

