/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tietorakenteet_ja_algoritmit.binarysearch;

/**
 *
 * @author kamaj
 */
public class Node {
    int value;
    private int data;
    private BinarySearch left;
    private BinarySearch right;

    public Node(int value) {
        data = value;
        left = right = null;
    }

    public Node (int value, BinarySearch left, BinarySearch right) {
        this.value = (value);
        data = value;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public BinarySearch left() {
        return left;
    }
    public BinarySearch right() {
        return right;
    }
    public void setLeft(BinarySearch tree) {
        left = tree;
    }
    public void setRight(BinarySearch tree) {
        right = tree;
    }
}
