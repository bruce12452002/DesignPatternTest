package proxy.dynamic;

import proxy.Teacher;
import proxy.TeacherA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest2 {
    // 動態代理模式

    public static void main(String[] args) {
        Teacher teacher = new TeacherA();
        InvocationHandler teacherDynamicProxy = new TeacherDynamicProxy2<>(teacher);
        Teacher t = (Teacher) Proxy.newProxyInstance(teacher.getClass().getClassLoader(),
                teacher.getClass().getInterfaces(),
                teacherDynamicProxy);
        t.teach();
    }
}
