package factory.abs;

import factory.Fruit;

public class FujiFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new FujiApple();
    }

    @Override
    public Fruit getBanana() {
        return new FujiBanana();
    }
}
