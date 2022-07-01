package builder;

public class BuilderTest {
    // 以往都是 new 完 class，然後 setter
    // 使用 builder 設計模式，由 director 當管理者，由管理者叫 xxxBuilder 來做即可
    // 有點像簡單工廠，但這是特別定制的，如麵包工廠只產生麵包，建造者模式還可以要求更細，什麼口味的麵包，什麼醬料等…

    public static void main(String[] args) {
        HouseBuilder builder1 = new GeneralHouseBuilder();
        new HouseDirector().construct(builder1);

        House house1 = builder1.getHouse();
        display(house1);

        System.out.println("---------------------");
        HouseBuilder builder2 = new RichHouseBuilder();
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
