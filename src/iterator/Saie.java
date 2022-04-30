package iterator;

import java.util.Iterator;

public class Saie extends Thread {
    private String nimi;
    private Iterator iterator;

    public Saie(String nimi, Iterator iterator) {
        this.nimi = nimi;
        this.iterator = iterator;
    }

    public void run() {
        while(iterator.hasNext()) {
            System.out.println(nimi + " " + iterator.next());
        }
    }
}
