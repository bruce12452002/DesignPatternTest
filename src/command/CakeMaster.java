package command;

public class CakeMaster {
    private Command command;

    public CakeMaster(Command command) {
        this.command = command;
    }

    public void doCake() {
        command.doCake();
    }
}
