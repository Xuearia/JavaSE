package P1静态与继承.d11重写;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.print1();
        b.print2(1, 2);

        System.out.println("----------------");
        C c = new C("楷楷", 20);
        System.out.println(c);//Study1_static.d11_extends_override.C@4e50df2e
        System.out.println(c.toString());//默认会在后面加toString

        ArrayList list =new ArrayList<>();
        list.add("java");
        System.out.println(list);
        //为什么这里又直接打的是内容捏,因为sun公司将这里默认的toString重写了
    }
}
