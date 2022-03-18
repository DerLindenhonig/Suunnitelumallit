package abstractfactory.factories;

import abstractfactory.adidas.AdidaksenFarmarit;
import abstractfactory.adidas.AdidaksenKengat;
import abstractfactory.adidas.AdidaksenLippis;
import abstractfactory.adidas.AdidaksenPaita;
import abstractfactory.clothes.Farmarit;
import abstractfactory.clothes.Kengat;
import abstractfactory.clothes.Lippis;
import abstractfactory.clothes.Paita;

public class AdidasFactory implements AbstractFactory {

    @Override
    public Lippis makeLippis() {
        return new AdidaksenLippis();
    }

    @Override
    public Paita makePaita() {
        return new AdidaksenPaita();
    }

    @Override
    public Farmarit makeFarmarit() {
        return new AdidaksenFarmarit();
    }

    @Override
    public Kengat makeKengat() {
        return new AdidaksenKengat();
    }
}
