package P2多态抽象和接口.d6模板方法;

public abstract class BreakfastMaker {
    // 模板方法：定义早餐制作流程（固定骨架）
    public final void makeBreakfast() { // final 防止子类修改流程
        prepareIngredients(); // 步骤1：准备食材（抽象方法，子类实现）
        cook(); // 步骤2：烹饪（抽象方法，子类实现）
        plateFood(); // 步骤3：装盘（具体方法，固定不变）
    }

    // 抽象方法：准备食材
    protected abstract void prepareIngredients();

    // 抽象方法：烹饪
    protected abstract void cook();

    // 具体方法：装盘（所有早餐通用）
    protected void plateFood() {
        System.out.println("将早餐装入盘子...");
    }
}    