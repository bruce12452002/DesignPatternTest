package cor;

public abstract class CarHandler {
    protected CarHandler carHandler;

    public abstract void handle();

    public CarHandler setNextHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return carHandler;
    }
}
