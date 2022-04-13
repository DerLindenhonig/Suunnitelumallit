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

        } else if(Integer.parseInt(root.getData()) > key) {
            if(root.left() == null) {
                return null;
            } else return root.left().search(key);

        } else if(Integer.parseInt(root.getData()) < key) {
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
        } else if(Integer.parseInt(key) > Integer.parseInt(root.getData())) {
            if(root.right() != null) {
                root.right().insert(key);
            } else {
                root.setRight(new BinaryTree(key));
            }
        }
    }

    public BinaryTree delete(BinaryTree temp, int key) {
        /* Tree is empty */
        if(temp == null)
            return null;
        /* Moves left */
        if(Integer.parseInt(temp.root.getData()) > key) {
            temp.root.left().delete(temp.root.left(), key);
        }
        /* Moves right */
        else if(Integer.parseInt(temp.root.getData()) < key) {
            temp.root.right().delete(temp.root.right(), key);
        }
        /* Found the target */
        else {
            /* Remove leave from the tree */
            if(temp.root.left() == null && temp.root.right() == null) {
                temp.root = null;
            }
            /* The node has two children */
            else if(temp.root.left() != null && temp.root.right() != null) {
                BinaryTree predecessor = Predecessor(temp);
                temp.root.setData(predecessor.root.getData());
                temp.setLeft(delete(temp.root.left(), Integer.parseInt(predecessor.root.getData())));
            }
            /* The node has one child */
            else {
                BinaryTree btr;
                if(temp.root.left() != null) {
                    btr = temp.root.left();
                } else {
                    btr = temp.root.right();
                }
                temp.root = btr.root;
            }
        }
        return null;
    }

    public BinaryTree Predecessor(BinaryTree temp) {
        return maxValue(temp.root.left());
    }

    public BinaryTree maxValue(BinaryTree btree){
        if(btree.root.right() != null){
            btree = btree.root.right();
        }
        return btree;
    }

    public int height(BinaryTree temp) {
        if (temp.root == null) {
            return 0;
        } else {
            int leftHeight = 0, rightHeight = 0;

            if(temp.root.left() != null) {
                leftHeight = height(temp.root.left());
            } else {
                leftHeight = 0;
            }

            if(temp.root.right() != null) {
                rightHeight = height(temp.root.right());
            } else {
                rightHeight = 0;
            }

            int h = (leftHeight > rightHeight) ? leftHeight : rightHeight;

            return (h + 1);
        }
    }

    public void preOrder() {
        if (root != null) {
            System.out.print(root.getData()+',');
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
