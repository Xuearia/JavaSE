package P3匿名内部类_枚举_泛型.d7通用接口;

import java.util.ArrayList;

public interface Date<T> {
    void add(T t);

    ArrayList<T> getByName(String name);
}
