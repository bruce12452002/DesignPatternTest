package prototype.zoo;

public abstract class Animal implements Cloneable {
    private Integer id;
    protected String name;

    abstract void say();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
