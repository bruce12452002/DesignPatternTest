package proxy.cglib;

public class CglibProxyTest {
    // CGLIB Byte 動態代理模式

    public static void main(String[] args) {
        Teacher teacher = new Teacher(); // 此類別不需實作任何東西，但不能是 final class，錯誤訊息很明顯
        // Teacher 的方法也不能是 final，不會出錯，但只會執行此方法而已

        Teacher t = new TeacherCglibProxy<Teacher>(teacher).getProxyInstance();
        // System.out.println(t); // 這行也會執行到代理裡的方法(除了method.invoke)
        // System.out.println(t.getClass());
        t.teach();
    }
}
