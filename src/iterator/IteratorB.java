package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *    b) Säikeet käyttävät samaa iteraattoria vuorotellen.
 * */

public class IteratorB {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> i1 = numbers.iterator();
        Iterator<Integer> i2 = numbers.iterator();

        Saie saie1 = new Saie("eka säie", i1);
        Saie saie2 = new Saie("toka säie", i2);

        saie1.start();
        saie2.start();

        saie1.join();
        saie2.join();
    }
}
