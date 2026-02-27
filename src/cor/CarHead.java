package cor;

public class CarHead extends CarHandler {
    @Override
    public void handle() {
        System.out.println("組裝車頭");
//        if (next != null) { 改寫在父類
//            next.handle();
//        }
        getNextHandle();
    }
}