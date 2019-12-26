package cor;

public class CarTail extends CarHandler {
    @Override
    public void handle() {
        System.out.println("組裝車尾");
        if (super.carHandler != null) {
            super.carHandler.handle();
        }
    }
}