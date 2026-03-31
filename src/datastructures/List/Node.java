/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.List;

/**
 *
 * @author OdeyTech
 */
public class Node {

    String data;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(String data) {
        this();
        this.data = data;
    }

    public Node(String data, Node node) {
        this.data = data;
        this.next = node;
    }
}
