package prototype.zoo;

public class Rabbit extends Animal {
    public Rabbit() {
        name = "兔子";
    }

    @Override
    public void say() {
        System.out.println("我是" + name);
    }
}
