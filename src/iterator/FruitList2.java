package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitList2<T> {
    private List<T> list = new ArrayList<>();
    private int index;

    public void add(T type) {
        list.add(type);
    }

    public void remove(T type) {
        list.remove(type);
    }

    public Iterator<T> iterator() {
        return new Itr();
    }


    private class Itr implements Iterator<T> {
        @Override
        public boolean hasNext() {
            if (index >= list.size()) {
                return false;
            }
            return true;
        }

        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
