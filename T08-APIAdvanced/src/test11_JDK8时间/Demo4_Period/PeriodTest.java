package test11_JDK8时间.Demo4_Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        // 定义起始日期为2020年1月1日
        LocalDate start = LocalDate.of(2020, 1, 1);
        // 定义结束日期为2021年12月2日
        LocalDate end = LocalDate.of(2021, 12, 2);

        // 计算起始日期到结束日期之间的期间
        Period period = Period.between(start, end);
        // 打印期间的详细信息，输出格式为 PnYnMnD，n 分别代表年、月、日的数量
        System.out.println(period); // 输出: P1Y11M1D
        // 打印期间的年数
        System.out.println(period.getYears()); // 输出: 1
        // 打印期间的月数
        System.out.println(period.getMonths()); // 输出: 11
        // 打印期间的天数
        System.out.println(period.getDays()); // 输出: 1
    }
}
