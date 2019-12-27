package state;

public class Shape {
    private int type;
    private ShapeState state = new CircleShape();

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ShapeState getState() {
        return state;
    }

    public void setState(ShapeState state) {
        this.state = state;
    }

    public void doSomething() {
        /*
        if (type == 0) {
//            System.out.println("圓形");
            state = new CircleShape();
        } else if (type == 3) {
//            System.out.println("三角形");
            state = new TriangleShape();
        } else {
//            System.out.println("未定義");
            state = new UndefinedShape();
        }
        state.doSomething();
         */

        state.doSomething(this);
        state = new CircleShape(); // 如不加此行，那用戶端執行到最後一個 Shape，就永遠是最後一個 Shape 了
    }
}
