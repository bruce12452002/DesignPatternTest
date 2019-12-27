package state;

public class TriangleShape extends ShapeState {
    @Override
    public void doSomething(Shape shape) {
        if (shape.getType() == 3) {
            System.out.println("三角形");
        } else {
            shape.setState(new UndefinedShape());
            shape.doSomething();
        }
    }
}
