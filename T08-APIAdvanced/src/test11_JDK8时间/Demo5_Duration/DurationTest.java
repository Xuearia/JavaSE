package test11_JDK8时间.Demo5_Duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Instant;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        // 目标：Duration的使用。
        // 创建两个不同的时间对象，这里以LocalTime为例
        LocalTime startTime = LocalTime.of(10, 0, 0);
        LocalTime endTime = LocalTime.of(12, 30, 0);

        // 使用between方法创建Duration对象，表示两个时间对象的时间差
        Duration duration = Duration.between(startTime, endTime);

        // 计算时间差对应的天数并输出
        long days = duration.toDays();
        System.out.println("两个时间相差的天数: " + days);

        // 计算时间差对应的小时数并输出
        long hours = duration.toHours();
        System.out.println("两个时间相差的小时数: " + hours);

        // 计算时间差对应的分钟数并输出
        long minutes = duration.toMinutes();
        System.out.println("两个时间相差的分钟数: " + minutes);

        // 计算时间差对应的秒数并输出
        long seconds = duration.toSeconds();
        System.out.println("两个时间相差的秒数: " + seconds);

        // 计算时间差对应的毫秒数并输出
        long millis = duration.toMillis();
        System.out.println("两个时间相差的毫秒数: " + millis);

        // 计算时间差对应的纳秒数并输出
        long nanos = duration.toNanos();
        System.out.println("两个时间相差的纳秒数: " + nanos);

        // 换用Instant示例
        Instant instantStart = Instant.now();
        try {
            // 模拟等待一段时间
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant instantEnd = Instant.now();
        Duration instantDuration = Duration.between(instantStart, instantEnd);
        System.out.println("Instant示例 - 两个时间相差的秒数: " + instantDuration.toSeconds());

        // 换用LocalDateTime示例
        LocalDateTime ldtStart = LocalDateTime.now();
        LocalDateTime ldtEnd = ldtStart.plusHours(1);
        Duration ldtDuration = Duration.between(ldtStart, ldtEnd);
        System.out.println("LocalDateTime示例 - 两个时间相差的小时数: " + ldtDuration.toHours());
    }
}

