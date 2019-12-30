package prototype;

import prototype.zoo.Animal;
import prototype.zoo.Rabbit;
import prototype.zoo.Tiger;

import java.util.HashMap;
import java.util.Map;

public class AnimalCache {
    private static Map<Integer, Animal> animalMap = new HashMap<>();

    public static Animal getAnimal(Integer animalNum) {
        return (Animal) animalMap.get(animalNum).clone();
    }

    public static void loadCache() {
        var tiger = new Tiger();
        tiger.setId(100);

        var rabbit  = new Rabbit();
        rabbit.setId(200);

        animalMap.put(1, tiger);
        animalMap.put(2, rabbit);
    }
}
