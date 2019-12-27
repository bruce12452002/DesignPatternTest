package state;

public class StateTest {
    // 狀態模式：修改其中一個狀態感覺像改了整個類的行為

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setType(0);
        shape.doSomething();

        shape.setType(8);
        shape.doSomething();

        shape.setType(0);
        shape.doSomething();
    }
}
