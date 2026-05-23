package P3匿名内部类_枚举_泛型.d3匿名内部类.练习;

public class Test {
    public static void main(String[] args) {
        PetOwner petOwner = new PetOwner();
        PetActivity cat = new PetActivity() {
            private String name = "咪咪";

            @Override
            public void doActivity() {
                System.out.println(name + " 这只猫在磨爪子，磨得可带劲啦~");
            }
        };

        PetActivity dog = new PetActivity() {
            private String name = "汪汪";

            @Override
            public void doActivity() {
                System.out.println(name + " 这只狗在汪汪叫，吼的可大声啦~");
            }
        };

petOwner.let(cat);
petOwner.let(dog);

    }
}