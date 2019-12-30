package prototype;


import prototype.zoo.Animal;
import prototype.zoo.Rabbit;
import prototype.zoo.Tiger;

public class TestPrototype {
    public static void main(String[] args) {
        AnimalCache.loadCache();

        var animal1 = AnimalCache.getAnimal(1);
        var animal2 = AnimalCache.getAnimal(2);
        getAnimal(animal1);
        getAnimal(animal2);
    }

    private static void getAnimal(Animal a) {
        if (a instanceof Tiger) {
            var t = (Tiger) a;
            System.out.println(t.getId());
            t.say();
        } else if (a instanceof Rabbit) {
            var r = (Rabbit) a;
            System.out.println(r.getId());
            r.say();
        }
    }
}
