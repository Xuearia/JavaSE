package T03ArrayList_API.数组列表练习.Topic2_菜品管理案例;

public class dishes {
    private String name;//菜品,名称
    private Double price;//菜品价格
    private  String description;//菜品描述

    public dishes() {
    }

    public dishes(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
