package template_method;

public class Bus extends ProductCar {
    @Override
    public void doHead() {
        System.out.println("bus:做車頭");
    }

    @Override
    public void doBody() {
        System.out.println("bus:做車身");
    }

    @Override
    public void doTail() {
        System.out.println("bus:做車尾");
    }
}
