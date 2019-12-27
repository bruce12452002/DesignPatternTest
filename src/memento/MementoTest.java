package memento;

public class MementoTest {
    // 備忘錄模式：可以 rollback

    public static void main(String[] args) {
        // 未使用備忘錄模式
        /*
        Computer c1 = new Computer("奔驣3", "987-AS5", 12345.67);
//        Computer c2 = computer1; // 淺複製
        Computer c2 = new Computer(c1.getName(), c1.getSn(), c1.getPrice());

        System.out.println(c1.getPrice());
        System.out.println(c2.getPrice());
        System.out.println("------------------");

        c1.setPrice(65432.5);
        System.out.println(c1.getPrice());
        System.out.println(c2.getPrice());
        System.out.println("------------------");

        // rollback
        c1 = c2;
        System.out.println(c1.getPrice());
        System.out.println(c2.getPrice());
        */

        // 使用備忘錄模式
        Computer c1 = new Computer("奔驣3", "987-AS5", 12345.67);
        Caretaker caretaker = new Caretaker(c1.addMemento());
//        Memento memento = c1.addMemento();

        System.out.println(c1.getPrice());
        System.out.println("------------------");

        c1.setPrice(65432.5);
        System.out.println(c1.getPrice());
        System.out.println("------------------");

//        c1.restore(memento);
        c1.restore(caretaker.getMemento());
        System.out.println(c1.getPrice());
    }
}
