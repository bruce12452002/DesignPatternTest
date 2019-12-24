package builder;

public interface HouseBuilder {
    House house = new House();

    void fixFloor();

    void fixWall();

    void fixTop();

    House getHouse();
}
