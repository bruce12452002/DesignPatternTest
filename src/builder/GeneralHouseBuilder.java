package builder;

public class GeneralHouseBuilder implements HouseBuilder {
    @Override
    public void fixFloor() {
        house.setFloor("一般地板");
    }

    @Override
    public void fixWall() {
        house.setWall("一般牆");
    }

    @Override
    public void fixTop() {
        house.setTop("一般屋頂");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
