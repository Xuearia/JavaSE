package 泛型.泛型类;

public class ListTest {
    public static void main(String[] args) {
        //把String的数据类型赋值到了 MyArraylist 中的 E 中
        MyArrayList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);
    }
}
