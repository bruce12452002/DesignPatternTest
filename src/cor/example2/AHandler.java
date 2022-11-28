package cor.example2;

public class AHandler extends Handler {

    @Override
    protected int getLevel() {
        return 1;
    }

    @Override
    protected void process(Req req) {
        System.out.println("a");
    }
}
