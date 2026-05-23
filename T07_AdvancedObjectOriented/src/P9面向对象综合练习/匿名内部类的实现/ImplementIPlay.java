package P9面向对象综合练习.匿名内部类的实现;
/**
 * 1. 接口IPlay中有一个方法playGame()，在测试类中如何调用该方法？
 * 要求1.创建子类实现接口的方式实现
 * 要求2:用匿名内部类实现*/
public class ImplementIPlay{

/*    IPlay iPlay = new IPlay(){
        @Override
        public void playGame() {
            System.out.println("正在玩游戏");
        }
    };
*/

    IPlay iPlay = ()->
            System.out.println("正在玩游戏");
}
