package tietorakenteet_ja_algoritmit.stack;

public class ListItem {
    private String mData;
    private ListItem mNext;

    public ListItem() {}

    public void setmData(String mData) {
        this.mData = mData;
    }

    public void setmNext(ListItem mNext) {
        this.mNext = mNext;
    }

    public String getmData() {
        return mData;
    }

    public ListItem getmNext() {
        return mNext;
    }
}
