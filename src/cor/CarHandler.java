package cor;

public abstract class CarHandler {
    protected CarHandler next;

    public abstract void handle();

    public CarHandler setNext(CarHandler carHandler) {
        this.next = carHandler;
        return carHandler; // 因為指派給 this.next，所以 return this.next 也行

        // 可簡化成一行
        // return this.next = carHandler;

        // 注意以下寫法的問題
        // this.next = carHandler;
        // return this;
        // 問題就是 return this;
        // 當 head.setNext(body).setNext(tail);
        // 第一次的 this 是 head，然後將 body 放到 next 裡，最後回傳 head
        // 所以第二次的 this 是 head 不是 body，然後將 tail 放到 next 裡，最後回傳 head
        // 最後的結果就是 head --> tail，中間的鏈都不見了
        // 但改成 return carHandler 時，傳進來是什麼就是什麼了
    }
}
