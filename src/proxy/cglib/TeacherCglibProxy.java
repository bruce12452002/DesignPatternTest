package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TeacherCglibProxy<T> implements MethodInterceptor {
    private T target;

    public TeacherCglibProxy(T target) {
        this.target = target;
    }

    public T getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this); // MethodInterceptor 的父類別就是 Callback
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理教課開始");
        Object result = method.invoke(target, args);
        System.out.println("代理教課結束");
        return result;
    }
}
