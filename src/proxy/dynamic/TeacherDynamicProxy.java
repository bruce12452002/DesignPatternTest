package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class TeacherDynamicProxy<T> {
    private T target;

    public TeacherDynamicProxy(T target) {
        this.target = target;
    }

    public T getProxyInstance1() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public T invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理教課開始");
                        Object result = method.invoke(target, args);
                        System.out.println("代理教課結束");
                        return (T) result;
                    }
                }
        );
    }

    public Object getProxyInstance2() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理教課開始");
                    Object result = method.invoke(target, args);
                    System.out.println("代理教課結束");
                    return result;
                });
    }
}
