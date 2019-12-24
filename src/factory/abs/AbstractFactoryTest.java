package factory.abs;

import factory.Fruit;

public class AbstractFactoryTest {
    // 向客戶端提供一個介面，裡面是產品組，也就是可以產生一組產品

    public static void main(String[] args) {
        FruitFactory fa = new TaiwanFruitFactory();
        Fruit a1 = fa.getApple();
        Fruit b1 = fa.getBanana();
        a1.getName();
        b1.getName();

        System.out.println("-------------------");

        FruitFactory fb = new FujiFruitFactory();
        Fruit a2 = fb.getApple();
        Fruit b2 = fb.getBanana();
        a2.getName();
        b2.getName();
    }
}
