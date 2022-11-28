package cor.example2;

public class BHandler extends Handler {

    @Override
    protected int getLevel() {
        return 2;
    }

    @Override
    protected void process(Req req) {
        System.out.println("b");
    }
}
