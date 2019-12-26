package bridge;

public class Bus extends Car {
    // 必須實作連到父類的建構子，否則編譯不過
    public Bus(Tire tire) {
        super(tire);
    }

    @Override
    public void makeTire() {
        System.out.print("巴士");
        super.getTire().makeTire();
    }
}