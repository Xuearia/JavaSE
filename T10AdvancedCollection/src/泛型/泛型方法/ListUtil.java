package 泛型.泛型方法;

import java.util.Collection;

//定义一个工具类:ListUtil类中定义一个静态方法addAl，用来添加多个集合的元素。
public class ListUtil {
    public static <E> void addAll(Collection<E> c1, Collection<E> c2){
        for (E e : c2) {
            c1.add(e);
        }
    }
}
