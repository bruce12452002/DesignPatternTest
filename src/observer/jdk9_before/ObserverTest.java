package observer.jdk9_before;

public class ObserverTest {
    // 使用JDK的觀察者(Observer)
    // 被觀察者(Observable) 要 setChanged() 和註冊才可以

    public static void main(String[] args) {
        User user = new User();

        // 註冊觀察者
        MyObserver myObserver = new MyObserver();
        user.addObserver(myObserver); // 必需寫在 setter 之前，不同實體註冊幾次就會執行幾次(同實體算一次)
        user.addObserver(new MyObserver());
        System.out.println(user.countObservers()); // 觀察次數(同實體算一次)
        user.setId(8);
        user.setName("ooo"); // 第一次印出來會是 null，因為 setId 觸發了被觀察者，而 setName 還沒執行，而 name 預設為 null

        System.out.println("------------------------");
//        user.deleteObservers(); // 關閉所有觀察者
        user.deleteObserver(myObserver); // 關閉指定的觀察者
        user.setId(7);
        user.setName("xxx"); // 第一次印出來會是 null，因為 setId 觸發了被觀察者，而 setName 還沒執行，而 name 預設為 null
    }
}
