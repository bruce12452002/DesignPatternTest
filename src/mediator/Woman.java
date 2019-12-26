package mediator;

public class Woman extends Person {
    public Woman(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void getPartner(Person person) {
        super.getMediator().setWoman(this);
        super.getMediator().getPartner(person);
//        if (person.getName().equals(getName())) {
//            System.out.println("自己如何匹配");
//        } else if (person instanceof Woman) {
//            System.out.println(this.getName() + "說：對象是" + person.getName() + "，我已經有洞了");
//        } else {
//            if (super.getCondition() == person.getCondition()) {
//                System.out.println(this.getName() + "和" + person.getName() + "匹配");
//            } else {
//                System.out.println(this.getName() + "和" + person.getName() + "不匹配");
//            }
//        }
    }
}
