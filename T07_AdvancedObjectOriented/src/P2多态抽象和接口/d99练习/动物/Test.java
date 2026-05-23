package P2多态抽象和接口.d99练习.动物;


public class Test {
    public static void main(String[] args) {
        breeder b = new breeder();
        Dog dog = new Dog(3);
        Frog frog = new Frog(2);
        Sheep sheep = new Sheep(1);

        b.breed(dog);
        System.out.println("------");
        b.breed(frog);
        System.out.println("------");
        b.breed(sheep);


    }
}
