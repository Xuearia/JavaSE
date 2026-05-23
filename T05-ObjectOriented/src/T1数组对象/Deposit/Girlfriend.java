package T1数组对象.Deposit;

public class Girlfriend {
    private String name;//姓名
    private int age;//年龄
    private char sex;//性别
    private String love;//爱好

    public Girlfriend() {
    }

    public Girlfriend(String name, int age, char sex, String love) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public static void main(String[] args) {
        Girlfriend[] arr = new Girlfriend[4];
        Girlfriend girlfriend1 = new Girlfriend("小诗诗", 18, '女', "唱歌");
        Girlfriend girlfriend2 = new Girlfriend("小丹丹", 19, '女', "跳舞");
        Girlfriend girlfriend3 = new Girlfriend("小惠惠", 20, '女', "画画");
        Girlfriend girlfriend4 = new Girlfriend("小莉莉", 21, '女', "睡觉");

        arr[0] = girlfriend1;
        arr[1] = girlfriend2;
        arr[2] = girlfriend3;
        arr[3] = girlfriend4;

        for (int i = 0; i < arr.length; i++) {
            Girlfriend leng = arr[i];
            System.out.printf("%s,%d,%c,%s", leng.getName(), leng.age, leng.getSex(), leng.getLove());
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Girlfriend leng = arr[i];
            sum += leng.getAge();
        }
        int avg = sum / arr.length;
        System.out.println("平均年龄为:" + avg + "岁...");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Girlfriend leng = arr[i];
            if (leng.getAge() < avg) {
                count++;
                System.out.printf("%s,%d,%c,%s", leng.getName(), leng.age, leng.getSex(), leng.getLove());
                System.out.println("");

            }

        } System.out.println("共"+count+"个比平均年龄低");
    }
}