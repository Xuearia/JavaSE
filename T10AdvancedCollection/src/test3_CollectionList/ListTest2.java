package test3_CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {

        //List集.合的遍历
        List<String> list = new ArrayList<>();

        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒羊羊");
        list.add("懒羊羊");
        list.add("灰太狼");
        list.add("红太狼");
        System.out.println(list);

        //1.增强for循环遍历
        System.out.println("增强for循环遍历");
        for (String s : list) {
            System.out.println(s);
        }

        //2.使用迭代器进行遍历
        System.out.println("使用迭代器进行遍历");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //3.使用普通for循环
        System.out.println("使用普通for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            String index = list.get(i);
            System.out.println(index);
        }

        //4.使用Lamba表达式遍历
        System.out.println("使用Lamba表达式遍历");
        // list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
