package builder;

public class RichHouseBuilder implements HouseBuilder {
    @Override
    public void fixFloor() {
        house.setFloor("很貴的地板");
    }

    @Override
    public void fixWall() {
        house.setWall("很貴的牆");
    }

    @Override
    public void fixTop() {
        house.setTop("很貴的屋頂");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
