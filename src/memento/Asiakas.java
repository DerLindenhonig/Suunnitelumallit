package memento;

import java.util.Random;

public class Asiakas extends Thread {
    private Arvuuttaja arvuuttaja;
    private Object memento;
    private boolean oikein = false;
    private String nimi;

    public void run() {
        memento = arvuuttaja.liityPeliin();
        while (oikein == false) {
            oikein = arvaaLuku(arvuuttaja);
        }
    }

    public Asiakas(String nimi, Arvuuttaja arvuuttaja) {
        this.nimi = nimi;
        this.arvuuttaja = arvuuttaja;
    }

    public String getNimi() {
        return nimi;
    }

    public synchronized boolean arvaaLuku(Arvuuttaja arvuuttaja) {
        Random rand = new Random();
        int luku = rand.nextInt(9) + 1;

        if(arvuuttaja.tarkistaaLuku(memento, luku)) {
            System.out.println(nimi + " arvasit oikein! Luku oli " + luku);
            return true;
        } else {
            System.out.println(nimi + " arvasit väärin! Luku ei ole " + luku);
            return false;
        }
    }
}
