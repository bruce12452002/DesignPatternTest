package proxy.statick;

import proxy.Teacher;
import proxy.TeacherA;

public class StaticProxyTest {
    // 靜態代理模式

    public static void main(String[] args) {
        Teacher teacher = new TeacherA();
        TeacherStaticProxy teachProxy = new TeacherStaticProxy(teacher);
        teachProxy.teach();
    }
}