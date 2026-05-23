package P2多态抽象和接口.d99练习.动物;

public class breeder {
    public void breed(Pets pets) {
        pets.dine();
        pets.drinkWater();
        if (pets instanceof Swimming) {
            ((Swimming) pets).swimming();
        }
    }
}
