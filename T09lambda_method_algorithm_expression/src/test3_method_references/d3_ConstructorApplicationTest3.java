package test3_method_references;

public class d3_ConstructorApplicationTest3 {
    public static void main(String[] args) {
//理解构造器的引用(理解语法)
//        CreateCar cc = new CreateCar() {
//            @Override
//            public constructorTest create(String name, double price) {
//                return new constructorTest(name, price);
//            }
//        };
        //简化
//        CreateCar cc = (name, price) -> new constructorTest(name, price);
        //构造器引用
        CreateCar cc = constructorTest::new;


        constructorTest c = cc.create("小米su7", 50.9);
        System.out.println(c);
    }

}

interface CreateCar {
    constructorTest create(String name, double price);
}
