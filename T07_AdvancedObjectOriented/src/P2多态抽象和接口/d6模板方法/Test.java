package P2多态抽象和接口.d6模板方法;
public class Test {
    public static void main(String[] args) {
        System.out.println("=== 制作鸡蛋饼 ===");
        BreakfastMaker eggPancake = new EggPancakeMaker();
        eggPancake.makeBreakfast(); // 执行模板流程

        System.out.println("\n=== 制作三明治 ===");
        BreakfastMaker sandwich = new SandwichMaker();
        sandwich.makeBreakfast(); // 执行模板流程
    }
}    