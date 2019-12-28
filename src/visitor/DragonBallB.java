package visitor;

public class DragonBallB implements DragonBallAll {
    @Override
    public void show(Purchase purchase) {
        purchase.buy(this);
    }
}
