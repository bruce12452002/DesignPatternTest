package template_method;

public class TemplateMethodTest {
    // 模板方法設計模式：

    public static void main(String[] args) {
        productCar(new Bus());
        productCar(new Bicycle());
    }

    private static void productCar(ProductCar car) {
//        car.doHead();
//        car.doBody();
//        car.doTail();
        car.doCar();
        System.out.println("--------------");
    }
}
