package flyweight;

public class Text {
    private char txt;

    public Text(char txt) {
        this.txt = txt;
    }

    public void display() {
        System.out.println(txt);
    }
}
