package test11_JDK8时间.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDateTime;

public class LocaDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 1、获取日期时间对象中的信息
        int year = ldt.getYear(); // 年
        int month = ldt.getMonthValue(); // 月 (1-12)
        int day = ldt.getDayOfMonth(); // 日
        int dayOfYear = ldt.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ldt.getDayOfWeek().getValue(); // 星期几（返回值是1~7，对应周一到周日）
        int hour = ldt.getHour(); // 时
        int minute = ldt.getMinute(); // 分
        int second = ldt.getSecond(); // 秒

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);
        System.out.println("一年中的第几天: " + dayOfYear);
        System.out.println("星期几: " + dayOfWeek);
        System.out.println("时: " + hour);
        System.out.println("分: " + minute);
        System.out.println("秒: " + second);

        // 2、直接修改某个信息: withYear(修改年份)、withMonth(修改月份)、withDayOfMonth(修改日期)、withDayOfYear(修改一年中的第几天)
        // 还有 withHour(修改小时)、withMinute(修改分钟)、withSecond(修改秒)
        System.out.println("-----修改年------");
        LocalDateTime ldt2 = ldt.withYear(2020);
        System.out.println(ldt2);
        System.out.println("-----修改月------");
        LocalDateTime ldt3 = ldt.withMonth(12);
        System.out.println(ldt3);
        System.out.println("-----修改日------");
        LocalDateTime ldt4 = ldt.withDayOfMonth(30);
        System.out.println(ldt4);
        System.out.println("-----修改一年中的第365天------");
        LocalDateTime ldt5 = ldt.withDayOfYear(365);
        System.out.println(ldt5);
        System.out.println("-----修改小时------");
        LocalDateTime ldt6 = ldt.withHour(12);
        System.out.println(ldt6);
        System.out.println("-----现在时间------");
        System.out.println(ldt);

        // 3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks
        // 还有 plusHours、plusMinutes、plusSeconds
        System.out.println("-----加1年------");
        LocalDateTime ldt7 = ldt.plusYears(1);
        System.out.println(ldt7);
        System.out.println("-----加1月------");
        LocalDateTime ldt8 = ldt.plusMonths(1);
        System.out.println(ldt8);
        System.out.println("-----加1天------");
        LocalDateTime ldt9 = ldt.plusDays(1);
        System.out.println(ldt9);
        System.out.println("-----加1周------");
        LocalDateTime ldt10 = ldt.plusWeeks(1);
        System.out.println(ldt10);
        System.out.println("-----加1小时------");
        LocalDateTime ldt11 = ldt.plusHours(1);
        System.out.println(ldt11);
        System.out.println("-----现在时间------");
        System.out.println(ldt);

        // 4、把某个信息减多少：minusYears、minusMonths、minusDays、minusWeeks
        // 还有 minusHours、minusMinutes、minusSeconds
        System.out.println("-----减10年------");
        LocalDateTime ldt12 = ldt.minusYears(10);
        System.out.println(ldt12);
        System.out.println("-----减10月------");
        LocalDateTime ldt13 = ldt.minusMonths(10);
        System.out.println(ldt13);
        System.out.println("-----减10天------");
        LocalDateTime ldt14 = ldt.minusDays(10);
        System.out.println(ldt14);
        System.out.println("-----减10周------");
        LocalDateTime ldt15 = ldt.minusWeeks(10);
        System.out.println(ldt15);
        System.out.println("-----减10小时------");
        LocalDateTime ldt16 = ldt.minusHours(10);
        System.out.println(ldt16);
        System.out.println("-----现在时间------");
        System.out.println(ldt);

        // 5、获取指定日期时间的LocalDateTime对象： public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        System.out.println("-----获取指定日期时间的LocalDateTime对象------");
        LocalDateTime ldt17 = LocalDateTime.of(2099, 12, 12, 12, 30, 0);
        LocalDateTime ldt18 = LocalDateTime.of(2099, 12, 12, 12, 30, 0);
        System.out.println(ldt18);

        // 6、判断2个日期时间对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(ldt17.equals(ldt18));//true
        System.out.println(ldt17.isBefore(ldt18));//false
        System.out.println(ldt17.isAfter(ldt));//true
    }
}