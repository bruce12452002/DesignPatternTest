package cor;

public abstract class CarHandler {
    protected CarHandler next;

    public abstract void handle();

    public CarHandler setNext(CarHandler carHandler) {
        return this.next = carHandler;
    }
}
