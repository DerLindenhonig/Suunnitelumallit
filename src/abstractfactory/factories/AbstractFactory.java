package abstractfactory.factories;

import abstractfactory.clothes.Farmarit;
import abstractfactory.clothes.Kengat;
import abstractfactory.clothes.Lippis;
import abstractfactory.clothes.Paita;

public interface AbstractFactory {

    public abstract Lippis makeLippis();
    public abstract Paita makePaita();
    public abstract Kengat makeKengat();
    public abstract Farmarit makeFarmarit();
}
