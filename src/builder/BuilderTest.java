package builder;

public class BuilderTest {
    // 以往都是 new 完 class，然後 setter
    // 使用 builder 設計模式，由 director 當管理者，由管理者叫 xxxBuilder 來做即可

    public static void main(String[] args) {
        HouseBuilder builder1 = new GeneralHouseBuilder();
        new HouseDirector().construct(builder1);

        House house1 = builder1.getHouse();
        display(house1);

        System.out.println("---------------------");
        HouseBuilder builder2 = new RichlHouseBuilder();
        new HouseDirector().construct(builder2);

        House house2 = builder2.getHouse();
        display(house2);
    }

    private static void display(House house) {
        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getTop());
    }
}
