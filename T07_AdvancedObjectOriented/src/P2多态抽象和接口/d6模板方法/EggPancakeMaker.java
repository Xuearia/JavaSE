package P2多态抽象和接口.d6模板方法;


public class EggPancakeMaker extends BreakfastMaker {
    @Override
    protected void prepareIngredients() {
        System.out.println("准备面粉、鸡蛋、葱花...");
    }

    @Override
    protected void cook() {
        System.out.println("搅拌面糊，煎制鸡蛋饼...");
    }
}    