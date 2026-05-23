package Introduction.ObjectOriented.Pot;

/**
 * 定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
 * 定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
 * 要求:
 * 1. 按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法
 * 2. 定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
 * 3. 调用成员方法,打印格式如下:
 * <p>
 * //花色的波斯猫正在吃鱼.....
 * //花色的波斯猫正在逮老鼠....
 * //黑色的藏獒正在啃骨头.....
 * //黑色的藏獒正在看家.....
 */
public class Pet {
    class Cat {
        private String color;
        private String breed;

        public Cat() {

        }

        public Cat(String color, String breed) {
            this.color = color;
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void eat() {
            System.out.printf("%s的%s正在吃鱼....\n", color, breed);
        }

        public void catchMouse() {
            System.out.printf("%s的%s正在逮老鼠....\n", color, breed); // 修改此处
        }
    }

    class Dog {
        private String color;
        private String breed;

        public Dog() {
        }

        public Dog(String color, String breed) {
            this.color = color;
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void eat() {
            System.out.printf("%s的%s正在啃骨头....\n", color, breed);
        }

        public void lookHome() {
            System.out.printf("%s的%s正在看家....\n", color, breed);
        }
    }

    public static void main(String[] args) {
        Pet p = new Pet();
        Cat cat = p.new Cat();
        cat.setColor("花色");
        cat.setBreed("波斯猫");
        cat.eat();
        cat.catchMouse();
        Dog dog = p.new Dog();
        dog.setColor("黑色");
        dog.setBreed("藏獒");
        dog.eat();
        dog.lookHome();
    }
}
