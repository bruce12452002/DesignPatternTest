package mediator;

public abstract class Person {
    private String name;
    private int condition;
    private Mediator mediator;

    public Person(String name, int condition, Mediator mediator) {
        this.name = name;
        this.condition = condition;
        this.mediator = mediator;
    }

    //    public Person(String name, int condition) {
//        this.name = name;
//        this.condition = condition;
//    }

    public String getName() {
        return name;
    }

    public int getCondition() {
        return condition;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void getPartner(Person person);
}
