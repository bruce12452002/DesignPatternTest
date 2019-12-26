package interpreter;

public interface Expression extends Cloneable {
    void interpreter(Context ctx);

//    Object clone() throws CloneNotSupportedException;
}
