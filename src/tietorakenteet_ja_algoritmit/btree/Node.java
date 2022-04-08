/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tietorakenteet_ja_algoritmit.btree;

/**
 *
 * @author kamaj
 */
public class Node {
    int value;
    private String data;
    private BinaryTree left;
    private BinaryTree right;

    public Node(String value) {
        data = new String(value);
        left = right = null;
    }

    public Node (String value, BinaryTree left, BinaryTree right) {
        this.value = Integer.parseInt(value);
        data = new String(value);
        this.left = left;
        this.right = right;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public BinaryTree left() {
        return left;
    }
    public BinaryTree right() {
        return right;
    }
    public void setLeft(BinaryTree tree) {
        left = tree;
    }
    public void setRight(BinaryTree tree) {
        right = tree;
    }
}
