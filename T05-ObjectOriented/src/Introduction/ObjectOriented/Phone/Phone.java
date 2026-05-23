package Introduction.ObjectOriented.Phone;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String color, double price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void show() {
        System.out.printf("正在使用价格为%.2f元%s的%s手机打电话...\n", price, color, brand);
    }

    public void show2() {
        System.out.printf("正在使用价格为%.2f元%s的%s手机发短信...", price, color, brand);
    }



    }


