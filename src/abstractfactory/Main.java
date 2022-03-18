package abstractfactory;

import abstractfactory.factories.AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Class c = null;
        AbstractFactory af = null;
        Jasper jasper = new Jasper();

        System.out.println("\nJasper kertoo opiskeluaikansa:");

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./src/abstractfactory/tehdas.properties"));
        } catch (IOException e) {e.printStackTrace();}

        try {
            c = Class.forName(properties.getProperty("opiskelija"));
            af = (AbstractFactory) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {e.printStackTrace();}

        jasper.pukeutuu(af);
        jasper.luettelee();

        System.out.println("\nJasper kertoo valmistuttuaan insinööriksi:");

        try {
            c = Class.forName(properties.getProperty("insinoori"));
            af = (AbstractFactory) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {e.printStackTrace();}

        jasper.pukeutuu(af);
        jasper.luettelee();
    }
}
