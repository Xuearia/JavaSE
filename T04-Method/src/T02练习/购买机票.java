package T02练习;

import java.util.Scanner;

public class 购买机票 {
    public static void main(String[] args) {
        /*
        * 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，优惠方案如
        下：5-10 月为旺季，头等舱 9 折，经济舱 8.5 折；11 月到来年。4 月为淡季，头等舱 7 折，经济舱 6.5 折，
        请开发程序计算出用户当前机票的优惠价。 */
        Scanner sc = new Scanner(System.in);

        double price = 2000; // 定义票价
        System.out.println("请输入月份:");
        int month = sc.nextInt(); // 输入月份

        System.out.println("请输入您要买的规格(经济舱/头等舱):");
        String specification = sc.next(); // 输入规格

        System.out.println(
                BuyTickets(price, month, specification)
        );
    }

    /**
     * 计算机票的优惠价
     * @param price 机票原价
     * @param month 购买月份
     * @param specification 舱位类型（经济舱/头等舱）
     * @return 优惠后的机票价格
     */
    public static double BuyTickets(double price, int month, String specification) {
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                if ("头等舱".equals(specification)) {
                    return price *= 0.7;
                } else if ("经济舱".equals(specification)) {
                    return price *= 0.65;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if ("头等舱".equals(specification)) {
                    return price *= 0.9;
                } else if ("经济舱".equals(specification)) {
                    return price *= 0.85;
                }
                break;
        }
        return price;
    }
}
