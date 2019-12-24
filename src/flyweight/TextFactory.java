package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextFactory {
    private Map<Character, Text> pool;

    public TextFactory() {
        pool = new HashMap<>();
    }

    public Text getText(Character ch) {
        Text text = pool.get(ch);

        // 如果有就可以共享
        if (text == null) {
            text = new Text(ch);
            pool.put(ch, text);
        }
        return text;
    }

}
