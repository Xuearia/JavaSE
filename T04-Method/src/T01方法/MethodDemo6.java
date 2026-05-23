package T01方法;


public class MethodDemo6 {

    public static void main(String[] args) {
        // 比较2个长方形的面积大小
        double area1 = getArea(3, 4);
        double area2 = getArea(5, 6);

        // 根据计算出的面积比较两个长方形
        if (area1 > area2) {
            System.out.println("第一个长方形大");
        } else if (area1 < area2) {
            System.out.println("第二个长方形大");
        } else {
            System.out.println("两个长方形面积相等");
        }
    }

    /**
     * 计算长方形的面积
     * @param width 长方形的宽度
     * @param height 长方形的高度
     * @return 长方形的面积
     */
    public static double getArea(int width, int height) {
        return width * height;
    }
}
