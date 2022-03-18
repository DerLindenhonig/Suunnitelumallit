package abstractfactory.factories;

import abstractfactory.boss.BossinFarmarit;
import abstractfactory.boss.BossinKengat;
import abstractfactory.boss.BossinLippis;
import abstractfactory.boss.BossinPaita;
import abstractfactory.clothes.Farmarit;
import abstractfactory.clothes.Kengat;
import abstractfactory.clothes.Lippis;
import abstractfactory.clothes.Paita;

public class BossFactory implements AbstractFactory {

    @Override
    public Lippis makeLippis() {
        return new BossinLippis();
    }

    @Override
    public Paita makePaita() {
        return new BossinPaita();
    }

    @Override
    public Farmarit makeFarmarit() {
        return new BossinFarmarit();
    }

    @Override
    public Kengat makeKengat() {
        return new BossinKengat();
    }
}
