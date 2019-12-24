package observer;

import java.util.Observable;

public class User extends Observable /*被觀察者， JDK9 已廢棄*/ {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;

        this.setChanged(); // 必須比下一行還早設定
        this.notifyObservers(); // 通知觀察者
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        this.setChanged(); // 必須比下一行還早設定
        this.notifyObservers("123xxx"); // 通知觀察者並傳參數
    }
}
