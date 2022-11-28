package cor.example2;

public class CHandler extends Handler {

    @Override
    protected int getLevel() {
        return 3;
    }

    @Override
    protected void process(Req req) {
        System.out.println("c");
    }
}
