package visitor;

public class DragonBallA implements DragonBallAll {
    @Override
    public void show(Purchase purchase) {
        purchase.buy(this);
    }
}
