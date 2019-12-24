package factory.simple;

import factory.Apple;
import factory.Banana;

public class SimpleFactoryTest {
    // 簡單的取得需要的類別，通常都是用 static，所以又叫靜態工廠
    // 當然不一定要用 static，具體看業務需求

    public static void main(String[] args) {
        FruitFactory.getFruit(Apple.class).getName();
        FruitFactory.getFruit(Banana.class).getName();
    }
}
