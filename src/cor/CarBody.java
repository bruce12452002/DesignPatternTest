package cor;

public class CarBody extends CarHandler {
    @Override
    public void handle() {
        System.out.println("組裝車身");
        if (super.carHandler != null) {
            super.carHandler.handle();
        }
    }
}