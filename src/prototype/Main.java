package prototype;

public class Main {
    public static void main(String[] args) {
        Kello kello = new Kello(0, 0);
        Kello kello2 = kello.clone();

        System.out.println("\nAlkuperäinen kellonaika:    " + kello.getTunti().getAika() + " : " + kello.getMinuutti().getAika());
        System.out.println("Kloonin kellonaika:         " + kello2.getTunti().getAika() + " : " + kello2.getMinuutti().getAika());

        kello2.getTunti().setAika(5);
        kello2.getMinuutti().setAika(15);

        System.out.println("\nAlkuperäinen kellonaika:    " + kello.getTunti().getAika() + " : " + kello.getMinuutti().getAika());
        System.out.println("Kloonin kellonaika:         " + kello2.getTunti().getAika() + " : " + kello2.getMinuutti().getAika());

        kello.getTunti().setAika(2);
        kello.getMinuutti().setAika(30);

        System.out.println("\nAlkuperäinen kellonaika:    " + kello.getTunti().getAika() + " : " + kello.getMinuutti().getAika());
        System.out.println("Kloonin kellonaika:         " + kello2.getTunti().getAika() + " : " + kello2.getMinuutti().getAika());
    }
}
