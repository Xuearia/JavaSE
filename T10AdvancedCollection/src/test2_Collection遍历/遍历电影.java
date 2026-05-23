package test2_Collection遍历;

import java.util.ArrayList;
import java.util.Collection;

public class 遍历电影 {
    public static void main(String[] args) {
        // 创建电影集合
        Collection<电影> movies = new ArrayList<>();

        // 添加电影数据
        movies.add(new 电影("《肖申克的救赎》", 9.7, "罗宾斯"));
        movies.add(new 电影("《霸王别姬》", 12, "张国荣、张丰毅"));
        movies.add(new 电影("《阿甘正传》", 9.5, "汤姆汉克斯"));

        // 打印整个集合（默认调用 toString）
        System.out.println(movies);

        // 使用增强 for 循环遍历集合
        for (电影 m : movies) {
            // 打印电影详细信息
            System.out.println("电影名称：" + m.getName());
            System.out.println("电影评分：" + m.getScore());
            System.out.println("领衔主演：" + m.getLeadActor());
            System.out.println("-----------------------------");
        }
    }
}

