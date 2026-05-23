package test11_JDK8时间.Demo2_Instant;

import java.time.Instant;

public class Instant_Test {
    public static void main(String[] args) {
        // 获取当前时刻的 Instant 对象
        Instant now = Instant.now();
        System.out.println("当前时刻: " + now);

        // 获取从 1970 - 01 - 01T00:00:00 开始记录的秒数
        long sec = now.getEpochSecond();
        System.out.println("自 1970 - 01 - 01T00:00:00 起的秒数: " + sec);

        // 获取当前秒内从时间线开始（1970 - 01 - 01T00:00:00 ）起的纳秒数
        int nano = now.getNano();
        System.out.println("当前秒内的纳秒数: " + nano);

        // 在当前时间基础上增加 5 秒
        Instant afterAddSec = now.plusSeconds(5);
        System.out.println("增加 5 秒后的时间: " + afterAddSec);

        // 在当前时间基础上增加 1000 毫秒（即 1 秒）
        Instant afterAddMs = now.plusMillis(1000);
        System.out.println("增加 1000 毫秒后的时间: " + afterAddMs);

        // 在当前时间基础上增加 1000000000 纳秒（即 1 秒）
        Instant afterAddNano = now.plusNanos(1000000000);
        System.out.println("增加 1000000000 纳秒后的时间: " + afterAddNano);

        // 在当前时间基础上减去 3 秒
        Instant afterMinusSec = now.minusSeconds(3);
        System.out.println("减去 3 秒后的时间: " + afterMinusSec);

        // 在当前时间基础上减去 500 毫秒（即 0.5 秒）
        Instant afterMinusMs = now.minusMillis(500);
        System.out.println("减去 500 毫秒后的时间: " + afterMinusMs);

        // 在当前时间基础上减去 500000000 纳秒（即 0.5 秒）
        Instant afterMinusNano = now.minusNanos(500000000);
        System.out.println("减去 500000000 纳秒后的时间: " + afterMinusNano);

        // 判断两个 Instant 对象是否相等
        boolean isEqual = now.equals(afterAddSec);
        System.out.println("当前时间和增加 5 秒后的时间是否相等: " + isEqual);

        // 判断当前时间是否在增加 5 秒后的时间之前
        boolean isBefore = now.isBefore(afterAddSec);
        System.out.println("当前时间是否在增加 5 秒后的时间之前: " + isBefore);

        // 判断当前时间是否在增加 5 秒后的时间之后
        boolean isAfter = now.isAfter(afterAddSec);
        System.out.println("当前时间是否在增加 5 秒后的时间之后: " + isAfter);
    }
}
