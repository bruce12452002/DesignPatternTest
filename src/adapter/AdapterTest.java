package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Target adapter = new Adapter(new Source());
        System.out.println(adapter.transfer());
    }
}
