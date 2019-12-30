package adapter;

public class Volt220 implements PowerSocket {
    @Override
    public int showPower() {
        return 220;
    }
}
