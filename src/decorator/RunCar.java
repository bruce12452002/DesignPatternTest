package decorator;

public class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

}
