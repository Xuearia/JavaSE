package test2_Collection遍历;

public class 图书 {
    private String name;          // 图书名称
    private Double price;        // 图书价格
    private Double rating;       // 图书评分
    private String  type;         // 图书类型

    public 图书() {
    }
    public 图书(String name, Double price, Double rating, String type) {
        this.name = name;
        this.price = price;
        // 验证评分不超过10.0
        if (rating != null && rating > 10.0) {
            this.rating = 10.0;
        } else if (rating != null && rating < 0) {
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }
        this.type = type;
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
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "图书{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", type='" + type + '\'' +
                '}';
    }
}
