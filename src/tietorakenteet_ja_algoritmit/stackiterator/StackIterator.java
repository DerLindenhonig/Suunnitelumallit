/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet_ja_algoritmit.stackiterator;

/**
 *
 * @author kamaj
 */
interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private int current;
    private Stack container; // container on tietorakenne, jota iteroidaan

    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        current = 0;
    }

    // palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
    // hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai ei.
    public boolean hasNext() {
        if (current == container.getSize())
            return false;
        else
            return true;
    }

    // palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä eteenpäin
    public String next() {
        String oldCurrent = container.getTaulu()[container.getSize()-current-1];
        current++;
        return oldCurrent;
    }
}

