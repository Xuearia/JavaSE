package test2_Collection遍历;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1迭代器遍历 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("喜羊羊");
        c.add("美羊羊");
        c.add("懒羊羊");
        c.add("灰太狼");
        c.add("红太狼");
        System.out.println(c);
        //c= [灰太狼, 懒羊羊, 美羊羊, 喜羊羊, 红太狼]

        //使用迭代器遍历集合
        //1.从集合中获取迭代器对象
        Iterator<String> it = c.iterator();//iterator()方法返回一个迭代器对象，迭代器对象可以遍历集合
        //快捷输入法:c.iterator()
/*        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*///我们发现这样取下去如果有1000行的数据，那么就太麻烦了，所以我们使用循环来取
        // System.out.println(it.next());//再取下会报NoSuchElementException异常

        //2.我们应该使用while循环结合迭代器来遍历集合
        while (it.hasNext()) {//hasNext()判断集合中是否还有元素，如果有返回true，如果没有返回false
            String ele = it.next();//next()返回集合中的下一个元素，同时迭代器会指向下一个元素
            System.out.println(ele);
            //注意:迭代器会指向下一个元素，所以如果再执行一次next()方法，迭代器会指向下一个元素(报错)
            //System.out.println(it.next());这样写也可以;
        }
    }
}
