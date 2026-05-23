package test5_Collection异常;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合的并发修改异常
public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("懒羊羊");
        list.add("暖羊羊");
        list.add("暖羊羊");
        list.add("喜羊羊");
        list.add("慢羊羊");
        list.add("沸羊羊");
        list.add("灰太狼");

        //迭代器遍历集合，删除集合中包含“暖”的元素
        //报错原因: 集合的迭代器遍历过程中，不能修改集合，否则会报错
        //增强for循环没有解决的办法建议遍历集合，不用他去修改
 /*       Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("暖")) {//contains()方法，判断字符串中是否包含某个字符或字符串
                list.remove(name);
            }
        }*/


        System.out.println("--------------------解决方案---------------------");
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("暖")) {
//                list.remove(name);
//                i--;
//            }
//        }
//        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("暖")) {
                // list.remove(name);//并发修改异常
                it.remove();// 迭代器删除元素,没删一个，索引值减一  相当于自动i--
            }
        }
        System.out.println(list);
    }
}
