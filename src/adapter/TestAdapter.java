package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Volt110 volt110 = new Volt110();
        Adapter adapter110 = new Adapter(volt110);
        System.out.println(volt110.showPower() + "轉成" + adapter110.showPower());

        Volt220 volt220 = new Volt220();
        Adapter adapter220 = new Adapter(volt220);
        System.out.println(volt220.showPower() + "轉成" + adapter220.showPower());
    }
}
