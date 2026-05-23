package test3_字符串连接器;

import java.util.StringJoiner;

public class StringJoiner_Demo1 {
    public static void main(String[] args) {
        //掌握StringJoiner的使用
        //StringJoiner s = new StringJoiner(", ");//间隔符
        StringJoiner s = new StringJoiner(", ", "[", "]");//间隔符
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);//java1, java2, java3


        int[] a = {12, 13, 14, 15};


    }


}
