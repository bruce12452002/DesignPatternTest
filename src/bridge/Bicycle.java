package bridge;

public class Bicycle extends Car {
    public Bicycle(Tire tire) {
        super(tire);
    }

    @Override
    public void makeTire() {
        System.out.print("孔明車");
        super.getTire().makeTire();
    }
}
