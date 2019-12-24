package facade;

public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void doABC() {
        systemA.doSomething();
        systemB.doSomething();
        systemC.doSomething();
    }
    public void doAC() {
        systemA.doSomething();
        systemC.doSomething();
    }
    public void doAB() {
        systemA.doSomething();
        systemB.doSomething();
    }
}
