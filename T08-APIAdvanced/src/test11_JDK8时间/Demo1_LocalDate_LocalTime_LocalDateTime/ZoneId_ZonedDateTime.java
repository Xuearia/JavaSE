package test11_JDK8时间.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        // 目标：了解时区和带时区的时间。
        // 1、ZoneId的常见方法：
        // 获取Java支持的全部时区Id
        System.out.println("------获取Java支持的全部时区Id-------");
        System.out.println(ZoneId.getAvailableZoneIds());

        // 获取系统默认的时区
        ZoneId timeZone = ZoneId.systemDefault();
        System.out.println("------获取系统默认时区-------");
        System.out.println(timeZone.getId());
        System.out.println(timeZone);

        // 把某个时区id封装成ZoneId对象，这里封装纽约时区
        ZoneId zoneId1 = ZoneId.of("America/New_York");

        // 2、ZonedDateTime：带时区的时间。
        // 获取美国（纽约时区）现在时间
        System.out.println("------获取美国现在的时间-------");
        ZonedDateTime zdt1 = ZonedDateTime.now(zoneId1);
        System.out.println(zdt1);

        // 获取世界标准时间
        System.out.println("------获取世界标准时间-------");
        ZoneId zoneId2 = ZoneId.of("UTC");
        ZonedDateTime zdt2 = ZonedDateTime.now(zoneId2);
        System.out.println(zdt2);
        // 简写方式获取世界标准时间
        ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zdt3);

        // 获取系统默认时区的ZonedDateTime对象
        System.out.println("------获取系统默认时区的ZonedDateTime对象-------");
        ZonedDateTime zdt4 = ZonedDateTime.now();
        System.out.println(zdt4);

        // Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId1));
    }
}