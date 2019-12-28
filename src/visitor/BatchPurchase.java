package visitor;

public class BatchPurchase implements Purchase {
    @Override
    public void buy(DragonBall dragonBall) {
        System.out.println("批發商買七龍珠整套");
    }

    @Override
    public void buy(DragonBallA dragonBallA) {
        System.out.println("批發商買七龍珠第一集");
    }

    @Override
    public void buy(DragonBallB dragonBallB) {
        System.out.println("批發商買七龍珠第二集");
    }
}
