package visitor;

public class VisitorTest {
    // 訪問者模式：分離物件和資料的行為，可不修改類別而有新的操作

    public static void main(String[] args) {
        PedestrianA pedestrianA = new PedestrianA();
        PedestrianB pedestrianB = new PedestrianB();
        BatchPurchase batchPurchase = new BatchPurchase();

        DragonBall dragonBall = new DragonBall();
        dragonBall.show(pedestrianA);
        dragonBall.show(pedestrianB);
        dragonBall.show(batchPurchase);
    }
}
