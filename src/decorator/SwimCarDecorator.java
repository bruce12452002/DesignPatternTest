package decorator;

public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator() {
        super(new RunCar());
    }

    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.getCar().show();
        this.swim();
    }

    public void swim() {
        System.out.println("我游");
    }
}
