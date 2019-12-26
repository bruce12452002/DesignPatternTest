package cor;

public class CarHead extends CarHandler {
    @Override
    public void handle() {
        System.out.println("組裝車頭");
        if (super.carHandler != null) {
            super.carHandler.handle();
        }
    }
}