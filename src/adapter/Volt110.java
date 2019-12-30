package adapter;

public class Volt110 implements PowerSocket {
    @Override
    public int showPower() {
        return 110;
    }
}
