package test2_Collection遍历;


import java.util.ArrayList;
import java.util.Collection;

public class Test2增强for循环遍历 {
    public static void main(String[] args) {
        //增强for循环遍历
        Collection<String> c = new ArrayList<>();
        c.add("喜羊羊");
        c.add("美羊羊");
        c.add("懒羊羊");
        c.add("灰太狼");
        c.add("红太狼");
        System.out.println(c);

        //格式: for(元素数据类型 变量名 : 集合名){}
        //增强for循环相当于简化迭代器遍历集合
        //快捷输入法:c.for
        for (String s : c) {
            System.out.println(s);
        }

        //数组遍历
        String[] arr = {"张三", "李四", "王五"};
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
