package iterator;

import java.util.Iterator;

public class SaieD extends Thread {
    private String nimi;
    private Iterator iterator;

    public SaieD(String nimi, Iterator iterator) {
        this.nimi = nimi;
        this.iterator = iterator;
    }

    public void run() {
        while(iterator.hasNext()) {
            iterator.forEachRemaining((number) -> System.out.println(nimi + " " + number));
            iterator.forEachRemaining((number) -> System.out.println(nimi + " " + number));
        }
    }
}
