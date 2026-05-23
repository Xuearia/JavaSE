package test11_JDK8时间.Demo1_LocalDate_LocalTime_LocalDateTime;


import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 1、获取日期对象中的信息
        // 1、获取日期对象中的信息
        int year = ld.getYear(); // 年
        int month = ld.getMonthValue(); // 月 (1-12)
        int day = ld.getDayOfMonth(); // 日
        int dayOfYear = ld.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue(); // 星期几（返回值是1~7，对应周一到周日）

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);
        System.out.println("一年中的第几天: " + dayOfYear);
        System.out.println("星期几: " + dayOfWeek);


        // 2、直接修改某个信息: withYear(修改年份)、withMonth(修改月份)、withDayOfMonth(修改日期)、withDayOfYear(修改一年中的第几天)
        System.out.println("-----修改年------");
        LocalDate ld2 = ld.withYear(2020);
        System.out.println(ld2);
        System.out.println("-----修改月------");
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld3);
        System.out.println("-----修改日------");
        LocalDate ld4 = ld.withDayOfMonth(30);
        System.out.println(ld4);
        System.out.println("-----修改一年中的第365天------");
        LocalDate ld5 = ld.withDayOfYear(365);
        System.out.println(ld5);
        System.out.println("-----现在时间------");
        System.out.println(ld);


        // 3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks

        System.out.println("-----加1年------");
        LocalDate ld6 = ld.plusYears(1);
        System.out.println(ld6);
        System.out.println("-----加1月------");
        LocalDate ld7 = ld.plusMonths(1);
        System.out.println(ld7);
        System.out.println("-----加1天------");
        LocalDate ld8 = ld.plusDays(1);
        System.out.println(ld8);
        System.out.println("-----加1周------");
        LocalDate ld9 = ld.plusWeeks(1);
        System.out.println(ld9);
        System.out.println("-----现在时间------");
        System.out.println(ld);


        // 4、把某个信息减多少：minusYears、minusMonths、minusDays、minusWeeks
        System.out.println("-----减10年------");
        LocalDate ld10 = ld.minusYears(10);
        System.out.println(ld10);
        System.out.println("-----减10月------");
        LocalDate ld11 = ld.minusMonths(10);
        System.out.println(ld11);
        System.out.println("-----减10天------");
        LocalDate ld12 = ld.minusDays(10);
        System.out.println(ld12);
        System.out.println("-----减10周------");
        LocalDate ld13 = ld.minusWeeks(10);
        System.out.println(ld13);
        System.out.println("-----现在时间------");
        System.out.println(ld);

        // 5、获取指定日期的LocalDate对象： public static LocalDate of(int year, int month, int dayOfMonth)
        System.out.println("-----获取指定日期的LocalDate对象------");
        LocalDate ld14 = ld.of(2099, 12, 12);
        LocalDate ld15 = ld.of(2099, 12, 12);
        System.out.println(ld15);

        // 6、判断2个日期对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(ld14.equals(ld15));//true
        System.out.println(ld14.isBefore(ld15));//false
        System.out.println(ld14.isAfter(ld));//true


    }
}
