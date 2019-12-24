package facade;

public class FacadeTest {
    // 外觀設計模式，集合一個類別，將相關的物件集中起來管理
    // 用戶端只要知道一個類別即可

    public static void main(String[] args) {
        // 沒使用外觀設計模式
        var systemA = new SystemA();
        var systemB = new SystemB();
        var systemC = new SystemC();

        systemA.doSomething();
        systemB.doSomething();
        systemC.doSomething();

        // 使用外觀設計模式
        System.out.println("------------------");
        var facade = new Facade();
        facade.doABC();
    }
}
