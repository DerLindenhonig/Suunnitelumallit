package tietorakenteet_ja_algoritmit.stack;

public class Stack {
    private ListItem mTop;
    private int mSize;

    public Stack() {
        mTop = null;
        mSize = 0;
    }

    // Muodostaa uusi lista alkio ja aseta se pinon huipulle
    void push(String mData) {
        ListItem item = new ListItem();
        item.setmData(mData);
        item.setmNext(mTop);
        mTop = item;
        mSize++;
    }

    // Poistetaan ja palautetaan alkio pinon huipulta
    // jos pino on tyhjä palautetaan null
    public ListItem pop() {
        if(mTop != null) {
            ListItem deletedItem = mTop;
            mTop = mTop.getmNext();
            mSize--;
            return deletedItem;
        }

        return null;
    }

    // Tulostaa pinon muuttamatta pinoa
    public void printItems() {
        ListItem item = mTop;
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
