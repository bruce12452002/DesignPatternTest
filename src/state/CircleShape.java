package state;

public class CircleShape extends ShapeState {
    @Override
    public void doSomething(Shape shape) {
        if(shape.getType() == 0){
            System.out.println("圓形");
        } else {
            shape.setState(new TriangleShape());
            shape.doSomething();
        }
    }
}
