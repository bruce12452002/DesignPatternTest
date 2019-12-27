package state;

public class UndefinedShape extends ShapeState {
    @Override
    public void doSomething(Shape shape) {
        System.out.println("型態" + shape.getType() + "未定義");
    }
}
