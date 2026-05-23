package test3_CollectionList;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        // 1. 创建 List 集合（有序、有索引、可重复）

        List<String> list = new ArrayList<>(); // 经典一行代码
        //List<String> list2 = new LinkedList<>();//与ArrayList一样

        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒羊羊");
        list.add("懒羊羊");
        list.add("灰太狼");
        list.add("红太狼");
        System.out.println(list);

        // 2. 在指定索引位置插入元素
        list.add(3, "沸羊羊");
        System.out.println(list);

        // 3. 根据索引删除元素，并返回被删除的元素
        System.out.println("被删除的元素是：" + list.remove(3));
        System.out.println(list);

        // 4. 获取指定索引处的元素
        System.out.println("索引为3的元素是：" + list.get(3));

        // 5. 修改指定索引处的元素，并返回原值
        System.out.println("修改后的元素是：" + list.set(3, "小懒羊"));
    }
}
