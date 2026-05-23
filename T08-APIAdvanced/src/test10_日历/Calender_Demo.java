package test10_日历;

import java.util.Calendar;
import java.util.Date;

public class Calender_Demo {
    public static void main(String[] args) {
        //Calender: 日历代表此时此刻对应的日历
        //通过它可以修改时间中的年月日时分秒

        //但它是个抽象类，不能直接创建对象，需要通过子类获取对象
        //例: Calendar c = Calendar.getInstance();

        //修改的单词:
        // YEAR(年) MONTH(月) DAY_OF_MONTH(日) HOUR(时) MINUTE(分) SECOND(秒) HOUR_OF_DAY(24小时制)
        // WEEK_OF_MONTH(周几) WEEK_OF_YEAR(第几周) AM_PM(上午/下午) DAY_OF_WEEK(星期几) DAY_OF_YEAR(第几天)

        //1.得到当前时间对应的日历
        Calendar c = Calendar.getInstance();
        System.out.println("------当前时间日历--------");
        System.out.println(c);//可以在输出中看到当前时间对应的日历(修改单词可看上方)

        //得到年份
        System.out.println("------得到年份--------");
        int years = c.get(Calendar.YEAR);
        System.out.println(years);

        System.out.println("------得到月份--------");
        int months = c.get(Calendar.MONTH);
        System.out.println(months);

        System.out.println("------得到日期--------");
        int days = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        System.out.println("------得到小时--------");
        int hours = c.get(Calendar.HOUR);
        System.out.println(hours);

        System.out.println("------得到分钟--------");
        int minutes = c.get(Calendar.MINUTE);
        System.out.println(minutes);

        System.out.println("------得到秒--------");
        int seconds = c.get(Calendar.SECOND);
        System.out.println(seconds);

        System.out.println("------得到毫秒--------");
        int milliseconds = c.get(Calendar.MILLISECOND);
        System.out.println(milliseconds);

        System.out.println("------得到星期--------");
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        System.out.println("------得到第几周--------");
        int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
        System.out.println(weekOfYear);

        System.out.println("------得到第几天--------");
        int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
        System.out.println(weekOfMonth);

        System.out.println("------得到上午/下午--------");
        int ampm = c.get(Calendar.AM_PM);
        System.out.println(ampm);

        System.out.println("------得到24小时制--------");
        int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
        System.out.println(hourOfDay);


        //修改日历中某个值
        System.out.println("------修改年份--------");
        c.set(Calendar.YEAR,2020);
        System.out.println("------修改月份--------");
        c.set(Calendar.MONTH,11);
        System.out.println(c);






        Date d = c.getTime();
        System.out.println(d);






    }
}
