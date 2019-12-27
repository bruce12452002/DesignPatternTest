package memento;

public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        setMemento(memento);
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
