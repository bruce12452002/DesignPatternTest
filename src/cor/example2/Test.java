package cor.example2;

public class Test {
    public static void main(String[] args) {
        Handler a = new AHandler();
        Handler b = new BHandler();
        Handler c = new CHandler();

        a.setNext(b);
        b.setNext(c);

        Req req = new Req();
        req.setLevel(2);

        a.approve(req);
    }
}
