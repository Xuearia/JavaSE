package test9_简单日期格式;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Topic1_Date {
    public static void main(String[] args) throws ParseException {
        //1 元秒杀
        //葡式蛋挞 (1 只) 兑换券
        //秒杀开始时间：2023 年 11 月 11 日 0:0:0
        //秒杀结束时间：2023 年 11 月 11 日 0:10:0

        //小贾下单并付款的时间为：2023 年 11 月 11 日 0:01:18
        //小皮下单并付款的时间为：2023 年 11 月 11 日 0:10:51
        //请用代码说明这两位同学有没有参加上秒杀活动？

        String start = "2023 年 11 月 11 日 0:0:0";
        String itSOver = "2023 年 11 月 11 日 0:10:0";

        String xiaojia = "2023 年 11 月 11 日 0:01:18";
        String xiaopi = "2023 年 11 月 11 日 0:10:51";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");
        Date startdate = sdf1.parse(start);
        Date itSOverdate = sdf1.parse(itSOver);

        Date xiaojiaDate = sdf1.parse(xiaojia);
        Date xiaopiDate = sdf1.parse(xiaopi);

        //日期对象转换毫秒值
        long time1 = startdate.getTime();
        long time2 = itSOverdate.getTime();

        long time3 = xiaojiaDate.getTime();
        long time4 = xiaopiDate.getTime();


        System.out.println("-------方法一----------");
        if (time3 >= time1 && time3 <= time2) {
            System.out.println("小贾参与秒杀");
        } else {
            System.out.println("小贾没有参与秒杀");
        }
        if (time4 >= time1 && time4 <= time2) {
            System.out.println("小皮参与秒杀");
        } else {
            System.out.println("小皮没有参与秒杀");
        }

        //方法二
        System.out.println("-------方法二----------");
        //使用 >= 和 <= 比较日期
        //推荐使用 after() / before() 方法更直观
        //after(): 判断当前日期是否在指定日期之后
        //before(): 判断当前日期是否在指定日期之前
        if (xiaojiaDate.after(startdate) && xiaojiaDate.before(itSOverdate)) {
            System.out.println("小贾参与秒杀");
        } else {
            System.out.println("小贾没有参与秒杀");
        }
        if (xiaopiDate.after(startdate) && xiaopiDate.before(itSOverdate)) {
            System.out.println("小皮参与秒杀");
        } else {
            System.out.println("小皮没有参与秒杀");
        }
    }

}

