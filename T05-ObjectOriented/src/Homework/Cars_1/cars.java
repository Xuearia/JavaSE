package Homework.Cars_1;

public class cars {
    //类就像是一个模板，描述了一类事物的特征和行为；对象则是根据这个模板创建出来的具体实例。
    //比如，我们要描述 “汽车” 这类事物，创建一个 Car 类，它有 “颜色” 和 “品牌” 这些特征，还有 “启动” 这个行为。
    String brand;//品牌
    String color;//颜色

    void method() {
        System.out.printf("%s品牌的%s汽车启动了", brand, color);
    }

    public static void main(String[] args) {
        cars c = new cars();
        c.brand = "宝马";
        c.color = "红色";
        c.method();
        //Cars 类是模板，c 是根据这个模板创建的具体对象。我们给 method 对象的 color 和 brand 赋值，然后调用它的 start 方法。
    }
}
