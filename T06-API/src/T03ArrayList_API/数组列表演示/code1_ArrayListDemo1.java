package T03ArrayList_API.数组列表演示;

import java.util.ArrayList;

public class code1_ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建一个存储 String 类型数据的集合
        ArrayList<String> list = new ArrayList<>();

        // 1. 向集合添加数据
        list.add("楷楷");
        list.add("18");
        list.add("唱跳rap篮球");
        System.out.println(list);

        // 2. 向指定索引添加数据
        list.add(2, "男");
        System.out.println(list);

        // 3. 返回指定索引的数据 例:需要 list 里的 "18"
        System.out.println(list.get(1));

        // 4. 返回集合中数据的个数
        System.out.println(list.size());

        // 5. 删除指定索引处的数据 例:删除 "男"
        System.out.println(list.remove(2)); // 返回被删除的数据
        System.out.println(list);
        list.add(2, "男"); // 添加回删除的 "男"

        // 6. 删除指定名称的数据 例:删除 "18"
        list.remove("18");
        System.out.println(list);
        list.add(1, "18"); // 添加回删除的 "18"

        // 7. 修改指定索引处的数据,并返回修改的数据 例:把 "楷楷" 改为 "臭楷楷"
        list.set(0, "臭楷楷");
        System.out.println(list);
    }
}