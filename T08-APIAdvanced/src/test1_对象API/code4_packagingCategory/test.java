package test1_对象API.code4_packagingCategory;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //目标:掌握包装类
        //Integer a1 = new Integer(12); //过时的不要用
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        //自动装箱:可以自动把基本数据类型的数据转换成对象
        Integer a2 = 13;
        System.out.println(a2);

        //自动拆箱:可以自动把包装类型的对象转换成对应的基本数据类型。
        int a4 = a2;

        //泛型和集合不支持基本数据类型，只能支持引用数据类型。
        ArrayList<Integer> list = new ArrayList<>();
        list.add(250);//自动装箱
        list.add(520);//自动装箱
        System.out.println(list.get(0));

        int r1 = list.get(1);//自动拆箱

        System.out.println("-------------------------------------------");

        //1.把基本数据类型的数据转成字符串(用的不多)
        Integer a = 200;
        String r = Integer.toString(a);//"200"
        String ss1 = a + "5";
        System.out.println(ss1);//2005

        String r2 = a.toString();//"200"
        String ss2 = a + "05";
        System.out.println(ss2);//20005

        String r3 = a + "";//"200"
        String ss3 = a + "0001";
        System.out.println(ss3);//2000001

        //2.parseInt把字符串转成基本数据类型(非常重要)

        String r4 = "249";
        Integer ss4 = Integer.parseInt(r4) + 1;//249+1=250
        System.out.println(ss4);//250

        String r5 = "249.5";
        double ss5 = Double.parseDouble(r5) + 1;
        System.out.println(ss5);


        //更简单的方法用valueOf(必须小数转小数,整数转整数,无法小数转整数(但可以整数转小数))
        String r6 = "1234";
        int ss6 = Integer.valueOf(r6) + 1;
        double ss7 = Double.valueOf(r6) + 10;

        System.out.println(ss6);//1234
        System.out.println(ss7);//1244.0



    }
}
