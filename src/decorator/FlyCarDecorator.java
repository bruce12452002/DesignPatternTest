package decorator;

public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator() {
        super(new RunCar());
    }

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.getCar().show();
        this.fly();
    }

    public void fly() {
        System.out.println("我飛");
    }
}
