package template_method;

public abstract class ProductCar {
    public abstract void doHead();

    public abstract void doBody();

    public abstract void doTail();

    public final void doCar() { // final 防止被覆寫亂改
        doHead();
        doBody();
        doTail();
    }
}
