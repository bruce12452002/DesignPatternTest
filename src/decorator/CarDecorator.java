package decorator;

public abstract class CarDecorator implements Car {
    private Car car;

    @Override
    public abstract void show();

    public CarDecorator(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
