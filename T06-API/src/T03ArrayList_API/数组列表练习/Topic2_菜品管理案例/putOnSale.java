package T03ArrayList_API.数组列表练习.Topic2_菜品管理案例;

import java.util.ArrayList;
import java.util.Scanner;

public class putOnSale {

    private ArrayList<dishes> foodList = new ArrayList<>();
    private String 下次再来哦;

    public void serveTheDishes() {
        dishes d = new dishes();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菜名:");
        String name = sc.next();
        d.setName(name);
        System.out.println("请输入价格:");
        Double price = sc.nextDouble();
        d.setPrice(price);
        System.out.println("请输入描述:");
        String description = sc.next();
        d.setDescription(description);

        foodList.add(d);
        System.out.println("上架成功!");
    }

    public void show() {
        if (foodList.size() == 0) {
            System.out.println("还没上架菜品呢!快去上架吧~~");
        }
        for (int i = 0; i < foodList.size(); i++) {
            dishes longs = foodList.get(i);
            System.out.println("菜品名称: " + longs.getName());
            System.out.println("菜品价格: " + longs.getPrice());
            System.out.println("菜品描述: " + longs.getDescription());
            System.out.println("{---------------------");
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择功能:");
            System.out.println("1.上架菜品:");
            System.out.println("2.展示菜品:");
            System.out.println("3.退出菜单:");
            System.out.println("请选择您的操作:");
            String type = sc.next();
            switch (type) {
                case "1":
                    serveTheDishes();
                    break;
                case "2":
                    show();
                    break;
                case "3":
                    System.out.println("退出成功!下次再来哦~~");
                    return;//干掉start()方法所以就结束循环了

                default:
                    System.out.println("输入错误,请重新输入!");
                    break;

            }
        }

    }
}
