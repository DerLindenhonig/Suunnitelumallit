/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tietorakenteet_ja_algoritmit.btree;

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
                BinaryTree tree = null, upDated = null;
                String data;
                do {

                        System.out.println("\n\t\t\t1. Lisää uusi juuri/solmu."); // Lisää avain
                        System.out.println("\t\t\t2. Päivitä uusi solmu.");
                        System.out.println("\t\t\t3. Käy puu läpi esijärjestyksessä.");
                        System.out.println("\t\t\t4. Etsi solmu avaimella ");
                        System.out.println("\t\t\t5. Poista solmu avaimella ");
                        System.out.println("\t\t\t6. Puun korkeus ");
                        System.out.println("\t\t\t7. Lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna juuren/solmun sisältö (merkkijono)");
                            data = new String(Lue.rivi());
                            if(tree == null) {
                                tree = new BinaryTree(data);
                            } else {
                                tree.insert(data);
                            }
                            break;
                        case '2':
                            if (tree == null)
                                System.out.println("Et ole muodostanut juurisolmua.");
                            else {
                                System.out.println("Anna solmun sisältö (merkkijono)");
                                BinaryTree newTree = new BinaryTree(new String(Lue.rivi()));

                                tree.setNotFound();
                                tree.findWithPreOrder();
                                upDated = BinaryTree.getFound();
                                if (upDated==null) // ei valittu mitään
                                    break;
                                System.out.print("Kytke vasemmalle? (k/e)");
                                select1 = Lue.merkki();
                                if (select1=='k')
                                    upDated.setLeft(newTree);
                                else {
                                    System.out.print("Kytke oikealle? (k/e)");
                                    select1 = Lue.merkki();
                                    if (select1=='k')
                                        upDated.setRight(newTree);
                                }
                            }
                            break;
                        case '3':
                            tree.preOrder();
                            char h = Lue.merkki(); // pysäytetään kontrolli
                            break;
                        case '4':
                            System.out.println("Anna solmun avain (merkkijono)");
                            data = Lue.rivi();
                            if(tree.search(Integer.parseInt(data)) != null) {
                                System.out.println("Avain " + data + " löytyy");
                            } else System.out.println("Avainta " + data + " ei löydy");
                        case '5':
                            System.out.println("Anna poistuvan solmun avain (merkkijono)");
                            data = Lue.rivi();
                            tree.delete(tree, Integer.parseInt(data));
                        case '6':
                            if(tree != null) {
                                System.out.println(tree.height(tree));
                            } else {
                                System.out.println("Puu on tyhjä");
                            }
                        case '7':
                            break;
                        }
                }
                while (select != '7');
        }
//printMenu loppuu ----------------------------------------------------------------
}

