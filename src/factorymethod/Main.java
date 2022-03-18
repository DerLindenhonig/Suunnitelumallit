package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();

        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();

        AterioivaOtus huoltaja = new Huoltaja();
        huoltaja.aterioi();
    }
}
