package composite.laiteosat;

public class Naytonohjain implements Laiteosa {

    private int hinta;

    public Naytonohjain(int hinta) {
        this.hinta = hinta;
    }

    public int getHinta() {
        return hinta;
    }

    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("Cannot add a component to Näyttönohjain");
    }
}
