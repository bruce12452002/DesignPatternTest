package builder;

public class HouseDirector {
    public void construct(HouseBuilder builder) {
        builder.fixFloor();
        builder.fixWall();
        builder.fixTop();
    }
}
