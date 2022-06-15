package adapter;

public class Adapter implements Target {
    private final Source source; // 寫在這是物件適配器；寫在 extends 後面是類別適配器

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public int transfer() {
        return source.output220() / 2;
    }
}
