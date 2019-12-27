package command;

public class ChocolateCommand extends Command {
    public ChocolateCommand(Sweet sweet) {
        super(sweet);
    }

    @Override
    public void doCake() {
        super.sweet.doChocolateCake();
    }
}
