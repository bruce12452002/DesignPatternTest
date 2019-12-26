package bridge;

public class BridgeTest {
    // 車和輪胎，車有很多的車；輪胎有很多廠牌的輸胎，彼此各自獨立
    // 使用橋接器模式將兩個接起來，做法是將其中一個物件寫在另外一個物件的屬性，然後給方法或建構子給這個物件賦值

    public static void main(String[] args) {
        Tire ta = new TireA();
        Tire tb = new TireB();

        Car c1 = new Bus(ta);
        Car c2 = new Bicycle(tb);
        c1.makeTire();
        c2.makeTire();
    }
}
