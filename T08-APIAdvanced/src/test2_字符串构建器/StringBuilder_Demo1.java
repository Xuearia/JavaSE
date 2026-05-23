package test2_字符串构建器;

public class StringBuilder_Demo1 {
    public static void main(String[] args) {
        //目标:弄清楚StringBuilder的方法和作用
        //StringBuilder s = new StringBuilder()


       /*
        * StringBuilder和StringBuffer的用法是一样的
        * StringBuilder是线程不安全的
        * StringBuffer是线程安全的
        * StringBuffer= new StringBuffer("kaikai");
        */
        StringBuilder s = new StringBuilder("kaikai");

        s.append("真帅");
        s.append(666);
        s.append(true);


        //支持链式编程
        s.append(666).append(777).append("哇哦");
        System.out.println(s);

        //2.反转操作
        s.reverse();
        System.out.println(s);

        //3.返回字符串长度
        System.out.println(s.length());

        //把StringBuilder对象又转成String类型
        String string = s.toString();
        System.out.println(string);

    }
}

