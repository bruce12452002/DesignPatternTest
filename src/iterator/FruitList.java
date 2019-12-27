package iterator;

import java.util.ArrayList;
import java.util.List;

public class FruitList {
    private List<Fruit> fruitList = new ArrayList<>();
//    private int index; // 沒使用迭代模式 方法一

    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    public void delFruit(Fruit fruit) {
        fruitList.remove(fruit);
    }

    /* 沒使用迭代模式 方法一
    public boolean hasNext() {
        if (index >= fruitList.size()) {
            return false;
        }
        return true;
    }

    public Fruit next() {
        return fruitList.get(index++);
    }
    */

    /* 沒使用迭代模式 方法二
    public List<Fruit> getFruitList() {
        return fruitList;
    }
    */
}
