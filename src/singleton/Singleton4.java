package singleton;

public class Singleton4 { // double-checked locking(DCL), 雙重校檢鎖
    private volatile static Singleton4 instance; // volatile 作用：內存可見性、排序性

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    // 為什麼 instance 要使用 volatile 關鍵字？答案為排序性(指令重排序)

                    // 1.在 stack 中分配記憶體
                    // 2.填充必要信息+具體資料初始化+末位填充
                    // 3.將引用指向物件的 stack 的地址 (此時第一個判斷 null 才會 false)

                    // 有可能為 132 的順序，而在執行到 13 時，其他執行緒進來了，判斷非 null，而返回半成品的 instance
					// 所以加上 volatile 後會按照 123 的順序，假設執行到 12 時，其他執行緒進來了，判斷會是 null 而到 synchronized 處等待
					// 雖然 synchronized 也有排序性，但第 10 行不在 synchronized 裡面
					// return 之後雖然也有可能完成 instance，但是在 synchronized 外面，所以只是有可能
					// 這個出錯的機率非常的低，併發量要高到非常誇張才有可能出現錯誤
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
