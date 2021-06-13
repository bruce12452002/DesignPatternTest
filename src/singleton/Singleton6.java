package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum Singleton6 { // enum
    INSTANCE;

    // 取得實體後才能使用的方法
    public Singleton6 getInstance() {
        return INSTANCE;
    }

    // 單例 Enum 可防止反射的 new
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        // Exception in thread "main" java.lang.NoSuchMethodException: singleton.Singleton6.<init>() 沒有預設建構子，使用 javap -p 居然看不出來
        // Constructor<Singleton6> declaredConstructor = Singleton6.class.getDeclaredConstructor();

        // 通過反編譯，可發現 enum 本身就是個 class，繼承了抽象的 Enum，它只有一個兩個參數的建構子，String 和 int
        // String name, int ordinal：可以得到 INSTANCE 這個字串和第幾個，從 0 開始
        Constructor<Singleton6> declaredConstructor = Singleton6.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Singleton6 instance = declaredConstructor.newInstance();
        System.out.println(instance);
    }
}
