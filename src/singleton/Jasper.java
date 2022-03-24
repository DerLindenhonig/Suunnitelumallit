package singleton;

import singleton.clothes.Farmarit;
import singleton.clothes.Kengat;
import singleton.clothes.Lippis;
import singleton.clothes.Paita;
import singleton.factories.AbstractFactory;

public class Jasper {
    private Farmarit farmarit;
    private Paita paita;
    private Lippis lippis;
    private Kengat kengat;

    public void pukeutuu(AbstractFactory af) {
        farmarit = af.makeFarmarit();
        paita = af.makePaita();
        lippis = af.makeLippis();
        kengat = af.makeKengat();
    }

    public void luettelee() {
        System.out.println("Minulla on päällään: " + lippis + ", " + paita + ", " + farmarit + ", " + kengat + ".");
    }
}
