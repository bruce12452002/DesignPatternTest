package mediator;

import java.util.List;

public class MediatorTest {
    // 中介者模式

    public static void main(String[] args) {
        MyMediator mediator = new MyMediator();

        List<Person> list = List.of(
                new Man("張無忌", 5, mediator)
                ,new Woman("周芷若", 5, mediator)
                ,new Woman("趙敏", 5, mediator)
                ,new Man("金毛獅王", 6, mediator)
                ,new Woman("五枚師太", 6, mediator)
                ,new Man("謝遜", 6, mediator)
        );

        /*
        List<Person> list = List.of(
                new Man("張無忌", 5),
                new Woman("周芷若", 5),
                new Woman("趙敏", 5),
                new Man("金毛獅王", 6),
                new Woman("五枚師太", 6),
                new Man("謝遜", 6)
        );
        */

        /*
        list.forEach(p1 -> {
            list.forEach(p2 -> {
                p1.getPartner(p2);
            });
        });
        */

        list.forEach(p -> {
            list.forEach(p::getPartner);
            System.out.println();
        });
    }
}
