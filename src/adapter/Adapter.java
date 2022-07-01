package adapter;

public class Adapter implements Target {
    private final Source source; // 寫在這是物件適配器；寫在 extends 後面是類別適配器

    /**
     * 介面適配器：一個介面有很多方法，但不是全部都想使用，可用抽象類實現空方法
     * 然後新的 Adapter 實現抽象類，而且只實現自己想實作的方法
     */

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public int transfer() {
        return source.output220() / 2;
    }
}
