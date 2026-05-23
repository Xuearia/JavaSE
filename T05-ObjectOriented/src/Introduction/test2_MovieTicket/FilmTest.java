package Introduction.test2_MovieTicket;

import javax.management.Query;
import java.util.Scanner;

public class FilmTest {
    /*
        目标：完成电影信息展示功能；根据电影 id 查询该电影详情。
        电影数据:
                1,"水门桥",38.9,9.8,"徐克","吴京","12 万人想看"
                2,"出拳吧",39,7.8,"唐晓白","田雨","3.5 万人想看"
                3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9 万人想看"
                4,"一点就到家",35,8.7,"许宏宇","刘昊然","10.8 万人想看"
        */
    public static void main(String[] args) {
        Film[] arr = new Film[4];

        Film m1 = new Film(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12 万人想看");
        Film m2 = new Film(2, "出拳吧", 39, 7.8, "唐晓白", "田雨", "3.5 万人想看");
        Film m3 = new Film(3, "月球陨落", 42, 7.9, "罗兰", "贝瑞", "17.9 万人想看");
        Film m4 = new Film(4, "一点就到家", 35, 8.7, "许宏宇", "刘昊然", "10.8 万人想看");

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        arr[3] = m4;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("== 电影信息系统 ==");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、根据 id 查询某个电影的详细信息展示");
            System.out.println("0、退出系统");
            System.out.println("请您输入操作命令:");
            // 接收电影数据
            Film_show shows = new Film_show(arr);

            int command = sc.nextInt();
            switch (command) {
                case 1:
                    shows.printShows();
                    break;
                case 2:
                    System.out.println("请输入你要查询的电影id:");
                    int several = sc.nextInt();
                    shows.QueryId(several);
                    break;
                case 0:
                    System.out.println("退出系统...");
                    sc.close();
                    return;
                default:
                    System.out.println("您输入的命令有问题");


            }
        }

        // 展示所有电影信息


        // shows.QueryId(1);

    }


}
