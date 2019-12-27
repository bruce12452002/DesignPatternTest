package memento;

public class Computer {
    private String name;
    private String sn;
    private double price;

    public Computer(String name, String sn, double price) {
        this.name = name;
        this.sn = sn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Memento addMemento() {
        return new Memento(name, sn, price);
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.sn = memento.getSn();
        this.price = memento.getPrice();
    }
}
