package visitor;

public class DragonBall implements DragonBallAll {
    private DragonBallA dragonBallA = new DragonBallA();
    private DragonBallB dragonBallB = new DragonBallB();

    @Override
    public void show(Purchase purchase) {
        purchase.buy(this);
        dragonBallA.show(purchase);
        dragonBallB.show(purchase);
    }
}
