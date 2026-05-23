package T1数组对象.Deposit;

import java.util.Scanner;

public class cars {
    private String prand;//品牌
    private int price;//价格
    private String color;//颜色

    public cars() {
    }

    public cars(String prand, int price, String color) {
        this.prand = prand;
        this.price = price;
        this.color = color;
    }

    public String getPrand() {
        return prand;
    }

    public void setPrand(String prand) {
        this.prand = prand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        cars[] arr = new cars[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            cars c = new cars();
            System.out.println("请输入车的品牌:");
            String prand = sc.next();
            c.setPrand(prand);

            System.out.println("请输入车的价格:");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("请输入车的颜色:");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            cars c = arr[i];
            System.out.printf("%s,%d,%s",c.getPrand(),c.getPrice(),c.getColor());
            System.out.println();
        }
    }
}


