package template_method;

public class Bicycle extends ProductCar {
    @Override
    public void doHead() {
        System.out.println("bicycle:做車頭");
    }

    @Override
    public void doBody() {
        System.out.println("bicycle:做車身");
    }

    @Override
    public void doTail() {
        System.out.println("bicycle:做車尾");
    }
}
