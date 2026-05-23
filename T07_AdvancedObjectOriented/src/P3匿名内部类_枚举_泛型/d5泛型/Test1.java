package P3匿名内部类_枚举_泛型.d5泛型;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 目标：认识泛型
        ArrayList list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add(12);
        // list.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
            String e = (String) list.get(i);//如果集合不定义类型默认为Object类型,必须要强制转换
            System.out.println(e);
        }

        System.out.println("-----------------------------------");
//        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>(); // JDK 1.7开始，后面的数据类型可以不声明
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
        // list1.add(new Cat());

        for (int i = 0; i < list1.size(); i++) {
            String e = list1.get(i);
            System.out.println(e);
        }

    }
}

class Cat {
}



