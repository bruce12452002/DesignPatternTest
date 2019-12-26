package mediator;

public class Man extends Person {
    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void getPartner(Person person) {
        Mediator mediator = super.getMediator();
        mediator.setMan(this);
        mediator.getPartner(person);

//        if (person.getName().equals(getName())) {
//            System.out.println("自己如何匹配");
//        } else if (person instanceof Man) {
//            System.out.println(this.getName() + "說：對象是" + person.getName() + "，我已經有老二了");
//        } else {
//            if (super.getCondition() == person.getCondition()) {
//                System.out.println(this.getName() + "和" + person.getName() + "匹配");
//            } else {
//                System.out.println(this.getName() + "和" + person.getName() + "不匹配");
//            }
//        }
    }
}
