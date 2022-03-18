package composite.laiteosat;

public class Verkkokortti implements Laiteosa {

    private int hinta;

    public Verkkokortti(int hinta) {
        this.hinta = hinta;
    }

    public int getHinta() {
        return hinta;
    }

    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("Cannot add a component to Verkkokortti");
    }
}
