package test1_对象API.code3_ObjectsMethod;

import java.util.Objects;

public class test2_isNull_OR_nonNull {
    public static void main(String[] args) {
        //Objects.isNull(Object obj)：用于判断传入的对象是否为null。如果对象为null，则返回true；否则返回false。
        String str1 = null;
        String str2 = "Hello";

        System.out.println("str1是否为null: " + Objects.isNull(str1));
        System.out.println(str1==null);//这样也可以实现
        System.out.println("str2是否为null: " + Objects.isNull(str2));
        System.out.println(str1==null);

        System.out.println("--------------两种任选其1即可*(用处使逼格上升)------------------");

        //Objects.nonNull(Object obj)：与Objects.isNull相反，用于判断传入的对象是否不为null。如果对象不为null，则返回true；否则返回false。
        String str3 = null;
        String str4 = "Hello";

        System.out.println("str3是否不为null: " + Objects.nonNull(str3));
        System.out.println(str3!=null);//这样也可以实现
        System.out.println("str4是否不为null: " + Objects.nonNull(str4));
        System.out.println(str4!=null);
    }
}


