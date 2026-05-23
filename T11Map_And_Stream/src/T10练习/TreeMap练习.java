package T10练习;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

//需求1:
//键:整数表示id
//值:字符串表示商品名称要求:按照id的升序排列、按照id的降序排列
public class TreeMap练习 {
    public static void main(String[] args) {
        //直接在（）new Comparator
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(5, "薯片");
        tm.put(2, "雪碧");
        tm.put(1, "可乐");
        tm.put(3, "汽水");
        tm.put(4, "面包");

        System.out.println(tm);
    }
}
