package composite.laiteosat;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

    private int hinta;
    List<Laiteosa> laiteosaList;

    public Emolevy(int hinta) {
        this.hinta = hinta;
        this.laiteosaList = new ArrayList<>();
    }

    public int getHinta() {
        for(Laiteosa l: laiteosaList) {
            hinta = hinta + l.getHinta();
        }
        return hinta;
    }

    public void addLaiteosa(Laiteosa l) {
        laiteosaList.add(l);
    }
}
