package strategy;

public class StrategyTest {
    // 由用戶端選擇策略
    // 和裝飾者模式有點像，但裝飾者還要再繼承 Context

    public static void main(String[] args) {
        display(new MD5Strategy());
        display(new SHA256Strategy());
    }

    private static void display(Strategy strategy) {
        new StrategyContext(strategy).encrypt();
    }
}
