package adapter;

public class Adapter implements PowerSocket {
    private PowerSocket socket;

    public Adapter() {
    }

    public Adapter(PowerSocket socket) {
        this.socket = socket;
    }

    @Override
    public int showPower() {
        if (socket.showPower() == 110) {
            return 220;
        } else if (socket.showPower() == 220) {
            return 110;
        }
        throw new NullPointerException();
    }
}
