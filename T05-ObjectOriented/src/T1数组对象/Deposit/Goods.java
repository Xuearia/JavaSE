package T1数组对象.Deposit;

public class Goods {
    /*
     * 需求：
     *定义数组存储3个商品对象。
     *商品的属性：商品的id，名字，价格，库存。
     *创建三个商品对象，并把商品对象存入到数组当中。
     * */

    private String id;//商品ID
    private String name;//名字
    private int price;//价格
    private int inventory;//库存

    public Goods() {
    }

    public Goods(String id, String name, int price, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods goods1 = new Goods("001", "保温杯", 123, 50);
        Goods goods2 = new Goods("002", "铅笔", 13, 50);
        Goods goods3 = new Goods("003", "圆规", 2, 50);



        arr[0] = goods1;
        arr[1] = goods2;
        arr[2] = goods3;

        for (int i = 0; i < arr.length ; i++) {
            Goods goods = arr[i];
            System.out.printf("%s,%s,%d,%d",goods.getId(),goods.getName(),goods.getPrice(),goods.getInventory());
            System.out.println();                                                 
        }
    }



}