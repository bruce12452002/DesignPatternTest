package iterator;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    // 迭代模式

    public static void main(String[] args) {
        /*
        FruitList fruitList = new FruitList();
        fruitList.addFruit(new Fruit("香蕉", new BigDecimal("12.3"), new BigDecimal("20.7")));
        fruitList.addFruit(new Fruit("鳳梨", new BigDecimal("41.7"), new BigDecimal("30.1")));
        fruitList.addFruit(new Fruit("蘋果", new BigDecimal("22.2"), new BigDecimal("20.5")));
        */

        /* 沒使用迭代模式 方法一
        while (fruitList.hasNext()) {
            Fruit fruit = fruitList.next();
            System.out.println(fruit.getName());
            System.out.println(fruit.getPrice());
            System.out.println(fruit.getWeight());
            System.out.println();
        }
        */

        /* 沒使用迭代模式 方法二
        List<Fruit> f = fruitList.getFruitList();
        f.forEach(fr -> {
            System.out.println(fr.getName());
            System.out.println(fr.getPrice());
            System.out.println(fr.getWeight());
            System.out.println();
        });
         */

        // 使用迭代模式
        FruitList2<Fruit> fruitList = new FruitList2<>();
        fruitList.add(new Fruit("香蕉", new BigDecimal("12.3"), new BigDecimal("20.7")));
        fruitList.add(new Fruit("鳳梨", new BigDecimal("41.7"), new BigDecimal("30.1")));
        fruitList.add(new Fruit("蘋果", new BigDecimal("22.2"), new BigDecimal("20.5")));

        Iterator<Fruit> it = fruitList.iterator();
        while(it.hasNext()) {
            Fruit fr = it.next();
            System.out.println(fr.getName());
            System.out.println(fr.getPrice());
            System.out.println(fr.getWeight());
            System.out.println();
        }
    }
}
