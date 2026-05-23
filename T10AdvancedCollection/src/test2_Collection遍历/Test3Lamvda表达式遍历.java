package test2_Collection遍历;
import java.util.ArrayList;
import java.util.Collection;

public class Test3Lamvda表达式遍历 {
    public static void main(String[] args) {
        // 使用Lambda表达式遍历集合
        Collection<String> c = new ArrayList<>();
        c.add("喜羊羊");
        c.add("美羊羊");
        c.add("懒羊羊");
        c.add("灰太狼");
        c.add("红太狼");
        System.out.println(c); // 输出集合内容

        // 格式：default void forEach(Consumer<? super T> action): 结合Lambda表达式遍历集合
        // 方式一：匿名内部类（原始写法）
        /*
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */

        // 方式二：Lambda 表达式简化写法
        /*
        c.forEach((s) -> {
            System.out.println(s);
        });
        */

        // 方式三：进一步简化 Lambda 表达式
        // c.forEach((s) -> System.out.println(s));

        // 方式四：使用方法引用进一步简化
        c.forEach(System.out::println);
    }
}
