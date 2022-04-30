package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *    d) forEachRemaining -metodin testaus
 * */

public class IteratorD {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> i1 = numbers.iterator();
        Iterator<Integer> i2 = numbers.iterator();

        SaieD saie1 = new SaieD("eka säie", i1);
        SaieD saie2 = new SaieD("toka säie", i2);

        saie1.start();
        saie2.start();

        saie1.join();
        saie2.join();
    }
}
