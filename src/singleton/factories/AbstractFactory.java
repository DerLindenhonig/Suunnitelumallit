package singleton.factories;

import singleton.clothes.Farmarit;
import singleton.clothes.Kengat;
import singleton.clothes.Lippis;
import singleton.clothes.Paita;

public interface AbstractFactory {

    public abstract Lippis makeLippis();
    public abstract Paita makePaita();
    public abstract Kengat makeKengat();
    public abstract Farmarit makeFarmarit();
}
