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
public class Stack {

        private int size;
        private int MAX = 10;
        private String taulu[] = new String[MAX];

        public Stack() {
                size = 0;
        }

        //  palautetaan pino-iteraattori
        public StackIterator iterator() {
            return new StackIterator(this);
        }

        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                if(size < MAX) {
                        taulu[size] = aData;
                        size++;
                } else {
                        System.out.println("Pino on täynnä");
                }

        }

        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public String pop() {
                String takeAway;
                if (size <= 0) {
                        takeAway = null; // pino on tyhjä
                } else {
                        size--;
                        takeAway = taulu[size];
                }
                return takeAway;
        }

        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }

        public String[] getTaulu() {
                return taulu;
        }

        // listataan sisältö
        public void printItems() {
                if(size > 0) {
                        int printSize = size;
                        while (printSize > 0) {
                                System.out.print(taulu[printSize-1] + ", ");
                                printSize--;
                        }
                } else {
                        System.out.print("Pino on tyhjä");
                }
        }
}

