package P3匿名内部类_枚举_泛型.d6泛型类;

public class Test {
    public static void main(String[] args) {
        //目标:掌握泛型类的定义和使用
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java2");
        // list.add(23);
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<String, String> c2 = new MyClass2<>();

        MyClass3<Animal> c3 = new MyClass3<>();
        MyClass3<dog> c4 = new MyClass3<>();


    }
}
