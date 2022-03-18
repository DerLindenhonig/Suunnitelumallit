package composite;

import composite.laiteosat.*;

public class Main {

    public static void main(String[] args) {
        Laiteosa kaikkiLaiteosat = new Kotelo(50);
        Laiteosa emolevy = new Emolevy(90);
        Laiteosa muistipiiri = new Muistipiiri(50);
        Laiteosa prosessori = new Prosessori(140);
        Laiteosa naytonohjain = new Naytonohjain(250);
        Laiteosa verkkokortti = new Verkkokortti(50);

        kaikkiLaiteosat.addLaiteosa(emolevy);

        emolevy.addLaiteosa(prosessori);
        emolevy.addLaiteosa(muistipiiri);
        emolevy.addLaiteosa(naytonohjain);
        emolevy.addLaiteosa(verkkokortti);

        System.out.println("Pöytätietokonekokoonpanon hinta: " + kaikkiLaiteosat.getHinta() + " €");
    }
}
