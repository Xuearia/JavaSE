package test2_Collection遍历;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class 遍历图书 {
    public static void main(String[] args) {
        Collection<图书> c  = new ArrayList<>();

        // 添加图书记录（评分超过10.0的会被自动限制为10.0）
        c.add(new 图书("《哈利波特》", 9.5, 12.5, "JK罗琳"));
        c.add(new 图书("《Java编程思想》", 8.5, 8.0, "教材"));
        c.add(new 图书("《Effective Java》", 7.8, 7.5, "教材"));
        c.add(new 图书("《百年孤独》", 6.5, 9.0, "小说"));
        c.add(new 图书("《红楼梦》", 5.5, 9.8, "古典文学"));
        c.add(new 图书("《三体》", 8.8, 9.5, "科幻"));
        c.add(new 图书("《活着》", 4.5, 9.2, "小说"));
        c.add(new 图书("《Python编程从入门到实践》", 7.2, 8.5, "教材"));

        c.forEach(new Consumer<图书>() {
            @Override
            public void accept(图书 变量) {
                System.out.println(变量);
            }
        });

        //c.forEach(任意变量->System.out.println(变量));

        //c.forEach(System.out::println);

    }
}

