/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tietorakenteet_ja_algoritmit.binarysearch;

/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) {

                        printMenu();

        }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
        private static void printMenu() {
                char select, select1;
                BinarySearch tree = null, upDated = null;
                String data;
                int nodes[] = {};
                do {
                        System.out.println("\n\t\t\t1. Lisää uusi juuri/solmu."); // Lisää avain
                        System.out.println("\t\t\t2. Tulosta solmut suuruusjärjestyksessä.");
                        System.out.println("\t\t\t3. Etsi solmu avaimella ");
                        System.out.println("\t\t\t4. Lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna juuren/solmun sisältö (merkkijono)");
                            data = new String(Lue.rivi());
                            tree = new BinarySearch(nodes);
                            nodes = tree.insert(Integer.parseInt(data));
                            break;
                        case '2':
                            tree.tulosta();
                            break;
                        case '3':
                            System.out.println("Anna solmun avain (merkkijono)");
                            data = Lue.rivi();
                            tree.search(Integer.parseInt(data));
                            break;
                        case '4':
                            break;
                        }
                }
                while (select != '4');
        }
//printMenu loppuu ----------------------------------------------------------------
}

