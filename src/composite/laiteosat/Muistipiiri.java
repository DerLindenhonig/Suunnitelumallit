package composite.laiteosat;

public class Muistipiiri implements Laiteosa {

    private int hinta;

    public Muistipiiri(int hinta) {
        this.hinta = hinta;
    }

    public int getHinta() {
        return hinta;
    }

    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("Cannot add a component to Muistipiiri");
    }
}
