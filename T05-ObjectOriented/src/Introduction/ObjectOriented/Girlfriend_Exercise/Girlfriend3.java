package Introduction.ObjectOriented.Girlfriend_Exercise;
/*
这个类讲解了如果你用构建方法来写有效性校验如何规范
 * 1. 用构建方法，构建方法里如何有效传入参数：
 *    在有参构造方法中，对传入的参数进行有效性检查。例如，对于性别参数sex，检查其是否不为"男"（这里简单认为除了"男"就是符合要求的性别，实际可根据需求调整），如果符合条件则将其赋值给类的成员变量sex；对于年龄参数age，检查其是否在1到120之间（包含1和120），如果满足条件则赋值给成员变量age。通过这种方式，确保在对象创建时传入的参数是有效的。
 * 2. 写了构建方法是否还需要set以及什么时候需要加set(想2次修改参数)：
 *    当写了有参构造方法对参数进行初始化后，是否需要set方法取决于具体的业务需求。如果在对象创建后，不需要再修改某些属性的值，那么可以不提供对应的set方法，这样可以限制属性的修改，保证对象状态的稳定性。但如果存在需要在对象创建后再次修改属性值的情况，就需要提供相应的set方法。例如，对于年龄属性age，如果在程序运行过程中可能会根据某些条件改变年龄，就需要提供setAge方法来实现对年龄的修改操作，并且在set方法中同样进行有效性校验，以保证修改后的值也是有效的。
 * 3. 二次修改参数，如果参数不通过校验会优先输出构建方法中的参数：
 *    当通过set方法对已经在构造方法中初始化的参数进行二次修改时，如果新传入的参数不满足校验条件，那么对象的属性值不会被更新，仍然保持构造方法中初始化的值。例如，在main方法中，通过有参构造方法创建对象时设置年龄为19，之后调用setAge(129)尝试修改年龄，由于129不满足年龄在1到120之间的校验条件，所以年龄属性不会被修改，仍然保持为19。在调用show方法展示属性时，会优先输出构造方法中初始化的参数值。
 */
public class Girlfriend3 {
    // 姓名属性，用于存储女朋友的姓名信息
    private String name;
    // 性别属性，用于存储女朋友的性别信息
    private String sex;
    // 身高属性，单位为米，用于存储女朋友的身高数值
    private double height;
    // 体重属性，单位为千克，用于存储女朋友的体重数值
    private double weight;
    // 年龄属性，用于存储女朋友的年龄数值
    private int age;

    /**
     * 默认构造方法，当不传入任何参数创建对象时会调用此方法。
     * 它提供了一种创建对象的方式，后续可以通过调用相应的set方法来设置对象的属性值。
     */
    public Girlfriend3() {
    }

    /**
     * 有参构造方法，用于在创建对象时初始化女朋友对象的属性，包含年龄参数。
     *
     * @param name   女朋友的姓名，用于初始化对象的name属性。
     * @param sex    女朋友的性别，用于初始化对象的sex属性，并进行有效性校验。
     * @param height 女朋友的身高，单位为米，用于初始化对象的height属性。
     * @param weight 女朋友的体重，单位为千克，用于初始化对象的weight属性。
     * @param age    女朋友的年龄，用于初始化对象的age属性，并进行有效性校验。
     */
    public Girlfriend3(String name, String sex, double height, double weight, int age) {
        this.name = name;
        // 设置性别，并进行有效性校验
        if (!"男".equals(sex)) {
            // 这里建议使用equals方法比较字符串，因为使用!=比较字符串比较的是引用地址，可能会得到错误结果
            this.sex = sex;
        } else {
            System.out.println("性别只能是“女”");
        }
        this.height = height;
        this.weight = weight;
        // 年龄的有效校验
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄应在 1 到 120 之间");
        }
    }

    // 获取姓名的方法，外部代码可以通过调用此方法获取对象的姓名属性值。
    public String getName() {
        return name;
    }

    // 获取性别的方法，外部代码可以通过调用此方法获取对象的性别属性值。
    public String getSex() {
        return sex;
    }

    // 获取身高的方法，外部代码可以通过调用此方法获取对象的身高属性值。
    public double getHeight() {
        return height;
    }

    // 获取体重的方法，外部代码可以通过调用此方法获取对象的体重属性值。
    public double getWeight() {
        return weight;
    }

    // 获取年龄的方法，外部代码可以通过调用此方法获取对象的年龄属性值。
    public int getAge() {
        return age;
    }

    // 设置年龄的方法，用于在对象创建后修改年龄属性值，并对新传入的年龄进行有效性校验。
    //如果不加这个校验,二次修改数值会直接跳过上方构建方法的有效校验,比如上方年龄要小于120,
    //你二次调用修改129不会提示你报错,从而等于没写校验
    public void setAge(int age) {
        // 年龄的有效校验
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄应在 1 到 120 之间");
        }
    }

    /**
     * 行为类: 洗衣服，定义了女朋友执行洗衣服行为时的操作，这里简单打印提示信息。
     */
    public void wash() {
        System.out.println("女朋友在帮我洗衣服");
    }

    /**
     * 行为类: 做饭，定义了女朋友执行做饭行为时的操作，这里简单打印提示信息。
     */
    public void cook() {
        System.out.println("女朋友在帮我做饭");
    }

    /**
     * 展示类: 展示四个属性，用于将女朋友对象的性别、姓名、身高、体重和年龄属性值以格式化的方式打印输出。
     */
    public void show() {
        System.out.printf("我女朋友性别%s,名字叫%s,身高%.1f厘米,体重%.1f斤,年龄%d岁\n", sex, name, height, weight, age);
    }

    public static void main(String[] args) {
        // 使用包含年龄参数的有参构造创建对象
        Girlfriend3 girlfriend = new Girlfriend3("小丽", "男", 1.60, 48.0, 19);
        // 输入129超过所设置的年龄校验,所以优先使用构建方法里的参数,而不是set方法里的参数
        girlfriend.setAge(129);
        girlfriend.show();
        // 可以再添加一些测试代码，例如修改为合法年龄，查看属性值是否正确更新
        girlfriend.setAge(20);
        girlfriend.show();
        girlfriend.wash();
        girlfriend.cook();

    }
}