package singleton.factories;

import singleton.boss.BossinFarmarit;
import singleton.boss.BossinKengat;
import singleton.boss.BossinLippis;
import singleton.boss.BossinPaita;
import singleton.clothes.Farmarit;
import singleton.clothes.Kengat;
import singleton.clothes.Lippis;
import singleton.clothes.Paita;

public class BossFactory implements AbstractFactory {

    private volatile static BossFactory instance;

    private BossFactory() {}

    public static BossFactory getInstance() {
        if (instance == null) {
            synchronized (BossFactory.class) {
                if (instance == null) {
                    instance = new BossFactory();
                }
            }
        }
        return instance;
    }

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
