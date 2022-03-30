package tietorakenteet_ja_algoritmit.jono;

public class Queue {
    private ListItem mTop;
    private ListItem head;
    private ListItem tail;
    private int mSize;

    public Queue() {
        head = null;
        tail = null;
        mSize = 0;
    }

    // Muodostaa uusi lista alkio ja aseta se pinon huipulle
    void push(String mData) {
        ListItem item = new ListItem();
        item.setmData(mData);
        if(head == null) {
            head = item;
        }
        if(tail != null) {
            tail.setmNext(item);
        }
        tail = item;
        mSize++;
    }

    // Poistetaan ja palautetaan alkio pinon huipulta
    // jos pino on tyhjä palautetaan null
    public ListItem pop() {
        if(head != null) {
            ListItem deletedItem = head;
            head = head.getmNext();
            mSize--;
            return deletedItem;
        }

        return null;
    }

    // Tulostaa pinon muuttamatta pinoa
    public void printItems() {
        ListItem item = head;
        while (item != null) {
            System.out.println(item.getmData());
            item = item.getmNext();
        }
    }

    // Palauttaa pinottujen alkioiden lukumäärä
    public int getSize() {
        return mSize;
    }
}
