package test1_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest2_Api {
    public static void main(String[] args) {
        // 创建一个 Collection 集合对象，使用 ArrayList 实现
        Collection<String> c = new ArrayList<>();

        // 1. 添加元素到集合
        // public boolean add(E e): 向集合中添加元素，添加成功返回 true
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        System.out.println("添加元素后的集合: " + c);
        // 输出: [java1, java1, java2, java2, java3]

        // 2. 获取集合的大小
        // public int size(): 返回集合中元素的数量
        int size = c.size();
        System.out.println("集合的大小: " + size);// 输出: 5

        // 3. 判断集合中是否包含某个元素
        // public boolean contains(Object obj): 判断集合中是否包含指定元素，包含返回 true
        boolean containsJava1 = c.contains("java1");
        boolean containsJavaUppercase = c.contains("Java1");
        System.out.println("集合是否包含 'java1': " + containsJava1);// 输出: true
        System.out.println("集合是否包含 'Java1': " + containsJavaUppercase);// 输出: false

        // 4. 删除某个元素
        // public boolean remove(E e): 删除集合中第一个匹配的指定元素，删除成功返回 true
        boolean removed = c.remove("java1");
        System.out.println("是否成功删除 'java1': " + removed);// 输出: true
        System.out.println("删除 'java1' 后的集合: " + c);// 输出: [java1, java2, java2, java3]

        // 5. 清空集合的元素
        // public void clear(): 移除集合中的所有元素
        c.clear();
        System.out.println("清空后的集合: " + c);// 输出: []

        // 6. 判断集合是否为空
        // public boolean isEmpty(): 判断集合是否为空，为空返回 true
        //c.add("java1");
        boolean isEmpty = c.isEmpty();
        //添加

        System.out.println("集合是否为空: " + isEmpty);// 输出: true

        // 再次添加元素以便后续操作
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");

        // 7. 把集合转换为数组
        // public Object[] toArray(): 将集合中的元素转换为 Object 类型的数组
        Object[] array = c.toArray();
        System.out.println("集合转换为 Object 数组: " + Arrays.toString(array));// 输出: [java1, java2, java2, java3]

        // 8. 把集合转换为指定类型的数组
        // public <T> T[] toArray(T[] a): 将集合中的元素转换为指定类型的数组
        String[] array1 = c.toArray(new String[c.size()]);
        System.out.println("集合转换为 String 数组: " + Arrays.toString(array1));// 输出: [java1, java2, java2, java3]

        // 9. 把一个集合中的元素添加到另一个集合中
        // public boolean addAll(Collection<? extends E> c): 将指定集合中的所有元素添加到当前集合中(数据类型要匹配)
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");

        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");

        c1.addAll(c2);
        System.out.println("将 c2 集合元素添加到 c1 后的 c1 集合: " + c1);// 输出: [java1, java2, java3, java4]
        System.out.println("c2 集合: " + c2);// 输出: [java3, java4]
    }
}