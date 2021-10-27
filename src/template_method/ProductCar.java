package template_method;

public abstract class ProductCar {
    protected abstract void doHead();

    protected abstract void doBody();

    protected abstract void doTail();

    public final void doCar() { // final 防止被覆寫亂改
        doHead();
        doBody();
        doTail();
    }
}
