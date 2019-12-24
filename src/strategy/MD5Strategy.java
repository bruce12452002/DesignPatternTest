package strategy;

public class MD5Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("MD5 加密");
    }
}
