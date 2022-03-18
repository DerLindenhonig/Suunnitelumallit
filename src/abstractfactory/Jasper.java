package abstractfactory;

import abstractfactory.clothes.Farmarit;
import abstractfactory.clothes.Kengat;
import abstractfactory.clothes.Lippis;
import abstractfactory.clothes.Paita;
import abstractfactory.factories.AbstractFactory;

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
