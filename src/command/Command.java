package command;

public abstract class Command {
    protected Sweet sweet;

    public abstract void doCake();

    public Command(Sweet sweet) {
        this.sweet = sweet;
    }
}
