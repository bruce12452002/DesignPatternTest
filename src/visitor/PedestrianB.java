package visitor;

public class PedestrianB implements Purchase {
    @Override
    public void buy(DragonBall dragonBall) {

    }

    @Override
    public void buy(DragonBallA dragonBallA) {

    }

    @Override
    public void buy(DragonBallB dragonBallB) {
        System.out.println("路人乙買七龍珠第二集");
    }
}
