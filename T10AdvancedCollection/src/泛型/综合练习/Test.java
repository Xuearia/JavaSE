package 泛型.综合练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<泰迪> dog1 = new ArrayList<>();
        dog1.add(new 泰迪("Teddy", 5));

        ArrayList<波斯猫> cat1 = new ArrayList<>();
        cat1.add(new 波斯猫("笨比", 3));

        keepDog(dog1);
        //keepDog(cat1);

        keepCat(cat1);
        //keepCat(dog1);



    }

    /**
     * 要求1：能养所有品种的猫，但不能养狗
     * 核心语法：<? extends Cat> 表示泛型的类型必须是 Cat 本身，或者是 Cat 的子类（波斯猫、狸花猫）
     */
    public static void keepCat(ArrayList<? extends 猫> list) {
        // 遍历集合，由于上限是 Cat，所以拿出来的对象至少是个 Cat，一定有继承自 Animal 的 eat 方法
        for (猫 cat : list) {
            cat.eat();
        }
    }

    /**
     * 要求2：能养所有品种的狗，但不能养猫
     * 核心语法：<? extends Dog> 表示最高只能是 Dog
     */
    public static void keepDog(ArrayList<? extends 狗> list) {
        for (狗 dog : list) {
            dog.eat();
        }
    }

    /**
     * 要求3：能养所有的动物，但不能传递其他类型（比如传个 ArrayList<String> 进去就会报错）
     * 核心语法：<? extends Animal> 表示最高只能是 Animal
     */
    public static void keepAnimal(ArrayList<? extends 动物> list) {
        for (动物 animal : list) {
            animal.eat(); // 多态的威力：会自动调用具体品种的 eat 方法
        }
    }
}
