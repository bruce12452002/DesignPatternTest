package strategy;

public class SHA256Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("SHA256 加密");
    }
}
