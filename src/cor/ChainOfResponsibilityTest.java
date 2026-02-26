package cor;

public class ChainOfResponsibilityTest {
    //

    public static void main(String[] args) {
//        new CarHead().handle();
//        new CarBody().handle();
//        new CarTail().handle();

        getCar().handle();
    }

    private static CarHandler getCar() {
        CarHandler head = new CarHead();
        CarHandler body = new CarBody();
        CarHandler tail = new CarTail();

        // 車頭 -> 車身 -> 車尾 的順序
        head.setNext(body).setNext(tail);
        return head;
    }
}
