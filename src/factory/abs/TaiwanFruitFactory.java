package factory.abs;

import factory.Fruit;

public class TaiwanFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new TaiwanApple();
    }

    @Override
    public Fruit getBanana() {
        return new TaiwanBanana();
    }
}
