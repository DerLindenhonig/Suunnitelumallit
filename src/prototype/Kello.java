package prototype;

public class Kello implements Cloneable {
    private Viisari tunti;
    private Viisari minuutti;

    public Kello(int tunti, int minuutti) {
        this.tunti = new Viisari(tunti);
        this.minuutti = new Viisari(minuutti);
    }

    public Viisari getTunti() {
        return tunti;
    }

    public void setTunti(Viisari tunti) {
        this.tunti = tunti;
    }

    public Viisari getMinuutti() {
        return minuutti;
    }

    public void setMinuutti(Viisari minuutti) {
        this.minuutti = minuutti;
    }

    public Kello clone() {
        Kello kello = null;
        try {
            kello = (Kello)super.clone();
            kello.tunti = (Viisari) tunti.clone();
            kello.minuutti = (Viisari) minuutti.clone();
        } catch (CloneNotSupportedException e) {}
        return kello;
    }
}
