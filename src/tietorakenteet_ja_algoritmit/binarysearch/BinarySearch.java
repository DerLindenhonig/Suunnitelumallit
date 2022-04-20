/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tietorakenteet_ja_algoritmit.binarysearch;

import java.util.Arrays;

/**
 *
 * @author kamaj
 */
public class BinarySearch {
    private int nodes[];
    private int length;

    public BinarySearch(int nodes[]) {
        this.nodes = nodes;
        this.length = nodes.length;
    }

    public void tulosta() {
        System.out.println(Arrays.toString(nodes));
    }

    public int[] insert(int data) {
        if (search(data) != true) {
            System.out.println("Lisätään " + data + " tauluun.");
            insertAlgorithm(nodes.length, data);
            return nodes;
        } else {
            System.out.println(data + " ei ollut lisätty tauluun.");
        }
        return nodes;
    }

    private int[] insertAlgorithm(int nodesCount, int data) {
        // Tehdään nodes-taulun kopio
        int nodesCopy[] = Arrays.copyOf(nodes, length + 1);

        // Kopioidaan alkiot, jotka tulevat lisätyn alkion jälkeen
        int i;
        for (i = nodesCount - 1; (i >= 0 && nodesCopy[i] > data); i--) {
            nodesCopy[i + 1] = nodesCopy[i];
        }

        // Sijoitetaan alkio
        nodesCopy[i + 1] = data;
        nodes = nodesCopy;
        return nodes;
    }

    public boolean search(int data) {
        // Jos taulu on tyhjä
        if (nodes.length < 1) {
            return false;
        } else if (nodes.length > 1) {
            int node = searchAlgorithm(nodes, data, 0, nodes.length - 1);
            if (node == -1) {
                System.out.println("Node " + data + " ei löydy taulusta.");
                return false;
            } else {
                System.out.println("Node löytyy taulusta " + node + " indeksillä.");
                return true;
            }
        }
        return false;
    }

    private int searchAlgorithm(int[] nodes, int key, int first, int last) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            // Alkio löytyy keskeltä
            if (nodes[mid] == key)
                return mid;

            // Alkio on < avain, alkio löytyy vasemmalta
            if (nodes[mid] > key)
                return searchAlgorithm(nodes, key, first, mid - 1);

            // Alkio on > avain, alkio löytyy oikealta
            return searchAlgorithm(nodes, key, mid + 1, last);
        }
        return -1;
    }
}