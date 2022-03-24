package singleton;

import singleton.factories.AbstractFactory;
import singleton.factories.AdidasFactory;
import singleton.factories.BossFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        AbstractFactory af = null;
        Jasper jasper = new Jasper();

        System.out.println("\nJasper kertoo opiskeluaikansa:");

        af = AdidasFactory.getInstance();

        jasper.pukeutuu(af);
        jasper.luettelee();

        System.out.println("\nJasper kertoo valmistuttuaan insinööriksi:");

        af = BossFactory.getInstance();

        jasper.pukeutuu(af);
        jasper.luettelee();
    }
}
