package T1数组对象.Deposit;

public class CellPhone {
    private String Brand;
    private int price;
    private String color;


    public CellPhone() {
    }

    public CellPhone(String Brand, int price, String color) {
        this.Brand = Brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     *
     * @return Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * 设置
     *
     * @param Brand
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * 获取
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "CellPhone{Brand = " + Brand + ", price = " + price + ", color = " + color + "}";
    }

    public static void main(String[] args) {
        // 声明一个名为cellPhone的数组，用于存储CellPhone对象的引用
        CellPhone cellPhone[] = new CellPhone[3];

        CellPhone cellPhone1 = new CellPhone("华为", 2999, "土豪金");
        CellPhone cellPhone2 = new CellPhone("小米", 1000, "橙色");
        CellPhone cellPhone3 = new CellPhone("苹果", 5999, "米白色");

        cellPhone[0] = cellPhone1;
        cellPhone[1] = cellPhone2;
        cellPhone[2] = cellPhone3;
        for (int i = 0; i < cellPhone.length; i++) {
            CellPhone leng = cellPhone[i];
            System.out.printf("%s,%d,%s", leng.getBrand(), leng.getPrice(), leng.getColor());
            System.out.println();
        }
        int sum = 0;
        for (int j = 0; j < cellPhone.length; j++) {
            sum += cellPhone[j].getPrice();
        }
        double avg = sum / cellPhone.length;
        System.out.println("平均价格为:"+avg);
    }
}
