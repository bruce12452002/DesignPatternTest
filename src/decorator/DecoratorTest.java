package decorator;

public class DecoratorTest {
    // 可以累加功能，達到減少新增類別的目的

    public static void main(String[] args) {
        Car flyDecorator = new FlyCarDecorator();
        flyDecorator.show();
        System.out.println("------------------");

        Car swimDecorator = new SwimCarDecorator();
        swimDecorator.show();
        System.out.println("------------------");

        // 不需要再新增一個又會飛又會游的類別
        Car swimFlyDecorator1 = new FlyCarDecorator(swimDecorator);
        // 執行過程：FlyCarDecorator 的 show 第一行 -> SwimCarDecorator 的 show 方法
        // 最後繼續執行 FlyCarDecorator 的剩餘部分
        // 因為 FlyCarDecorator、SwimCarDecorator 都算是 Car
        // FlyCarDecorator 的 show() 裡的 super.getCar().show(); 會呼叫 SwimCarDecorator
        // 所以父類的 show 只會呼叫一次
        swimFlyDecorator1.show();
        System.out.println("------------------");

        // 不需要再新增一個又會飛又會游的類別
//        Car swimFlyDecorator2 = new SwimCarDecorator(flyDecorator);
//        swimFlyDecorator2.show();
//        System.out.println("------------------");
    }
}
