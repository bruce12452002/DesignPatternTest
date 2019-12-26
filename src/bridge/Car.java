package bridge;

public abstract class Car {
    private Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    public Tire getTire() {
        return tire;
    }

    public abstract void makeTire();
}
