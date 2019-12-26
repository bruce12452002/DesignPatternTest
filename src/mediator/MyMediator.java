package mediator;

public class MyMediator implements Mediator {
    private Man man;
    private Woman woman;

    public void setMan(Man man) {
        this.man = man;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    @Override
    public void getPartner(Person person) {
        if (person instanceof Man) {
            setMan((Man) person);
        } else {
            setWoman((Woman) person);
        }

        if (man == null || woman == null) {
//            System.out.println("不支持同性婚姻");
        } else {
            if (man.getCondition() == woman.getCondition()) {
                System.out.println(man.getName() + "和" + woman.getName() + "匹配");
            } else {
                System.out.println(man.getName() + "和" + woman.getName() + "不匹配");
            }
        }
        man = null;
        woman = null;
    }
}
