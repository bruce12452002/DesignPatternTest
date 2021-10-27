package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Singleton2 { // 懶漢式, thread-safe
    private static Singleton2 instance;
    private static boolean flag = false;

    private Singleton2() {
        synchronized (Singleton4.class) {
            if (!flag) {
                flag = true;
            } else {
                throw new RuntimeException("don't user reflection!");
            }

//            if (instance != null) {
//                throw new RuntimeException("don't user reflection!");
//            }
        }
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
            // return new Singleton1(); // 因為有可能一開始就進來很多執行緒，直接回傳不是 static
        }
        return instance;
    }

    // 反射測試，只有 單例 enum 才可防止反射的 new
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Singleton2 instance = Singleton2.getInstance();
//        Singleton2 instance2 = Singleton2.getInstance();
//        System.out.println(instance);
//        System.out.println(instance2);

        Field flag = Singleton2.class.getDeclaredField("flag");
        flag.setAccessible(true);

        Constructor<Singleton2> declaredConstructor = Singleton2.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton2 instance3 = declaredConstructor.newInstance(); // newInstance() 原碼有提示，使用 Enum 可防止反射取得實體
        flag.set(instance3, false);
        Singleton2 instance4 = declaredConstructor.newInstance();
        System.out.println(instance3);
        System.out.println(instance4);
    }
}
