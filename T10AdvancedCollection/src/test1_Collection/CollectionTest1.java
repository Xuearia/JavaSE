package test1_Collection;

import java.util.ArrayList;
import java.util.HashSet;

//认识Collection体系的特点
public class  CollectionTest1 {
    public static void main(String[] args) {

        //认识一下Collection体系
        //list系列集合:有序,可重复,可以索引查找和获取内容
        ArrayList<String> list = new ArrayList<>();

        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java3");
        list.get(2);//可以以索引形式获取集合中的元素
        System.out.println(list);//输出:[java1, java2, java1, java3]

        //set系列集合:无序,不可重复,不可以索引查找和获取内容
        HashSet<String> set = new HashSet<>();
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java3");
        //set.get(2)   set集合没有索引,所以报错
        System.out.println(set);//[java3, java2, java1]

    }
}
