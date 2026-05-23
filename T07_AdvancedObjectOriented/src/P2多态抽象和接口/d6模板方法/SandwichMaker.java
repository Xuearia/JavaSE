package P2多态抽象和接口.d6模板方法;


public class SandwichMaker extends BreakfastMaker {
    @Override
    protected void prepareIngredients() {
        System.out.println("准备面包片、火腿、生菜、芝士...");
    }

    @Override
    protected void cook() {
        System.out.println("煎火腿，组装三明治...");
    }
}    