package test1_对象API.code3_ObjectsMethod;

import java.util.Objects;

public class test1_Object_equals {
    public static void main(String[] args) {
        //目标掌握objects类提供的方法
        String s1 = null;
        String s2 = "kaikai";

        //两种方法都可以比较对象是否相等,但是第一种对象为空时会报空指针异常的错误
        //System.out.println(s1.equals(s2)); //空指针异常
        System.out.println(Objects.equals(s1, s2));//推荐 更安全 有空参校验
    }

}
