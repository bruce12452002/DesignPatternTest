package command;

public class StrawberryCommand extends Command {
    public StrawberryCommand(Sweet sweet) {
        super(sweet);
    }

    @Override
    public void doCake() {
        super.sweet.doStrawberryCake();
    }
}
