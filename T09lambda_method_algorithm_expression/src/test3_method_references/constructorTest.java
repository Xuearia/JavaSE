package test3_method_references;

public class constructorTest {
    private String name;
    private double price;

    public constructorTest() {
    }

    public constructorTest(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "constructorTest{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
