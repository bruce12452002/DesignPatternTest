package template_method;

public abstract class ProductCar {
    public abstract void doHead();

    public abstract void doBody();

    public abstract void doTail();

    public void doCar() {
        doHead();
        doBody();
        doTail();
    }
}
