package factory.simple;

import factory.Fruit;

public class FruitFactory {
    // 有些情形無法用 class 來接，如用字串來接，這時就會有很多的 if，會違反開閉原則
    public static Fruit getFruit(Class<? extends Fruit> fruit) {
        Fruit result = null;
        try {
            result = fruit.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.err.println("我錯了");
        }
        return result;
    }
}
