package factory.method;

public class FactoryMethodTest {
    // 工廠方法又叫多型工廠，尤工廠的子類產生產品
    // 如果簡單工廠需要多個 if 判斷，可以用工廠方法，因為合乎開閉原則

    public static void main(String[] args) {
        FruitFactory f1 = new AppleFactory();
        FruitFactory f2 = new BananaFactory();
        f1.getFruit().getName();
        f2.getFruit().getName();
    }
}
