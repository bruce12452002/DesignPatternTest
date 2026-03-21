package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class TeacherDynamicProxy2<T> implements InvocationHandler {
    private T target;

    public TeacherDynamicProxy2(T target) {
        this.target = target;
    }

    @Override
    public T invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理教課開始");
//        System.out.println(method.getName());
        T result = (T) method.invoke(target, args);
        System.out.println("代理教課結束");
        return result;
    }
}
