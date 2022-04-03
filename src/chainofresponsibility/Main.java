package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Lahiesimies lahiesimies = new Lahiesimies();
        Paallikko paallikko = new Paallikko();
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();

        lahiesimies.setSuccessor(paallikko);
        paallikko.setSuccessor(toimitusjohtaja);

        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Syötä prosentti tarkistaaksesi, kenen tulee hyväksyä palkankorotuspyynnöt.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new
                        InputStreamReader(System.in)).readLine());
                lahiesimies.processRequest(new Palkankorotuspyynto(d, "General"));
            }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}
