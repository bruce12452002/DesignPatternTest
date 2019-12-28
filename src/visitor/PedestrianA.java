package visitor;

public class PedestrianA implements Purchase {
    @Override
    public void buy(DragonBall dragonBall) {

    }

    @Override
    public void buy(DragonBallA dragonBallA) {
        System.out.println("路人甲買七龍珠第一集");
    }

    @Override
    public void buy(DragonBallB dragonBallB) {

    }
}
