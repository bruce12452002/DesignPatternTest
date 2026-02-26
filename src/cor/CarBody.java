package cor;

public class CarBody extends CarHandler {
    @Override
    public void handle() {
        System.out.println("組裝車身");
        if (super.next != null) {
            super.next.handle();
        }
    }
}