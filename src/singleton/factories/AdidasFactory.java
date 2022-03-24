package singleton.factories;

import singleton.adidas.AdidaksenFarmarit;
import singleton.adidas.AdidaksenKengat;
import singleton.adidas.AdidaksenLippis;
import singleton.adidas.AdidaksenPaita;
import singleton.clothes.Farmarit;
import singleton.clothes.Kengat;
import singleton.clothes.Lippis;
import singleton.clothes.Paita;

public class AdidasFactory implements AbstractFactory {

    private volatile static AdidasFactory instance;

    private AdidasFactory() {}

    public static AdidasFactory getInstance() {
        if (instance == null) {
            synchronized (AdidasFactory.class) {
                if (instance == null) {
                    instance = new AdidasFactory();
                }
            }
        }
        return instance;
    }

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
