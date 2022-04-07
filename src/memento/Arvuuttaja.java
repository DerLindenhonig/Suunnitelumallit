package memento;

import java.util.Random;

public class Arvuuttaja {

    public Object liityPeliin() {
        Random rand = new Random();
        int luku = rand.nextInt(9) + 1;
        System.out.println("Arvuuttaja keksi luvun: " + luku);
        return new Memento(luku);
    }

    public boolean tarkistaaLuku(Object m, int arvaus) {
        Memento memento = (Memento) m;

        if(memento.getLuku() == arvaus) {
            return true;
        } else return false;
    }

    // Memento on sisäluokka, josta ulkomaailma ei tiedä mitään.
    private class Memento {
        private int luku;

        public Memento(int luku) {
            this.luku = luku;
        }

        // vain ulkoluokan käytettävissä
        private int getLuku() {
            return luku;
        }
    }
}
