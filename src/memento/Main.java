package memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas mikko = new Asiakas("Mikko", arvuuttaja);
        Asiakas kaisa = new Asiakas("Kaisa", arvuuttaja);
        Asiakas anton = new Asiakas("Anton", arvuuttaja);

        mikko.start();
        kaisa.start();
        anton.start();
    }
}
