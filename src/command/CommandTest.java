package command;

public class CommandTest {
    // 命令模式

    public static void main(String[] args) {
        // 未使用命令模式
//        Sweet sweet = new Sweet();
//        sweet.doChocolateCake();
//        sweet.doStrawberryCake();

        // 使用命令模式
        Command c1 = new StrawberryCommand(new Sweet());
        Command c2 = new ChocolateCommand(new Sweet());
        c1.doCake();
        c2.doCake();
    }
}
