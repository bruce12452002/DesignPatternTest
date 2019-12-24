package flyweight;

public class FlyweightTest {
    // 共享物件、文字等的設計模式，可以減少記憶體容量

    public static void main(String[] args) {
        // 沒有用共享設計模式
        Text t1 = new Text('x');
        Text t2 = new Text('x');
        t1.display();
        t2.display();
        System.out.println(t1 == t2); // false

        // 使用共享設計模式
        System.out.println("-----------------------");
        TextFactory factory = new TextFactory();
        Text x1 = factory.getText('x');
        Text x2 = factory.getText('x');
        x1.display();
        x2.display();
        System.out.println(x1 == x2); // true
    }
}
