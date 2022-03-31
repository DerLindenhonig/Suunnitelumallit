/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tietorakenteet_ja_algoritmit.btree;

/**
 *  Binääripuu on järjestetty puumainen tietorakenne.
 *  Jokaisella solmulla (node) voi olla enintään kaksi lapsisolmua.
 *  Lapsisolmuja kutsutaan nimillä vasen ja oikea.
 *  Solmua, jolla ei ole yhtään lapsisolmua kutsutaan lehdeksi (leave).
 *
 *  Käytetään etsimiseen (searching) ja lajitteluun (sorting),
 *  koska ne tarjoavat keinon tallentaa tietoja hierarkkisesti.
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;
    public static BinaryTree found; // findWithPreOrder()-operaation apurakenne
    private int key;

    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }

    public BinaryTree search(int key) {
        if(root == null)
            return null;

        if(Integer.parseInt(root.getData()) == key) {
            return new BinaryTree(root.getData());

        } else if(Integer.parseInt(root.getData()) < key) {
            if(root.left() == null) {
                return null;
            } else return root.left().search(key);

        } else if(Integer.parseInt(root.getData()) >= key) {
            if(root.right() == null) {
                return null;
            } else return root.right().search(key);
        }

        return null;
    }

    public void insert(String key) {
        if(root == null) {
            root = new Node(key);
        }

        if(Integer.parseInt(key) < Integer.parseInt(root.getData())) {
            if(root.left() != null) {
                root.left().insert(key);
            } else {
                root.setLeft(new BinaryTree(key));
            }
        } else if(Integer.parseInt(key) >= Integer.parseInt(root.getData())) {
            if(root.right() != null) {
                root.right().insert(key);
            } else {
                root.setRight(new BinaryTree(key));
            }
        }
    }

    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }
    }

    // löydetty alipuu asetetaan staattiseen muuttujaan found
    public void findWithPreOrder() {

        if (root != null) {
            System.out.print(root.getData()+ ": muokkaatko tätä? (k/e)");
            if (root.left()== null)
                System.out.print(" (vasemmalla tilaa)");
            if (root.right() == null)
                System.out.println(" (oikealla tilaa)");
            char select = Lue.merkki();
            if (select =='k') {
                found = this;
                return;
            }
            if (found==null && root.left() != null) // pääseekö vasemmalle?
                root.left().findWithPreOrder();
            if (found== null && root.right() != null) // pääseekö oikealle?
                root.right().findWithPreOrder();
        }
    }

    public void setNotFound() {
        found = null;
    }

    public static BinaryTree getFound() {
        return found;
    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}