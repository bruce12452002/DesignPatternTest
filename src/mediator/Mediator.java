package mediator;

public interface Mediator {
    void setMan(Man man);

    void setWoman(Woman woman);

    void getPartner(Person person);
}
