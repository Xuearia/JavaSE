package test8_日期;

import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        //1.创建一个Date对象,代表系统当前时间信息的
        Date d = new Date();
        System.out.println(d);

        //2.拿到时间毫秒值 从1910年1月1日00:00开始
        long time = d.getTime();
        System.out.println(time);

        //3.把毫秒值转换成对应的日期和时间 10s之后的时间
        Date d2 = new Date(time + 10 * 1000);
        System.out.println(d2);

        //4.直接把日期对象的世界通过setTime方法进行修改
        //第一种方法
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
   
    }
}
