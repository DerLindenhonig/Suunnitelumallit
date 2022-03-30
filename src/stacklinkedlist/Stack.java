package stacklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
    private LinkedList<String> list;

    public Stack() {
        list = new LinkedList<String>();
    }

    // Muodostaa uusi lista alkio ja aseta se pinon huipulle
    void push(String mData) {
        list.add(mData);
    }

    // Poistetaan ja palautetaan alkio pinon huipulta
    // jos pino on tyhjä palautetaan null
    public String pop() {
        list.pop();
        return null;
    }

    // Tulostaa pinon muuttamatta pinoa
    public void printItems() {
        Iterator i = list.iterator();
        while(i.hasNext()) {
            System.out.println(i.hasNext());
        }
    }

    // Palauttaa pinottujen alkioiden lukumäärä
    public int getSize() {
        return list.size();
    }
}
