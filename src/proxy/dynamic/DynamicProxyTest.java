package proxy.dynamic;

import proxy.Teacher;
import proxy.TeacherA;

public class DynamicProxyTest {
    // 動態代理模式

    public static void main(String[] args) {
        Teacher teacher = new TeacherA();
        TeacherDynamicProxy<Teacher> teacherDynamicProxy = new TeacherDynamicProxy<>(teacher);
        Teacher t = teacherDynamicProxy.getProxyInstance1();
        // System.out.println(t); // 這行也會執行到代理裡的方法(除了method.invoke)
        // System.out.println(t.getClass());
        t.teach();
    }
}
