package prototype.zoo;

public class Tiger extends Animal {
    public Tiger() {
        name = "老虎";
    }

    @Override
    public void say() {
        System.out.println("我是" + name);
    }
}
