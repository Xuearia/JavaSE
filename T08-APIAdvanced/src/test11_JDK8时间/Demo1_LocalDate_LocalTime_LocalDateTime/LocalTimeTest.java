package test11_JDK8时间.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        // 获取当前时间
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // 1、获取时间对象中的信息
        int hour = lt.getHour(); // 时
        int minute = lt.getMinute(); // 分
        int second = lt.getSecond(); // 秒
        int nano = lt.getNano(); // 纳秒

        System.out.println("时: " + hour);
        System.out.println("分: " + minute);
        System.out.println("秒: " + second);
        System.out.println("纳秒: " + nano);

        // 2、直接修改某个信息: withHour(修改小时)、withMinute(修改分钟)、withSecond(修改秒)、withNano(修改纳秒)
        System.out.println("-----修改小时------");
        LocalTime lt2 = lt.withHour(12);
        System.out.println(lt2);
        System.out.println("-----修改分钟------");
        LocalTime lt3 = lt.withMinute(30);
        System.out.println(lt3);
        System.out.println("-----修改秒------");
        LocalTime lt4 = lt.withSecond(15);
        System.out.println(lt4);
        System.out.println("-----修改纳秒------");
        LocalTime lt5 = lt.withNano(500000000);
        System.out.println(lt5);
        System.out.println("-----现在时间------");
        System.out.println(lt);

        // 3、把某个信息加多少: plusHours、plusMinutes、plusSeconds、plusNanos
        System.out.println("-----加1小时------");
        LocalTime lt6 = lt.plusHours(1);
        System.out.println(lt6);
        System.out.println("-----加15分钟------");
        LocalTime lt7 = lt.plusMinutes(15);
        System.out.println(lt7);
        System.out.println("-----加30秒------");
        LocalTime lt8 = lt.plusSeconds(30);
        System.out.println(lt8);
        System.out.println("-----加100000000纳秒------");
        LocalTime lt9 = lt.plusNanos(100000000);
        System.out.println(lt9);
        System.out.println("-----现在时间------");
        System.out.println(lt);

        // 4、把某个信息减多少：minusHours、minusMinutes、minusSeconds、minusNanos
        System.out.println("-----减2小时------");
        LocalTime lt10 = lt.minusHours(2);
        System.out.println(lt10);
        System.out.println("-----减20分钟------");
        LocalTime lt11 = lt.minusMinutes(20);
        System.out.println(lt11);
        System.out.println("-----减45秒------");
        LocalTime lt12 = lt.minusSeconds(45);
        System.out.println(lt12);
        System.out.println("-----减200000000纳秒------");
        LocalTime lt13 = lt.minusNanos(200000000);
        System.out.println(lt13);
        System.out.println("-----现在时间------");
        System.out.println(lt);

        // 5、获取指定时间的LocalTime对象： public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
        System.out.println("-----获取指定时间的LocalTime对象------");
        LocalTime lt14 = LocalTime.of(14, 30, 15, 500000000);
        LocalTime lt15 = LocalTime.of(14, 30, 15, 500000000);
        System.out.println(lt15);

        // 6、判断2个时间对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(lt14.equals(lt15)); // true
        System.out.println(lt14.isBefore(lt15)); // false
        System.out.println(lt14.isAfter(lt)); // 结果取决于当前时间

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        // public LocalDate toLocalDate()
        // public LocalTime toLocalTime()
        // public static LocalDateTime of(LocalDate date, LocalTime time)
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt16 = ldt.toLocalTime();
        System.out.println(ld);
        System.out.println(lt16);
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt16);
        System.out.println(ldt2);


    }
}